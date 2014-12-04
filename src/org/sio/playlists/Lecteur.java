package org.sio.playlists;

public class Lecteur {
	public static void initBibliotheque(Bibliotheque pBiblio){
		//Initialisation de ma bibliotheque
		Artiste newArtiste = new Artiste("Tiken Jah Fakoly");
		Album newAlbum = new Album("Françafrique", "Reggae");
		newAlbum.ajoutChanson(new Chanson("Françafrique", 263));
		newAlbum.ajoutChanson(new Chanson("On a tout compris", 253));
		newAlbum.ajoutChanson(new Chanson("Justice Feat Uroy", 221));
		newAlbum.ajoutChanson(new Chanson("Sangourouba", 274));
		newAlbum.ajoutChanson(new Chanson("Y'en a marre", 232));
		newAlbum.ajoutChanson(new Chanson("Le Balayeur", 248));
		newAlbum.ajoutChanson(new Chanson("Nazara", 267));
		newAlbum.ajoutChanson(new Chanson("Missiri", 250));
		newAlbum.ajoutChanson(new Chanson("Africa", 286));
		newAlbum.ajoutChanson(new Chanson("Le Pays Va Mal", 255));
		newAlbum.ajoutChanson(new Chanson("Politiciens", 298));
		newAlbum.ajoutChanson(new Chanson("Africa", 286));
		newAlbum.ajoutChanson(new Chanson("Délivrance", 231));
		
		newArtiste.ajoutAlbum(newAlbum);
				
		pBiblio.ajoutArtiste(newArtiste);		
	}
	
	public static void main(String[] args) {
		Bibliotheque maBiblio = new Bibliotheque();
		initBibliotheque(maBiblio);
		
		System.out.println(maBiblio);
	}
}
