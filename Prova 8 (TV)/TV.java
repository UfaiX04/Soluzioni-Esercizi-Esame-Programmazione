/**
 * Questa classe rappresenta una TV generica.
 */
public abstract class TV {
    private int numeroPollici;
    private String nomeModello;

    /**
     * Costruttore della classe TV.
     * 
     * @param numeroPollici Il numero di pollici dello schermo della TV.
     * @param nomeModello   Il nome del modello della TV.
     */
    public TV(int numeroPollici, String nomeModello) {
        this.numeroPollici = numeroPollici;
        this.nomeModello = nomeModello;
    }

    /**
     * Restituisce il numero di pollici dello schermo della TV.
     * 
     * @return Il numero di pollici dello schermo della TV.
     */
    public int getNumeroPollici() {
        return numeroPollici;
    }

    /**
     * Imposta il numero di pollici dello schermo della TV.
     * 
     * @param numeroPollici Il numero di pollici dello schermo della TV.
     */
    public void setNumeroPollici(int numeroPollici) {
        this.numeroPollici = numeroPollici;
    }

    /**
     * Restituisce il nome del modello della TV.
     * 
     * @return Il nome del modello della TV.
     */
    public String getNomeModello() {
        return nomeModello;
    }

    /**
     * Imposta il nome del modello della TV.
     * 
     * @param nomeModello Il nome del modello della TV.
     */
    public void setNomeModello(String nomeModello) {
        this.nomeModello = nomeModello;
    }
}
