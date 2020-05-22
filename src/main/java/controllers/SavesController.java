package controllers;

import javafx.fxml.FXML;

import java.io.IOException;

public class SavesController {

    @FXML
    public void switchToGameSelect() throws IOException {
        App.setRoot("gameselect");
    }
}
