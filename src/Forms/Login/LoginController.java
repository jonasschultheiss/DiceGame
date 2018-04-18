package Forms.Login;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

public class LoginController
{
    public JFXButton btnLoginCreateAccount = null;
    public JFXButton btnDevLogin = null;
    public JFXTextField textfUsername = null;
    public JFXPasswordField textfPassword = null;

    public LoginController()
    {
        // Check if Users Exist
        IsUserexisting();
    }

    private void IsUserexisting()
    {
    }
}