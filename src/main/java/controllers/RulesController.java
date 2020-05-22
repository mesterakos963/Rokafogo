package controllers;

import java.io.IOException;
import javafx.fxml.FXML;

public class RulesController {

    @FXML
    private void switchToMenu() throws IOException {
        App.setRoot("menu");
    }
}