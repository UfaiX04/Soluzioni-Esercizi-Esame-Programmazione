/**
 * La classe Appuntamento rappresenta un appuntamento.
 * Memorizza il nome, il giorno e l'ora dell'appuntamento.
 */
public class Appuntamento {
    private String nome;
    private int giorno;
    private int ora;

    /**
     * Costruisce un oggetto Appuntamento con il nome, il giorno e l'ora specificati.
     * 
     * @param nome  il nome dell'appuntamento
     * @param giorno  il giorno dell'appuntamento (compreso tra 1 e 365)
     * @param ora  l'ora dell'appuntamento (compresa tra 0 e 23)
     * @throws RuntimeException se il nome è null, il giorno non è compreso tra 1 e 365 o l'ora non è compresa tra 0 e 23
     */
    public Appuntamento(String nome, int giorno, int ora) {
        if (nome == null) {
            throw new RuntimeException("Il nome non può essere null");
        }
        if (giorno < 1 || giorno > 365) {
            throw new RuntimeException("Il giorno deve essere compreso tra 1 e 365");
        }
        if (ora < 0 || ora > 23) {
            throw new RuntimeException("L'ora deve essere compresa tra 0 e 23");
        }
        this.nome = nome;
        this.giorno = giorno;
        this.ora = ora;
    }

    /**
     * Restituisce il nome dell'appuntamento.
     * 
     * @return il nome dell'appuntamento
     */
    public String getNome() {
        return nome;
    }

    /**
     * Restituisce il giorno dell'appuntamento.
     * 
     * @return il giorno dell'appuntamento
     */
    public int getGiorno() {
        return giorno;
    }

    /**
     * Restituisce l'ora dell'appuntamento.
     * 
     * @return l'ora dell'appuntamento
     */
    public int getOra() {
        return ora;
    }

    /**
     * Calcola e restituisce il numero totale di ore trascorse dall'inizio dell'anno fino all'appuntamento.
     * 
     * @return il numero totale di ore trascorse dall'inizio dell'anno fino all'appuntamento
     */
    public int crono() {
        return (giorno - 1) * 24 + ora;
    }
}
