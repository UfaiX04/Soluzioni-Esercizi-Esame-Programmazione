public class Panasonic extends TV {
    private int canali;
    private String risoluzione;

    public Panasonic(int canali) throws Exception {
        if (canali < 12 || canali > 100) {
            throw new Exception("Canali non validi");
        }
    }

    public void setRisoluzione(String risoluzione) {
        this.risoluzione = risoluzione;
    }

    public String getRisoluzione() {
        return risoluzione;
    }

    public void setCanali(int canali, int frequenza) throws Exception {
        throw new Exception("Canali non validi");
        
    }

    public int getCanali() {
        return canali;
    }
}
