// Definisco la classe Artista con gli attributi richiesti
public class Artista {
    // Dichiaro le variabili di istanza
    private String nome;
    private String cognome;
    private String nomeArte;
    private String genereMusicale;
    private boolean gruppo;

    // Definisco il costruttore di Artista con i parametri corrispondenti
    public Artista(String nome, String cognome, String nomeArte, String genereMusicale, boolean gruppo) {
        // Controllo che i parametri non siano nulli o stringhe minori di due caratteri
        if (nome == null || nome.length() < 2 || cognome == null || cognome.length() < 2 || nomeArte == null || nomeArte.length() < 2 || genereMusicale == null || genereMusicale.length() < 2) {
            // Se lo sono, lancio un'eccezione di tipo RuntimeException
            throw new RuntimeException("Dati in ingresso non validi");
        }
        // Altrimenti, assegno i valori ai campi
        this.nome = nome;
        this.cognome = cognome;
        this.nomeArte = nomeArte;
        this.genereMusicale = genereMusicale;
        this.gruppo = gruppo;
    }

    // Definisco i metodi getter per accedere ai valori degli attributi
    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNomeArte() {
        return nomeArte;
    }

    public String getGenereMusicale() {
        return genereMusicale;
    }

    public boolean isGruppo() {
        return gruppo;
    }
}