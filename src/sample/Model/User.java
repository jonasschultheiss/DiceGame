package sample.Model;

import java.util.ArrayList;

public class User
{
    public String Name;
    public String Password;
    ArrayList<Match> Matches;

    public User()
    {
        this.Name = "";
        this.Password = "";
        this.Matches = new ArrayList<Match>();
    }

    public User(String _name, String _password)
    {
        this.Name = _name;
        this.Password = _password;
        this.Matches = new ArrayList<Match>();
    }

    public User(String _name, String _password, ArrayList<Match> _matches)
    {
        this.Name = _name;
        this.Password = _password;
        this.Matches = _matches;
    }
}
