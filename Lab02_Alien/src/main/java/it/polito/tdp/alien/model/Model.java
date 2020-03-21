package it.polito.tdp.alien.model;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Model {
	private Map<String, List<String>> dizionario;

	public Model() {
		dizionario = new LinkedHashMap<String, List<String>>();
	}

	public String input(String input) {
		String temp = "";
		String[] inputSplitted = input.split("\\s+");

		if (!inputSplitted[0].matches("[a-z]*")) {
			return "-1";
		}

		switch (inputSplitted.length) {
		case 2:
			this.nuovaParola(inputSplitted[0], inputSplitted[1]);
			return "Aggiunta";

		case 1:
			return ricerca(inputSplitted[0]);

		case 0:
			return temp;

		default:
			return "-2";

		}

	}

	private void nuovaParola(String testo, String traduzione) {
		
		List<String> temp=dizionario.get(testo);
		if(temp==null) {temp=new LinkedList<String>();}
		temp.add(traduzione);
		dizionario.replace(testo, temp);
	}

	private String ricerca(String testo) {
		String traduzione="";
		List<String> temp=dizionario.get(testo);
		for(String s:temp) {
		traduzione=traduzione+s+"\n";	
		}
		 
		return "casa";
	}

	public void reset() {
		dizionario.clear();

	}

}
