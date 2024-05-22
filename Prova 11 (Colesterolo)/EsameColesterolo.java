public class EsameColesterolo {
    private long data;
    private int hdl;
    private int ldl;
    private int trigliceridi;

    public EsameColesterolo(long data, int hdl, int ldl, int trigliceridi) {
        if (data < 0) {
            throw new IllegalArgumentException("Data cannot be negative");
        }
        if (hdl <= 0 || hdl >= 500) {
            throw new IllegalArgumentException("HDL must be positive and less than 500");
        }
        if (ldl <= 0 || ldl >= 500) {
            throw new IllegalArgumentException("LDL must be positive and less than 500");
        }
        if (hdl >= ldl) {
            throw new IllegalArgumentException("HDL must be less than LDL");
        }
        if (trigliceridi <= 0 || trigliceridi > 600) {
            throw new IllegalArgumentException("Trigliceridi must be positive and less than or equal to 600");
        }
        this.data = data;
        this.hdl = hdl;
        this.ldl = ldl;
        this.trigliceridi = trigliceridi;
    }

    public int getTrigliceridi() {
        return trigliceridi;
    }

    public int getHdl() {
        return hdl;
    }

    public int getLdl() {
        return ldl;
    }

    public long getData() {
        return data;
    }
}