package studenti;

public class Main {
	public static void main(String[] args) throws Exception {
		Studente s = new Studente("Francesco", "Tiezzi", 123456);
		
		Esame e1 = new Esame("Programmazione", 12);
		Esame e2 = new Esame("Analisi", 6);
		
		s.aggiungiEsame(e1);
		s.aggiungiEsame(e2);
		
		e1.esameSostenuto(30, 20210913);
		e2.esameSostenuto(19, 20210913);
		
		System.out.println(s);
	}
}
