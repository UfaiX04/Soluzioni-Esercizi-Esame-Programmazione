public class Canali {
    private int canali, frequenza;

    public Canali(int canali) throws Exception {
        if (canali < 12 || canali > 100) {
            throw new Exception("Canali non validi");
        }
    }

    public void setCanali(int canali, int frequenza) {
        this.canali = canali;
    }

    public int getCanali() {
        return canali;
    }

    public void setFrequenza(int canali, int frequenza) {
        this.frequenza = frequenza;
    }

    public int getFrequenza() {
        return frequenza;
    }
}
