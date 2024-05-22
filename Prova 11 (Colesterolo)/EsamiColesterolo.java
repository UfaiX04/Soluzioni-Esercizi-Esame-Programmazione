/**
 * Questa classe rappresenta una collezione di esami del colesterolo.
 */
public class EsamiColesterolo {
    private EsameColesterolo[] esami;
    private int count;

    /**
     * Costruisce un nuovo oggetto EsamiColesterolo che può contenere un numero massimo specificato di esami.
     * @param maxMisurazioni il numero massimo di esami che possono essere memorizzati.
     * @throws IllegalArgumentException se maxMisurazioni è negativo.
     */
    public EsamiColesterolo(int maxMisurazioni) {
        if (maxMisurazioni < 0) {
            throw new IllegalArgumentException("Max misurazioni non può essere negativo");
        }
        this.esami = new EsameColesterolo[maxMisurazioni];
        this.count = 0;
    }

    /**
     * Aggiunge un nuovo esame del colesterolo alla collezione.
     * @param m l'esame da aggiungere.
     * @return true se l'esame è stato aggiunto con successo, false altrimenti.
     */
    public boolean add(EsameColesterolo m) {
        if (count >= esami.length) {
            return false;
        }
        esami[count++] = m;
        return true;
    }

    /**
     * Calcola il valore massimo dei trigliceridi tra gli esami memorizzati.
     * @return il valore massimo dei trigliceridi.
     * @throws IllegalStateException se non sono stati aggiunti esami.
     */
    public int trigliceridiMassimo() {
        if (count == 0) {
            throw new IllegalStateException("Nessun esame aggiunto");
        }
        int max = esami[0].getTrigliceridi();
        for (int i = 1; i < count; i++) {
            max = Math.max(max, esami[i].getTrigliceridi());
        }
        return max;
    }

    /**
     * Calcola la differenza media tra LDL e HDL tra gli esami memorizzati.
     * @return la differenza media.
     * @throws IllegalStateException se non sono stati aggiunti esami.
     */
    public double intervallo() {
        if (count == 0) {
            throw new IllegalStateException("Nessun esame aggiunto");
        }
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += esami[i].getLdl() - esami[i].getHdl();
        }
        return sum / count;
    }
}