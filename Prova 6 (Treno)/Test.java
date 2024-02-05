/**
 * La classe Test è utilizzata per testare il funzionamento delle classi Treno, Locomotiva e Carrozza.
 * Contiene il metodo main che esegue una serie di test sulle istanze di Treno, Locomotiva e Carrozza.
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Treno t = new Treno(4);
        Locomotiva l1 = new Locomotiva(50, 100);
        Locomotiva l2 = new Locomotiva(50, 100);
        Carrozza c1 = new Carrozza(50, 200);
        Carrozza c2 = new Carrozza(40, 200);

        Treno t2 = new Treno(3);
        Locomotiva l3 = new Locomotiva(100, 100);
        Locomotiva l4 = new Locomotiva(100, 200);
        Carrozza c3 = new Carrozza(100, 100);
        Carrozza c4 = new Carrozza(100, 100);

        test(t.add(l1),true);
        test(t.add(l2),true);
        test(t.add(c1),true);
        test(t.add(c2),true);

        test(t2.add(c4),true);
        test(t2.add(c3),true);
        test(t2.add(l3),true);
        test(t2.add(l4),false);

        test(t.check(), true);
        test(t.passeggeri(), 400);
        test(t2.check(), false);
        test(t2.passeggeri(), 200);
    }
    
    private static int t = 0;
    public static <T> void test(T x, T y) {
        System.out.println("test " + (t++) + " " + (x.equals(y) ? "OK" : "NO"));
    }
}
