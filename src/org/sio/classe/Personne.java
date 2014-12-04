package org.sio.classe;

public class Personne {
	public String nom, prenom;
	
	public Personne(){
		this.nom = "";
		this.prenom = "";
	}
	
	public Personne(String pNom, String pPrenom){
		this.nom = pNom;
		this.prenom = pPrenom;
	}
	
	@Override
	public String toString(){
		return nom + " " + prenom;
	}
	
	@Override
	public boolean equals(Object obj) {
		Personne pers = (Personne) obj;
		return this.nom.equals(pers.nom) && this.prenom.equals(pers.prenom);
	}
	
	public int compareTo(Personne pers){
		int retVal = 0;
		if (!this.equals(pers)){
			if (this.nom == pers.nom){
				retVal = this.prenom.compareTo(pers.prenom); 
			}else{
				retVal = this.nom.compareTo(pers.nom);
			}
		}
		return retVal;
	}
}
