/**
 * La classe Panasonic rappresenta una TV della marca Panasonic.
 * Estende la classe TV e aggiunge funzionalità specifiche come il numero di canali e la risoluzione.
 */
public class Panasonic extends TV {
    private int numberOfChannels;
    private String resolution;

    /**
     * Costruisce un oggetto Panasonic con le specifiche dimensioni, modello, numero di canali e risoluzione.
     * @param inches le dimensioni in pollici della TV
     * @param model il modello della TV
     * @param numberOfChannels il numero di canali della TV
     * @param resolution la risoluzione della TV
     * @throws IllegalArgumentException se il numero di canali è minore o uguale a 12
     */
    public Panasonic(int inches, String model, int numberOfChannels, String resolution) {
        super(inches, model);
        if (numberOfChannels > 12) {
            this.numberOfChannels = numberOfChannels;
        } else {
            throw new IllegalArgumentException("Il numero di canali deve essere maggiore di 12");
        }
        this.resolution = resolution;
    }

    /**
     * Imposta il canale e la frequenza della TV.
     * @param channel il numero del canale
     * @param frequency la frequenza del canale
     * @throws IllegalArgumentException se il canale è minore o uguale a 0 o se la frequenza non è compresa tra 550 e 790
     */
    public void setCanale(int channel, int frequency) {
        if (channel > 0 && frequency >= 550 && frequency <= 790) {
            this.numberOfChannels = channel;
        } else {
            throw new IllegalArgumentException("Canale o frequenza non validi");
        }
    }

    /**
     * Restituisce il numero di canali della TV.
     * @return il numero di canali
     */
    public int getNumerodiCanali() {
        return numberOfChannels;
    }

    /**
     * Restituisce la risoluzione della TV.
     * @return la risoluzione
     */
    public String getResolution() {
        return resolution;
    }
}
