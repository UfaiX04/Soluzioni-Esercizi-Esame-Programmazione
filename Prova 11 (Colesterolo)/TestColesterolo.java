/**
 * Questa classe rappresenta un test per la classe EsamiColesterolo.
 */
public class TestColesterolo {
    private static int t = 0;

    /**
     * Il metodo principale che esegue i test.
     * @param args non utilizzato.
     */
    public static void main(String[] args) {
        // Crea istanze di EsameColesterolo
        EsameColesterolo esame1 = new EsameColesterolo(1671457886 , 200, 300, 150);
        EsameColesterolo esame2 = new EsameColesterolo(1346188681 , 150, 250, 100);

        // Crea un'istanza di EsamiColesterolo
        EsamiColesterolo esami = new EsamiColesterolo(2);

        // Testa il metodo add
        test(esami.add(esame1), true);
        test(esami.add(esame2), true);

        // Testa il metodo trigliceridiMassimo
        test(esami.trigliceridiMassimo(), Math.max(esame1.getTrigliceridi(), esame2.getTrigliceridi()));

        // Testa il metodo intervallo
        double expectedIntervallo = ((esame1.getLdl() - esame1.getHdl()) + (esame2.getLdl() - esame2.getHdl())) / 2.0;
        test(esami.intervallo(), expectedIntervallo);
    }

    /**
     * Un metodo di utilità per eseguire un singolo test e stampare il risultato.
     * @param x il risultato ottenuto.
     * @param y il risultato atteso.
     */
    public static <T> void test(T x, T y) {
        System.out.println("test " + (t++) + " " + ((x == null && y == null) || (x != null && x.equals(y)) ? "OK" : "NO"));
    }
}