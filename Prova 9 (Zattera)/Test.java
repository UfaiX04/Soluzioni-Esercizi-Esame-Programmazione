public class Test {
    public static void main(String[] args) {
        try {
            Pacco pacco1 = new Pacco(10.5);
            Pacco pacco2 = new Pacco(7.8);
            Pacco pacco3 = new Pacco(5.2);

            ZatteraGalleggiante zattera = new ZatteraGalleggiante(10, 5);
            zattera.aggiungiPacco(pacco1, new Punto(2, 3));
            zattera.aggiungiPacco(pacco2, new Punto(4, 1));
            zattera.aggiungiPacco(pacco3, new Punto(1, 2));

            System.out.println("Peso totale: " + zattera.getPesoTotale());
            System.out.println("Peso medio: " + zattera.getPesoMedio());
            System.out.println("Baricentro: " + zattera.getBaricentro());
            
            // Add more test cases here
            Pacco pacco4 = new Pacco(3.7);
            Pacco pacco5 = new Pacco(6.1);
            Pacco pacco6 = new Pacco(8.9);
            
            zattera.aggiungiPacco(pacco4, new Punto(3, 4));
            zattera.aggiungiPacco(pacco5, new Punto(5, 2));
            zattera.aggiungiPacco(pacco6, new Punto(2, 1));
            
            System.out.println("Peso totale: " + zattera.getPesoTotale());
            System.out.println("Peso medio: " + zattera.getPesoMedio());
            System.out.println("Baricentro: " + zattera.getBaricentro());
        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}
