package controllers;

import javafx.fxml.FXML;

import java.io.IOException;

public class GameSelectController {

    @FXML
    public void switchToMenu() throws IOException {
        App.setRoot("menu");
    }

    @FXML
    public void switchToSaves() throws IOException {
        App.setRoot("saves");
    }
}
