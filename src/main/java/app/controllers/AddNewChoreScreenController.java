package app.controllers;

import app.classes.ChoresTypes;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Tooltip;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

/**
 * Created by wikto on 23.06.2017.
 */
public class AddNewChoreScreenController extends AddNewScreenController implements Initializable{

    public ChoiceBox<ChoresTypes> choreChoiceBox;
    public Button addChoreButton;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<ChoresTypes> choreTypeslist = FXCollections.observableArrayList(Arrays.asList(ChoresTypes.values()));
        choreChoiceBox.setItems(choreTypeslist);
        choreChoiceBox.setTooltip(new Tooltip("Select chore type"));
    }

    public void addChore(ActionEvent actionEvent) {
        //todo adding chore logic here
//        ChoresServie(Context.getCurrentUser(), (ChoresTypes) choreChoiceBox.getValue(), datePicker.getValue());
    }

}
