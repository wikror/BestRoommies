package app.controllers;

import app.classes.Chore;
import app.classes.Inmate;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;

/**
 * Created by wikto on 23.06.2017.
 */
public class ChoresListScreenController extends ListScreenController<Chore> {

    public TableColumn<Chore, String> choreExpenseColumn = new TableColumn<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        userColumn.setCellValueFactory(new PropertyValueFactory<>("user"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        choreExpenseColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        choresExpensesTable.setItems(updateTable());
    }

    public ChoresListScreenController() {
//        updateTable();
    }

    public ObservableList<Chore> updateTable() {
        //todo commented code should get stuff from db
//        List<Expense> downloadedList = ExpenseService.getInstance().findAll();
//        ObservableList<Expense> list = FXCollections.observableArrayList(downloadedList);
        ObservableList<Chore> list = FXCollections.observableArrayList();
        list.add(new Chore());
        System.out.println(list);
//        list.add(new Chore(new Inmate(), new Date()));
//        choresExpensesTable.setItems(list);
        return list;
    }
}
