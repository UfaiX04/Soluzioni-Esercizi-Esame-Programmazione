class Gioiello {
    private Prezioso[] componenti;
    private int numComponenti;

    public Gioiello(int numMaxComponenti) {
        if (numMaxComponenti < 1) {
            throw new IllegalArgumentException("Il numero massimo di componenti deve essere almeno 1.");
        }

        this.componenti = new Prezioso[numMaxComponenti];
        this.numComponenti = 0;
    }

    public boolean add(Prezioso prezioso) {
        if (numComponenti < componenti.length) {
            componenti[numComponenti] = prezioso;
            numComponenti++;
            return true;
        } else {
            return false;
        }
    }

    public boolean check() {
        int sommaCaratiPietre = caratiPietre();
        int pesoComplessivo = 0;

        for (int i = 0; i < numComponenti; i++) {
            pesoComplessivo += componenti[i].getPeso();
        }

        return sommaCaratiPietre > pesoComplessivo;
    }

    public int caratiPietre() {
        int sommaCarati = 0;

        for (int i = 0; i < numComponenti; i++) {
            if (componenti[i] instanceof Pietra) {
                sommaCarati += ((Pietra) componenti[i]).getCarati();
            }
        }

        return sommaCarati;
    }
}
