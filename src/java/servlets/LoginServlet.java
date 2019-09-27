package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.*;

/**
 *
 * @author 794471
 */
public class LoginServlet extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String str = request.getParameter("logout");
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("homeUser");
           
        if(str == null)
        {
            if(username != null)
            {
                response.sendRedirect("home"); 
            }
            else
            {
                getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
                    .forward(request, response);
            }
        }
        else if(str.equals(""))
        {
            session.invalidate();
            
            request.setAttribute("error", "You have successfully logged out.");
            
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
                .forward(request, response);
        }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        
        AccountService as = new AccountService();
        User checkUse = as.login(user, pass);
        
        if(checkUse == null)
        {
            request.setAttribute("error", "Invalid Credentials");
            
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
                .forward(request, response);
        }
        else
        {
            HttpSession session = request.getSession();
            session.setAttribute("homeUser", checkUse.getUsername());
            
            response.sendRedirect("home");                
        }
    }

    
    
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() 
    {
        return "Short description";
    }
}
