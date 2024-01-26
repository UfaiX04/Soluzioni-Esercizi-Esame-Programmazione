public class Test {
    public static void main(String[] args) {
	SistemaSolare s = new SistemaSolare(8);
	test(s.nuovo(null), false);
	test(s.nuovo(new Pianeta("Terra", 1, 1)), true);
	test(s.nuovo(new Pianeta("Venere", 0.86, 0.72)), true);
	test(s.nuovo(new Pianeta("Mercurio", 0.06, 0.39)), true);
	test(s.getNumero(), 3);
	test(s.nuovo(new Pianeta("Giove", 317.83, 5.2)), true);
	test(s.nuovo(new Pianeta("Marte", 0.11, 1.52)), true);
	test(s.getMaxPianeta().getNome(), "Giove");
	test(s.getPianeta(0).getNome(), "Mercurio");
	test(s.getPianeta(2).getNome(), "Terra");
    }

    private static int t = 0;
    public static <T> void test(T x, T y) {
	System.out.println("test " + (t++) + " " + (x.equals(y) ? "OK" : "NO"));
    }
}
