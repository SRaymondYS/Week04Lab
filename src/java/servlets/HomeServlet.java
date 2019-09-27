package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 794471
 */
public class HomeServlet extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        HttpSession session = request.getSession();
        String display = (String) session.getAttribute("homeUser");
        
        request.setAttribute("showUser", display);
        
        if(display == null)
        {
            response.sendRedirect("login");
        }
        else
        {
            getServletContext().getRequestDispatcher("/WEB-INF/home.jsp")
                .forward(request, response);
        } 
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        
    }

    
    
    @Override
    public String getServletInfo() 
    {
        return "Short description";
    }

}
