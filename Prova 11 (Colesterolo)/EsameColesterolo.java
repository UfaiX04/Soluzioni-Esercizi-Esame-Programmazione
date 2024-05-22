/**
 * Questa classe rappresenta un esame del colesterolo.
 */
public class EsameColesterolo {
    private long data;
    private int hdl;
    private int ldl;
    private int trigliceridi;

    /**
     * Costruisce un nuovo oggetto EsameColesterolo con i dati forniti.
     * @param data la data dell'esame in formato UNIX TIME.
     * @param hdl il valore di HDL dell'esame.
     * @param ldl il valore di LDL dell'esame.
     * @param trigliceridi il valore dei trigliceridi dell'esame.
     * @throws IllegalArgumentException se i valori forniti non sono validi.
     */
    public EsameColesterolo(long data, int hdl, int ldl, int trigliceridi) {
        if (data < 0) {
            throw new IllegalArgumentException("Data non può essere negativa");
        }
        if (hdl <= 0 || hdl >= 500) {
            throw new IllegalArgumentException("HDL deve essere positivo e minore di 500");
        }
        if (ldl <= 0 || ldl >= 500) {
            throw new IllegalArgumentException("LDL deve essere positivo e minore di 500");
        }
        if (hdl >= ldl) {
            throw new IllegalArgumentException("HDL deve essere minore di LDL");
        }
        if (trigliceridi <= 0 || trigliceridi > 600) {
            throw new IllegalArgumentException("Trigliceridi devono essere positivi e minori o uguali a 600");
        }
        this.data = data;
        this.hdl = hdl;
        this.ldl = ldl;
        this.trigliceridi = trigliceridi;
    }

    /**
     * Restituisce il valore dei trigliceridi dell'esame.
     * @return il valore dei trigliceridi.
     */
    public int getTrigliceridi() {
        return trigliceridi;
    }

    /**
     * Restituisce il valore di HDL dell'esame.
     * @return il valore di HDL.
     */
    public int getHdl() {
        return hdl;
    }

    /**
     * Restituisce il valore di LDL dell'esame.
     * @return il valore di LDL.
     */
    public int getLdl() {
        return ldl;
    }

    /**
     * Restituisce la data dell'esame.
     * @return la data dell'esame in formato UNIX TIME.
     */
    public long getData() {
        return data;
    }
}