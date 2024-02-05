/**
 * La classe Treno rappresenta un treno composto da una serie di vagoni.
 */
public class Treno{
    private int maxVagoni;
    private Vagone[] vagoni;

    /**
     * Costruttore della classe Treno.
     * 
     * @param maxVagoni il numero massimo di vagoni che il treno può contenere
     * @throws Exception se il numero massimo di vagoni è inferiore a 1
     */
    public Treno(int maxVagoni) throws Exception{
        if(maxVagoni < 1) throw new IllegalArgumentException("Numero di vagoni massimi errato");
        else this.maxVagoni = maxVagoni;
        this.vagoni = new Vagone[maxVagoni];
    }

    public int indiceVagoni = 0;

    /**
     * Aggiunge un vagone al treno.
     * 
     * @param v il vagone da aggiungere
     * @return true se il vagone è stato aggiunto con successo, false altrimenti
     */
    public boolean add(Vagone v) {
        if(maxVagoni > indiceVagoni) {
            vagoni[indiceVagoni++] = v;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Verifica se il treno è bilanciato in base al numero di cavalli e al peso dei vagoni.
     * 
     * @return true se il numero di cavalli è maggiore del peso totale dei vagoni, false altrimenti
     */
    public boolean check() {
        int accCavalli = 0;
        int accPeso = 0;

        for(int i = 0; i<vagoni.length; i++) {
            accCavalli = accCavalli + ((Locomotiva) vagoni[i]).getCavalli();
        }

        for(int i = 0; i<vagoni.length; i++) {
            accPeso = accPeso + vagoni[i].getPeso();
        }

        if(accCavalli > accPeso) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Calcola il numero totale di posti disponibili nel treno.
     * 
     * @return il numero totale di posti disponibili nel treno
     */
    public int posti() {
        int acc = 0;

        for(int i = 0; i<vagoni.length; i++) {
            acc = acc + ((Carrozza)vagoni[i]).getPosti();
        }

        return acc;
    }

    public int passeggeri() {
        int acc = 0;

        for(int i = 0; i < vagoni.length; i++) {
            if(vagoni[i] instanceof Carrozza) {
                acc += ((Carrozza) vagoni[i]).getPosti();
            }
        }

        return acc;
    }
}