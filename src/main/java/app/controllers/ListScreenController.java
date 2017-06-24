package app.controllers;

import app.classes.Inmate;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.util.Date;

/**
 * Created by wikto on 23.06.2017.
 */
public abstract class ListScreenController<T> extends Controller implements Initializable {

    public TableView<T> choresExpensesTable = new TableView<T>();
    public TableColumn<T, Inmate> userColumn = new TableColumn<T, Inmate>();
    public TableColumn<T, Date> dateColumn = new TableColumn<T, Date>();
    public Button addNewChoreButton;
    public Button viewExpensesChoresButton;
    public Button addNewExpenseButton;
    public Button viewStatisticsButton;


    public void addNewChore(ActionEvent actionEvent) {
        try {
            switchToAddNewChoreScreen();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewExpenses(ActionEvent actionEvent) {
        try {
            switchToExpensesListScreen();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewChores(ActionEvent actionEvent) {
        try {
            switchToChoresListScreen();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addNewExpense(ActionEvent actionEvent) {
        try {
            switchToAddNewExpenseScreen();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewStatistics(ActionEvent actionEvent) {
        try {
            switchToStatisticsScreen();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public abstract ObservableList<T> updateTable();
}
