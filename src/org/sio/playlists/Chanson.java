package org.sio.playlists;

public class Chanson {
	private String titre;
	private int duree, numero;

	public Chanson(){
		this.titre = new String("");
		this.duree = 0;
		this.numero = 0;
	}
	
	public Chanson(String pTitre, int pDuree){
		this();
		this.setTitre(pTitre);
		this.setDuree(pDuree);
	}
	
	public Chanson(int pNumero, String pTitre, int pDuree){
		this.titre = new String(pTitre);
		this.duree = Math.abs(pDuree);
		this.numero = pNumero;
	}

	public int getDuree() {
		return duree;
	}

	public int getNumero() {
		return numero;
	}
	
	public String getTitre() {
		return titre;
	}
	
	public void setDuree(int pDuree) {
		try{
			this.duree = Math.abs(pDuree);
		}catch (Exception ex){
			this.duree = 0;
		}
	}
	
	public void setNumero(int pNumero) {
		try{
			this.numero = Math.abs(pNumero);
		}catch (Exception ex){
			this.numero = 0;
		}
	}
	
	public void setTitre(String pTitre) {
		this.titre = pTitre;
	}
	
	public void lire() {
		System.out.println(this.titre + "(" + this.duree + ") en cours ...");
	}

	public boolean equals(Object obj){
		/**
		 * @author 	michel
		 * @param	Obj	Référence à l'object à comparer
		 * @return	true si cet objet est identique à l'objet en argument,
		 * 			false sinon.
		 */
		return (this.titre == ((Chanson) obj).titre && this.duree == ((Chanson) obj).duree);
	}
	
	public String toString(){
		return "\t\tPiste " + String.valueOf(this.numero) + " : " + this.titre + " (" + String.valueOf(this.duree) + " sec.)\n";
	}
}
