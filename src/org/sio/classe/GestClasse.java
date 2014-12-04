package org.sio.classe;

public class GestClasse {

	public static void main(String[] args) {
		Classe maClasse = new Classe();
		maClasse.eleves[0] = new Personne();
		maClasse.eleves[1] = new Personne();
		maClasse.eleves[2] = new Personne();
		maClasse.eleves[3] = new Personne();
		maClasse.eleves[4] = new Personne();
		maClasse.eleves[5] = new Personne();
		maClasse.eleves[6] = new Personne();
		
		maClasse.eleves[0].nom = "XU";
		maClasse.eleves[0].prenom = "Peter";
		maClasse.eleves[1].nom = "CLEMENCEAU";
		maClasse.eleves[1].prenom = "Franck";
		maClasse.eleves[2].nom = "BERTIN";
		maClasse.eleves[2].prenom = "Alexandre";
		maClasse.eleves[3].nom = "MAHE";
		maClasse.eleves[3].prenom = "Gwenaël";
		maClasse.eleves[4].nom = "FORT";
		maClasse.eleves[4].prenom = "Pierre-alexandre";
		maClasse.eleves[5].nom = "CRASBERCU";
		maClasse.eleves[5].prenom = "Damien";
		maClasse.eleves[6].nom = "LEBARBIER";
		maClasse.eleves[6].prenom = "Guillaume";
		
		maClasse.trie();
		
		System.out.println(maClasse);
	}

}
