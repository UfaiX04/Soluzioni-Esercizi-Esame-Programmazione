class Pietra extends Prezioso {
    private int carati;

    public Pietra(int peso, int carati) {
        super(peso);

        if (carati <= 0) {
            throw new IllegalArgumentException("Il numero di carati della pietra deve essere un intero positivo.");
        }

        this.carati = carati;
    }

    public int getCarati() {
        return carati;
    }
}
