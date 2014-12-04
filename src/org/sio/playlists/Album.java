package org.sio.playlists;

import java.util.ArrayList;
import java.util.List;

public class Album {
	private String nom;
	private Genre genre;
	private List<Chanson> chansons;
	
	public Album(){
		this.nom = new String("Inconnu");
		this.chansons = new ArrayList<Chanson>();
		this.genre = new Genre("Inconnu");
	}
	
	public Album(String pNom){
		this();
		this.nom = pNom;
	}
	
	public Album(String pNom, String pGenre){
		this();
		this.nom = pNom;
		this.genre = new Genre(pGenre);
	}
	
	public void setNom(String pNom){
		this.nom = pNom;
	}
	
	public void setGenre(Genre pGenre){
		this.genre = pGenre;
	}
	
	public void setChansons(List<Chanson> pChansons){
		this.chansons.clear();
		this.chansons.addAll(pChansons);
	}
	
	public String getNom(){
		return this.nom;
	}
	
	public Genre getGenre(){
		return this.genre;
	}
	
	public List<Chanson> getChansons(){
		return this.chansons;
	}
	
	public void ajoutChanson(Chanson pChanson){
		if (pChanson.getNumero() == 0){
			pChanson.setNumero(this.chansons.size() + 1);
		}
		if (!this.exists(pChanson)){
			this.chansons.add(pChanson);
		}
	}
	
	public void supprimeChanson(Chanson pChanson){
		
	}
	
	private boolean exists(Chanson pChanson){
		boolean trouve = false;
		int i = 0;
		while (i < this.getNbChansons() - 1 && !trouve){
			trouve = this.chansons.get(i).equals(pChanson);
			i++;
		}
		return trouve;
	}
	
	public int getNbChansons(){
		return this.chansons.size();
	}
	
	
	public Chanson rechercheChanson(String pTitre){
		return new Chanson();
	}
	
	public String toString(){
		String retVal = new String("\t" + this.nom + "\n");
		for (Chanson chanson : this.chansons){
			retVal += chanson;
		}
		return retVal;
	}
}
