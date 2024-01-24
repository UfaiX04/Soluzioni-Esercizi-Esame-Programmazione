class Oro extends Prezioso {
    private int carati;

    public Oro(int peso, int carati) {
        super(peso);

        if (carati < 8 || carati > 14) {
            throw new IllegalArgumentException("Il numero di carati dell'oro deve essere compreso tra 8 e 14.");
        }

        this.carati = carati;
    }

    public int getCarati() {
        return carati;
    }
}
