package Models;

public class User
{
    public String Username;
    public String HashedPassword;
    public String Surname;
    public String Lastname;
    public int MatchesPlayed;
    public int MatchesWon;

    // Default constructor
    public User()
    {
        this.Username = "";
        this.HashedPassword = "";
        this.Surname = "";
        this.Lastname = "";
        this.MatchesPlayed = 0;
        this.MatchesWon = 0;
    }


}
