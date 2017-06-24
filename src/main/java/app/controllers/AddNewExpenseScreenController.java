package app.controllers;

import app.classes.Expense;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * Created by wikto on 24.06.2017.
 */
public class AddNewExpenseScreenController extends AddNewScreenController {
    public TextField expenseField;
    public Button addExpenseButton;

    public void addExpense(ActionEvent actionEvent) {
        //todo expense adding logic here
//        ExpenseService.add(new Expense(Context.getCurrentUser, expenseField.getText(), datePicker.getValue()));
    }
}
