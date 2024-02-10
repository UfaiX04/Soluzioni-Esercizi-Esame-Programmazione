public class Test {
    public static void main(String[] args) {
        Artista artista1 = new Artista("Nome1", "Cognome1", "Artista1", "Genere1", false);
        Artista artista2 = new Artista("Nome2", "Cognome2", "Artista2", "Genere2", true);
        Artista artista3 = new Artista("Fuma", "Galli", "Fumagalli", "Fumare", false);
        

        Serata serata1 = new Serata(1, 2);
        Serata serata2 = new Serata(3, 4);
        Serata serata3 = new Serata(5, 6);


        Sanremo sanremo = new Sanremo();
        test(sanremo.nuovaSerata(serata1), true);
        test(sanremo.nuovaSerata(serata2), true);
        test(sanremo.nuovaSerata(serata3), true);


        test(sanremo.getVincitore(), "Fumagalli");
    }

    private static int t = 0;
    public static <T> void test(T x, T y) {
	System.out.println("test " + (t++) + " " + (x.equals(y) ? "OK" : "NO"));
    }
}