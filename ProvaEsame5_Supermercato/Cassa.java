/**
 * La classe Cassa rappresenta il punto di ingresso dell'applicazione.
 * Viene utilizzata per creare oggetti Prodotto, creare una ricevuta e stamparla.
 */
public class Cassa {
    /**
     * Il metodo main è il punto di ingresso dell'applicazione.
     * Crea una serie di oggetti Prodotto, li aggiunge alla ricevuta e stampa la ricevuta.
     * 
     * @param args gli argomenti della riga di comando (non utilizzati in questo caso)
     */
    public static void main(String[] args) {
        Prodotto p1 = new Prodotto(1, "Pasta", 1.5, 10);
        Prodotto p2 = new Prodotto(2, "Riso", 2.5, 10);
        Prodotto p3 = new Prodotto(3, "Pane", 1.0, 10);
        Prodotto p4 = new Prodotto(4, "Latte", 1.5, 10);
        Prodotto p5 = new Prodotto(5, "Uova", 2.5, 10);
        Prodotto p6 = new Prodotto(6, "Biscotti", 1.0, 10);
        Prodotto p7 = new Prodotto(7, "Cioccolato", 1.5, 10);
        Prodotto p8 = new Prodotto(8, "Caffè", 2.5, 10);
        Prodotto p9 = new Prodotto(9, "The", 1.0, 10);
        Prodotto p10 = new Prodotto(10, "Zucchero", 1.5, 10);

        Prodotto[] prodotti = {p1, p2, p3, p4, p5, p6, p7, p8, p9,
                               p10};

        Ricevuta r = new Ricevuta(prodotti, 0, 0.0);
        
        for (int i = 0; i < prodotti.length; i++) {
            r.aggiungiArticolo(prodotti[i]);
        }
        
        r.stampaRicevuta();
        System.out.println();
        test(p1.getNome(),"Pasta");
    }

    private static int t = 0;
    public static <T> void test(T x, T y) {
	System.out.println("test " + (t++) + " " + (x.equals(y) ? "OK" : "NO"));
    }
}
