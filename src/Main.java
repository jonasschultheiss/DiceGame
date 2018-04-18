import javafx.application.Application;

public class Main
{
    private static FormHandler controller;

    public static void main(String[] args)
    {
        Start();
    }

    private static void Start()
    {
        LoadSettings();
        FormHandler formHandler = new FormHandler();
        formHandler.StartLogin();
    }

    private static void LoadSettings()
    {

    }
}
