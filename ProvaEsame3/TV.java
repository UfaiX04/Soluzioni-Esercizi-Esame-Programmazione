public class TV {
    private int pollici, volume, canale;
    private String modello;

    public TV(int pollici, String modello) {
        this.pollici = pollici;
        this.modello = modello;
        this.volume = 0;
        this.canale = 1;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setCanale(int canale) {
        this.canale = canale;
    }

    public int getVolume() {
        return volume;
    }

    public int getCanale() {
        return canale;
    }
}