package studenti;

public class Esame {
	private String nome;
	private int cfu; 
	private int voto;
	private int data;
	
	public Esame(String nome, int cfu) throws Exception {
		if (cfu>=1 && cfu<=18) {
			this.nome = nome;
			this.cfu = cfu;
		} else {
			throw new Exception();
		}		
	}
	
	public void esameSostenuto(int voto, int data) throws Exception {
		if (voto>=0 && voto<=31 && data > 20200000) {
			this.voto = voto;
			this.data= data;
		} else {
			throw new Exception();
		}
	}
	
	public int getCfu() {
		return cfu;
	}
	
	public int getVoto() {
		return voto;
	}
	
	@Override
	public String toString() {
		return "Nome: "+nome+" cfu:"+cfu+" voto:"+voto+" data:"+data;
	}
}
