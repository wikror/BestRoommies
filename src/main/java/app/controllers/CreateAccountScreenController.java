package app.controllers;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * Created by wikto on 23.06.2017.
 */
public class CreateAccountScreenController extends Controller {
    public Button returnToSignInButton;
    public Button createAccountButton;
    public TextField userIDField;
    public PasswordField passwordField;
    public PasswordField confirmPasswordField;

    public void returnToLoginScreen(ActionEvent actionEvent) {
        try {
            switchToLoginScreen();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createAccount(ActionEvent actionEvent) {
        //todo create account logic here
        try {
            switchToLoginScreen();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
