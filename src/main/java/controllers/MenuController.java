package controllers;

import java.io.IOException;

import javafx.application.Platform;
import javafx.fxml.FXML;

public class MenuController {

    @FXML
    private void switchToRules() throws IOException {
        App.setRoot("rules");
    }

    @FXML
    private void switchToGameSelect() throws IOException {
        App.setRoot("gameselect");
    }

    @FXML
    private void exitApplication() throws IOException {
        Platform.exit();
    }
}
