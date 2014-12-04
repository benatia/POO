package org.sio.classe;

public class Classe {
	Personne[] eleves = new Personne[7];
	
	public void trie(){
		Personne tampon;
		boolean echange;
		do{
			echange = false;
			for (int i = 0; i < this.eleves.length - 1; i++){
				if (this.eleves[i].compareTo(this.eleves[i + 1]) > 0){
					tampon = this.eleves[i + 1];
					this.eleves[i + 1] = this.eleves[i];
					this.eleves[i] = tampon;
					echange = true;
				}
			}
		}while (echange);
	}
	
	@Override
	public String toString() {
		String retVal = "";
		for (Personne pers : eleves){
			retVal += pers + "\n";
		}
		return retVal;
	};
}
