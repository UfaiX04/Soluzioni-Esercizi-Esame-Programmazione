public class Appuntamento {
    private String nome;
    private int giorno;
    private int ora;

    // Costruttore di default che crea un appuntamento
    public Appuntamento(String nome, int giorno, int ora) throws Exception {
        // Controlla se i parametri sono validi
        if (nome == null || nome.equals("")) {
            throw new RuntimeException("Nome non valido");
        } else {
            this.nome = nome;
        }

        // Controlla se i parametri sono validi
        if (giorno <= 1 || giorno > 365) {
            throw new IllegalArgumentException("Giorno non valido");
        } else {
            this.giorno = giorno;
        }
        
        // Controlla se i parametri sono validi
        if (ora < 0 || ora > 23) {
            throw new IllegalArgumentException("Ora non valida");
        } else {
            this.ora = ora;
        }
    }

    // Restituisce il nome dell'appuntamento
    public String getNome() {
        return nome;
    }

    // Restituisce il giorno dell'appuntamento
    public int getGiorno() {
        return giorno;
    }

    // Restituisce l'ora dell'appuntamento
    public int getOra() {
        return ora;
    }

    // Restituisce il numero di ore dall'inizio dell'anno
    public int crono() {
        return (giorno - 1) * 24 + ora;
    }
}