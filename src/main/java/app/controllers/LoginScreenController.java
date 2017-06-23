package app.controllers;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * Created by wikto on 23.06.2017.
 */
public class LoginScreenController extends Controller {

    public Button signInButton;
    public Button createAccountButton;

    public PasswordField passwordField;
    public TextField userIDField;

    public void signIn(ActionEvent actionEvent) {
        //todo login logic here
        try {
            switchToChoresListScreen();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createAccount(ActionEvent actionEvent) {
        try {
            switchToCreateAccountScreen();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
