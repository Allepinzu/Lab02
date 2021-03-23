package it.polito.tdp.alien.model;

import java.util.LinkedList;

public class WordEn {
String nome;
private LinkedList <String> lista;

public WordEn(String nome) {
	super();
	this.nome = nome;
	lista=new LinkedList<String>();
}

public void addWord(String s1){
	lista.add(s1);
	
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public LinkedList<String> getLista() {
	return lista;
}

public void setLista(LinkedList<String> lista) {
	this.lista = lista;
}


}
