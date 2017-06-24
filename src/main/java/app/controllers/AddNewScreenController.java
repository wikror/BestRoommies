package app.controllers;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;

/**
 * Created by wikto on 23.06.2017.
 */
public abstract class AddNewScreenController extends Controller {

    public DatePicker datePicker;
    public Button returnButton;

    public void returnToPreviousScreen(ActionEvent actionEvent) {
        try {
            switchToChoresListScreen();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
