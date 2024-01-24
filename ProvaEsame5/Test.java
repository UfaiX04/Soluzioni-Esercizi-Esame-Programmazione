public class Test {
    public static void main(String[] args) {
        try {
            Pietra pietra = new Pietra(2, 11);
            Oro oro = new Oro(5, 10);
            Oro oro1 = new Oro(15, 14);

            Gioiello gioiello = new Gioiello(3);
            gioiello.add(pietra);
            gioiello.add(oro);
            gioiello.add(oro1);

            System.out.println("Carati totali delle pietre: " + gioiello.caratiPietre());
            System.out.println("Controllo: " + gioiello.check());
        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}