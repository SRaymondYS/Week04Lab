package models;

/**
 *
 * @author 794471
 */
public class AccountService 
{
    public User login(String username, String password)
    {
        User u ; 
        
        if(username.equals("adam") && password.equals("password"))
        {
            u = new User(username, null);
        }
        else if(username.equals("betty") && password.equals("password"))
        {
            u = new User(username, null);
        }
        else
        {
            u = null;
        }
        
        return u;
    }
}
