package app.controllers;

import app.classes.Inmate;
import app.persistence.PersitenceUtils;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javax.persistence.EntityManager;
import java.util.List;

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
        stage.setScene(new Scene(root, 600, 600));
        stage.show();
    }

    void switchToExpensesListScreen() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("expensesListScreen.fxml"));
        Stage stage = (Stage) mainPane.getScene().getWindow();
        stage.setScene(new Scene(root, 600, 600));
        stage.show();
    }

    void switchToAddNewChoreScreen() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("addNewChoreScreen.fxml"));
        Stage stage = (Stage) mainPane.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    void switchToAddNewExpenseScreen() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("addNewExpenseScreen.fxml"));
        Stage stage = (Stage) mainPane.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    void switchToStatisticsScreen() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("statisticsScreen.fxml"));
        Stage stage = (Stage) mainPane.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    void switchToPreviousScreen() throws Exception {
        //todo saving current screen before switching?
    }

}
