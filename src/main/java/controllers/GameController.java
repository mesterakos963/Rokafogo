package controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import model.Game;

public class GameController {

    @FXML
    private GridPane gridPane;

    @FXML
    private Pane blackPane;

    @FXML
    private Pane whitePane;

    private final Game game = new Game();

    public void initGame () {
        System.out.println("GOMB");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (game.table[i][j] == 1) {
                    gridPane.add(new Pane(blackPane), i, j);
                    blackPane.setStyle("-fx-background-color: #C0C0C0");
                }
            }
        }
    }
}

