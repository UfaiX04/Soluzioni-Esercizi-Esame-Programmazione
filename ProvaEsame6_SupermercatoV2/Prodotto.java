/**
 * La classe Prodotto rappresenta un prodotto all'interno di un supermercato.
 * Ogni prodotto ha un codice, un nome, un prezzo e una quantità disponibile.
 */
public class Prodotto {
    int codice, quantità;
    String nome;
    double prezzo;

    /**
     * Costruttore della classe Prodotto.
     * 
     * @param codice il codice del prodotto
     * @param nome il nome del prodotto
     * @param prezzo il prezzo del prodotto
     * @param quantità la quantità disponibile del prodotto
     * @throws IllegalArgumentException se la quantità è inferiore a 1 o il prezzo è inferiore a 0.1
     */
    public Prodotto(int codice, String nome, double prezzo, int quantità) {
        if(quantità < 1 || prezzo < 0.1) throw new IllegalArgumentException("I valori non possono essere negativi");
        this.codice = codice;
        this.nome = nome;
        this.prezzo = prezzo;
        this.quantità = quantità;
    }

    /**
     * Aggiunge la quantità di un nuovo prodotto a quello corrente se hanno lo stesso codice.
     * 
     * @param p il prodotto da aggiungere
     * @return true se il prodotto è stato aggiunto correttamente, false altrimenti
     */
    boolean nuovoProdotto(Prodotto p) {
        if(p == null) return false;
        if(p.codice == codice) {
            quantità += p.quantità;
            return true;
        }
        return false;
    }

    /**
     * Rimuove una quantità di prodotto specificata dal codice del prodotto corrente.
     * 
     * @param codice il codice del prodotto da rimuovere
     * @return true se il prodotto è stato rimosso correttamente, false altrimenti
     */
    boolean rimozioneProdotto(int codice) {
        if(codice == this.codice) {
            quantità--;
            return true;
        }
        return false;
    }

    /**
     * Restituisce la quantità disponibile del prodotto corrente.
     * 
     * @param codice il codice del prodotto
     * @return la quantità disponibile del prodotto, -1 se il codice non corrisponde
     */
    int quantitàProdotto(int codice) {
        if(codice == this.codice) return quantità;
        return -1;
    }

    /**
     * Restituisce il prodotto con il prezzo maggiore tra il prodotto corrente e quello passato come parametro.
     * 
     * @param p il prodotto con cui confrontare il prodotto corrente
     * @return il prodotto con il prezzo maggiore, null se il prodotto passato è null
     */
    Prodotto getMaxProdotto(Prodotto p) {
        if(p == null) return null;
        if(p.prezzo > prezzo) return p;
        return this;
    }
}
