public class TestColesterolo {
    private static int t = 0;

    public static void main(String[] args) {
        // Create instances of EsameColesterolo
        EsameColesterolo esame1 = new EsameColesterolo(1671457886 , 200, 300, 150);
        EsameColesterolo esame2 = new EsameColesterolo(1346188681 , 150, 250, 100);

        // Create an instance of EsamiColesterolo
        EsamiColesterolo esami = new EsamiColesterolo(2);

        // Test the add method
        test(esami.add(esame1), true);
        test(esami.add(esame2), true);

        // Test the trigliceridiMassimo method
        test(esami.trigliceridiMassimo(), Math.max(esame1.getTrigliceridi(), esame2.getTrigliceridi()));

        // Test the intervallo method
        double expectedIntervallo = ((esame1.getLdl() - esame1.getHdl()) + (esame2.getLdl() - esame2.getHdl())) / 2.0;
        test(esami.intervallo(), expectedIntervallo);
    }

    public static <T> void test(T x, T y) {
        System.out.println("test " + (t++) + " " + ((x == null && y == null) || (x != null && x.equals(y)) ? "OK" : "NO"));
    }
}