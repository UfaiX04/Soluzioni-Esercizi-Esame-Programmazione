class Prezioso {
    private int peso;

    public Prezioso(int peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("Il peso deve essere un intero positivo.");
        }
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }
}
