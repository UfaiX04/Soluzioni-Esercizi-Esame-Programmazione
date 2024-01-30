package studenti;

public class Studente {
	private String nome;
	private String cognome;
	private int matricola;
	private Esame[] elencoEsami;
	private int esamiInseriti;
	private int sommaCFU;
	
	public Studente(String nome, String cognome, int matricola) throws Exception {
		if (matricola>0) {
			this.nome = nome;
			this.cognome = cognome;
			this.matricola= matricola;
			esamiInseriti = 0;
			elencoEsami = new Esame[30];
			sommaCFU = 0;
		} else {
			throw new Exception();
		}
	}
	
	public void aggiungiEsame(Esame esame) throws Exception {
		if (esamiInseriti<30 && (sommaCFU+esame.getCfu())<=180) {
			elencoEsami[esamiInseriti]=esame;
			esamiInseriti++;
			sommaCFU += esame.getCfu();
		} else {
			throw new Exception();
		}
	}
	
	@Override
	public String toString() {
		String str = "Nome: "+nome+" Cognome: "+" matricola: "+matricola+"\nElenco esami sostenuti:\n";
		for (int i = 0; i < esamiInseriti; i++) {
			if (elencoEsami[i].getVoto()>=18) {
				str+=elencoEsami[i].toString()+"\n";
			}			
		} 
		return str;
	}
}
