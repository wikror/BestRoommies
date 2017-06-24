package app.controllers;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;

/**
 * Created by wikto on 24.06.2017.
 */
public class StatisticsScreenController extends Controller {
    public Tab choresStatisticsTab;
    public Tab expensesStatistcsTab;
    public Button returnButton;

    public void returnToPreviousScreen(ActionEvent actionEvent) {
        try {
            switchToChoresListScreen();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
