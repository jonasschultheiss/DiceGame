package sample.Model;

import java.util.ArrayList;

public class User
{
    public int ID;
    public String Name;
    public String Password;
    ArrayList<Match> Matches;

    public User()
    {
        this.ID = 0;
        this.Name = "";
        this.Password = "";
        this.Matches = new ArrayList<Match>();
    }

    public User(int _id, String _name, String _password, ArrayList<Match> _matches)
    {
        this.ID = _id;
        this.Name = _name;
        this.Password = _password;
        this.Matches = _matches;
    }
}
