package app.controllers;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * Created by wikto on 23.06.2017.
 */
public abstract class ListScreenController extends Controller {

    public TableView choresExpensesTable;
    public TableColumn userColumn;
    public TableColumn dateColumn;
    public TableColumn choreExpenseColumn;
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

    public abstract void updateTable();
}
