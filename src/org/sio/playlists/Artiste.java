package org.sio.playlists;

import java.util.ArrayList;
import java.util.List;

public class Artiste {
	public String nom, prenom;
	public List<Album> albums;
	
	public Artiste(){
		this.nom = new String("Inconnu");
		this.prenom = new String("Inconnu");
		this.albums = new ArrayList<Album>();
	}
	
	public Artiste(String pNom){
		this();
		this.nom = pNom;
	}

	public Artiste(String pNom, String pPrenom){
		this();
		this.nom = pNom;
		this.prenom = pPrenom;
	}
	
	public void ajoutAlbum(Album pAlbum){
		this.albums.add(pAlbum);
	}
	
	public void supprimeAlbum(Album pAlbum){
		
	}
	
	public ArrayList<Album> rechercheAlbum(String pNom){
		return new ArrayList<Album>();
	}
	
	public ArrayList<Chanson> rechercheChanson(String pTitre){
		return new ArrayList<Chanson>();
	}
	
	public String toString(){
		String retVal = new String(this.nom + "\n");
		for (Album album : this.albums){
			retVal += album;
		}
		return retVal;
	}
}
