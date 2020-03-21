package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField inputText;

    @FXML
    private TextArea outputText;

    @FXML
    void doClearText(ActionEvent event) {

    }

    @FXML
    void doTranslate(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert inputText != null : "fx:id=\"inputText\" was not injected: check your FXML file 'Scene.fxml'.";
        assert outputText != null : "fx:id=\"outputText\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
