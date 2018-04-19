package sample.Model;

public class Settings
{
    public float OddsOfOne;
    public float OddsOfTwo;
    public float OddsOfThree;
    public float OddsOfFour;
    public float OddsOfFive;
    public float OddsOfSix;
    public User LoggedInUser;
    public User SecondUser;

    public Settings()
    {
        this.OddsOfOne = 16.6f;
        this.OddsOfTwo = 16.6f;
        this.OddsOfThree = 16.6f;
        this.OddsOfFour = 16.6f;
        this.OddsOfFive = 16.6f;
        this.OddsOfSix = 16.6f;
        this.LoggedInUser = new User();
        this.SecondUser = new User();
    }

    public Settings(float one, float two, float three, float four, float five, float six, User _loggedInUser,
                    User _secondUser)
    {
        this.OddsOfOne = one;
        this.OddsOfTwo = two;
        this.OddsOfThree = three;
        this.OddsOfFour = four;
        this.OddsOfFive = five;
        this.OddsOfSix = six;
        this.LoggedInUser = _loggedInUser;
        this.SecondUser = _secondUser;
    }

    public void LoginMainUser(User mainUser, User secondUser)
    {
        this.LoggedInUser = mainUser;
        this.SecondUser = secondUser;
    }

    public void ResetOdds()
    {
        this.OddsOfOne = 16.6f;
        this.OddsOfTwo = 16.6f;
        this.OddsOfThree = 16.6f;
        this.OddsOfFour = 16.6f;
        this.OddsOfFive = 16.6f;
        this.OddsOfSix = 16.6f;
    }
}
