package sample.Model;

import com.sun.xml.internal.ws.developer.Serialization;

import java.util.ArrayList;

public class UserDBO
{

    public ArrayList<User> UserList;

    public UserDBO()
    {
        this.UserList = new ArrayList<User>();
    }

    public UserDBO(ArrayList<User> _userList)
    {
        this.UserList = _userList;
    }



    public User GetUser(String _name)
    {
        for (User user : this.UserList)
        {
            if (user.Name == _name)
            {
                return user;
            }
        }
        return new User();
    }

    public boolean DoesPasswordMatch(String _name, String _password)
    {
        boolean isPasswordRight = false;
        for (User user : this.UserList)
        {
            if (user.Name.equals(_name))
            {
                if (user.Password.equals(_password))
                {
                    isPasswordRight = true;
                }
            }
        }

        return isPasswordRight;
    }

    public boolean DoesUserExist(String _name)
    {
        boolean IsUserExisting = false;
        for (User user : this.UserList)
        {
            if (user.Name.equals(_name))
            {
                IsUserExisting = true;
            }
        }

        return IsUserExisting;
    }
}
