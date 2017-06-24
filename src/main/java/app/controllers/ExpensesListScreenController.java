package app.controllers;

import app.classes.Expense;
import app.classes.Inmate;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.SortedList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created by wikto on 23.06.2017.
 */
public class ExpensesListScreenController extends ListScreenController<Expense> {

    public TableColumn<Expense, Float> choreExpenseColumn = new TableColumn<Expense, Float>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        userColumn.setCellValueFactory(new PropertyValueFactory<>("user"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        choreExpenseColumn.setCellValueFactory(new PropertyValueFactory<>("value"));

    }

    public ExpensesListScreenController() {
        updateTable();
    }

    public ObservableList<Expense> updateTable() {
        //todo commented code should get stuff from db
//        List<Expense> downloadedList = ExpenseService.getInstance().findAll();
//        ObservableList<Expense> list = FXCollections.observableArrayList(downloadedList);
        ObservableList<Expense> list = FXCollections.observableArrayList();
//        choresExpensesTable.setItems(list);
        return list;
    }

}
