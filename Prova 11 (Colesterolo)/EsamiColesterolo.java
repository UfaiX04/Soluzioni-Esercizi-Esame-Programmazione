public class EsamiColesterolo {
    private EsameColesterolo[] esami;
    private int count;

    public EsamiColesterolo(int maxMisurazioni) {
        if (maxMisurazioni < 0) {
            throw new IllegalArgumentException("Max misurazioni cannot be negative");
        }
        this.esami = new EsameColesterolo[maxMisurazioni];
        this.count = 0;
    }

    public boolean add(EsameColesterolo m) {
        if (count >= esami.length) {
            return false;
        }
        esami[count++] = m;
        return true;
    }

    public int trigliceridiMassimo() {
        if (count == 0) {
            throw new IllegalStateException("No esami added");
        }
        int max = esami[0].getTrigliceridi();
        for (int i = 1; i < count; i++) {
            max = Math.max(max, esami[i].getTrigliceridi());
        }
        return max;
    }

    public double intervallo() {
        if (count == 0) {
            throw new IllegalStateException("No esami added");
        }
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += esami[i].getLdl() - esami[i].getHdl();
        }
        return sum / count;
    }
}