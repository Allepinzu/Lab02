package it.polito.tdp.alien.model;

import java.util.Collection;
import java.util.TreeMap;

public class Traduttore {
	private TreeMap<String,WordEn> parole =new TreeMap <String,WordEn>();
	
	public void aggiungi(String s1, String s2) {
		if(parole.containsKey(s1))
			parole.get(s1).addWord(s2);
		else {
		WordEn w1=	new WordEn(s2);
		parole.put(s1, w1);
		parole.get(s1).addWord(s1);}
		
	}
	
	public Collection<String> traduci(String s1) {
		if(parole.containsKey(s1))
			return parole.get(s1).getLista();
		return null;
	}
}
