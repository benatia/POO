package org.sio.playlists;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
	/**
	 * Génération d'une playlist à partir d'une bibliothèque
	 * 
	 */
	
	public List<Chanson> chansons;
	public boolean aleatoire;
	
	public Playlist() {
		this.chansons = new ArrayList<Chanson>();
		this.aleatoire = false;
	}
	
	public void AjoutAlbum(Album pAlbum){
		this.chansons.addAll(pAlbum.getChansons());
	}

	public void AjoutArtiste(Artiste pArtiste){
		for (Album album : pArtiste.albums){
			this.AjoutAlbum(album);
		}
	}
	
	public void AjoutChanson(Chanson pChanson){
		this.chansons.add(pChanson);
	}
	
	public void Lire() throws InterruptedException{
		if (this.aleatoire){
			//Lecture des titres de manière aléatoire
		}else{
			//Lecture séquentielle
			for (Chanson chanson : this.chansons){
				chanson.lire();
			}
		}
	}
}
