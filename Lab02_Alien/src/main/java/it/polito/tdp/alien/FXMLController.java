package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.alien.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

	private Model model;

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
		this.model.reset();
		outputText.clear();

	}

	@FXML
	void doTranslate(ActionEvent event) {
		String response, input;
		input = inputText.getText();

		response = model.input(input);

		if (response == null) {
			outputText.setText("Non trovato");
		} else if (response.equals("-2")) {
			outputText.setText("Errore");
		} else if (response.equals("-1")) {
			outputText.setText("Caratteri non ammessi");

		} else
			outputText.setText("Traduzione: " + response);

	}

	@FXML
	void initialize() {
		assert inputText != null : "fx:id=\"inputText\" was not injected: check your FXML file 'Scene.fxml'.";
		assert outputText != null : "fx:id=\"outputText\" was not injected: check your FXML file 'Scene.fxml'.";
		// dizionario= new DizionarioAlieno();
		outputText.setText("Benvenuto nel traduttore alieno");
	}

	public void setModel(Model model) {
		this.model = model;
	}
}
