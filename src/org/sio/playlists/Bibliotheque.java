package org.sio.playlists;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
	public List<Artiste> artistes;
	
	public Bibliotheque(){
		this.artistes = new ArrayList<Artiste>();
	}
	
	public void ajoutArtiste(Artiste pArtiste){
		this.artistes.add(pArtiste);
	}
	
	public List<Artiste> rechercheArtiste(String pCritere){
		List<Artiste> retVal = new ArrayList<Artiste>();
		for (Artiste artiste : this.artistes){
			if (artiste.nom.equals(pCritere)){
				retVal.add(artiste);
			}
		}
		return retVal;
	}
	
	public List<Album> rechercheAlbum(String pCritere){
		List<Album> retVal = new ArrayList<Album>();
		
		return retVal;
	}

	public List<Chanson> rechercheChanson(String pCritere){
		List<Chanson> retVal = new ArrayList<Chanson>();
		
		return retVal;
	}	
	
	public String toString(){
		String retVal = new String();
		for (Artiste artiste : this.artistes){
			retVal += artiste;
		}
		return retVal;
	}
}
