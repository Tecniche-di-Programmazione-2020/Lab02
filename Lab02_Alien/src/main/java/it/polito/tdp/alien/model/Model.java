package it.polito.tdp.alien.model;

import java.util.LinkedHashMap;
import java.util.LinkedList;

import java.util.Map;

public class Model {
	private Map<String, LinkedList<String>> dizionario;

	public Model() {
		dizionario = new LinkedHashMap<String, LinkedList<String>>();
	}

	public String input(String input) {
		
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
			return null;

		default:
			return "-2";

		}

	}

	private void nuovaParola(String testo, String traduzione) {
		
		LinkedList<String> lista=dizionario.get(testo);
		
		if(lista==null) {lista=new LinkedList<String>();lista.add(traduzione);dizionario.put(testo,lista);}
		else {
			lista.add(traduzione);
			dizionario.replace(testo, lista);
		}
		
	}

	private String ricerca(String testo) {
		
		String traduzione="";
		
		if(dizionario.get(testo)==null)return null;
		
		for(String s:dizionario.get(testo)) {
			traduzione=traduzione+s+"\n";
			
		}
		
		return traduzione;
	}

	public void reset() {
		dizionario.clear();

	}

}
