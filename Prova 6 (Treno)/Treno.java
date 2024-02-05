/**
 * La classe Treno rappresenta un treno composto da vagoni.
 */
public class Treno {
    private int maxVag;
    private int pesoT;
    private int cavalliT;
    private int postiT;
    private Vagone[] vagone;

    /**
     * Costruisce un oggetto Treno con il numero massimo di vagoni specificato.
     * 
     * @param maxVag il numero massimo di vagoni del treno
     * @throws IllegalArgumentException se il numero massimo di vagoni è inferiore a 1
     */
    public Treno(int maxVag) {
        if (maxVag < 1) {
            throw new IllegalArgumentException("Treno inesistente.");
        }
        this.maxVag = maxVag;
        this.pesoT = 0;
        this.cavalliT = 0;
        this.postiT = 0;
        this.vagone = new Vagone[maxVag];
    }

    /**
     * Aggiunge un vagone al treno.
     * 
     * @param x il vagone da aggiungere
     * @return true se il vagone è stato aggiunto con successo, false altrimenti
     */
    public boolean add(Vagone x) {
        for (int i = 0; i < maxVag; i++) {
            if (vagone[i] == null) {
                vagone[i] = x;
                pesoT += x.getPeso();
                if (x instanceof Locomotiva) {
                    cavalliT += ((Locomotiva) x).getCavalli();
                }
                if (x instanceof Carrozza) {
                    postiT += ((Carrozza) x).getPosti();
                }
                return true;
            }
        }
        return false;
    }

    /**
     * Verifica se il treno è bilanciato in base al numero di cavalli e al peso totale.
     * 
     * @return true se il treno è bilanciato, false altrimenti
     */
    public boolean check() {
        return cavalliT >= pesoT;
    }

    /**
     * Restituisce il numero totale di passeggeri presenti nel treno.
     * 
     * @return il numero totale di passeggeri nel treno
     */
    public int passeggeri() {
        return postiT;
    }
}