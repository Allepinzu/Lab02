package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.TreeMap;

import it.polito.tdp.alien.model.Traduttore;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	

	Traduttore model;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnTranslate;

    @FXML
    private TextArea txtArea;

    @FXML
    private Button btnClear;

    @FXML
    void doClear(ActionEvent event) {

    }

    @FXML
    void doTranslate(ActionEvent event) {

    
    	String s[]=this.txtParola.getText().split(" ");
    	if(s.length==2)
    		model.aggiungi(s[0], s[1]);
    	if(s.length==1) {
    		this.txtArea.clear();
    		for(String s1: model.traduci(s[0]))
    		this.txtArea.appendText(s1+"\n");}
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtArea != null : "fx:id=\"txtArea\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'Scene.fxml'.";

    }

	public void setModel(Traduttore model2) {
		// TODO Auto-generated method stub
		this.model=model2;
	}
}
