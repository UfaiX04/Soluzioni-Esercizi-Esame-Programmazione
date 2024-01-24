/**
 * Questa classe rappresenta un pianeta.
 */
public class Pianeta {
    private String nome;
    private double massa;
    private double distanza;
    /**
     * Costruisce un nuovo oggetto Pianeta con il nome, la massa e la distanza forniti.
     * 
     * @param nome     il nome del pianeta
     * @param massa    la massa del pianeta
     * @param distanza la distanza del pianeta dal sole
     * @throws RuntimeException se il nome è nullo o la massa o la distanza sono negative
     */
    public Pianeta(String nome, double massa, double distanza) {
        if (nome == null || nome.isEmpty()) {
            throw new RuntimeException("Nome non valido");
        }

        this.nome = nome;
        this.massa = massa;
        this.distanza = distanza;

        if (this.massa < 0 || this.distanza < 0) {
            throw new RuntimeException("Argomenti non validi");
        }
    }

    /**
     * Restituisce il nome del pianeta.
     * 
     * @return il nome del pianeta
     */
    public String getNome() {
        return nome;
    }

    /**
     * Restituisce la massa del pianeta.
     * 
     * @return la massa del pianeta
     */
    public double getMassa() {
        return massa;
    }

    /**
     * Restituisce la distanza del pianeta dal sole.
     * 
     * @return la distanza del pianeta dal sole
     */
    public double getDistanza() {
        return distanza;
    }
}
