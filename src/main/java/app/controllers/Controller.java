package app.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public abstract class Controller {

    @FXML
    public AnchorPane mainPane;
    @FXML
    public MenuBar menuBar;


    /* Switching between controllers and screens */
    void switchToLoginScreen() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("loginScreen.fxml"));
        Stage stage = (Stage) mainPane.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    void switchToCreateAccountScreen() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("createAccountScreen.fxml"));
        Stage stage = (Stage) mainPane.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    void switchToChoresListScreen() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("choresListScreen.fxml"));
        Stage stage = (Stage) mainPane.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    void switchToExpensesListScreen() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("expensesListScreen.fxml"));
        Stage stage = (Stage) mainPane.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    void switchToAddNewScreen() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("addNewScreen.fxml"));
        Stage stage = (Stage) mainPane.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

}
