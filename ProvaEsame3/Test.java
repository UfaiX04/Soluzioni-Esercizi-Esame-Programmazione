public class Test {
    public static void main(String[] args) throws Exception {
	Agenda a = new Agenda(10);
	test(a.appuntamento(0), null);
	test(a.aggiungi(new Appuntamento("Mario", 4, 10)), true);
	test(a.aggiungi(new Appuntamento("Silvio", 4, 10)), false);
	test(a.aggiungi(new Appuntamento("Caterina", 3, 11)), true);
	test(a.numeroAppuntamenti(), 2);
	test(a.appuntamento(1).getNome(), "Mario");
	test(a.appuntamento(0).getNome(), "Caterina");
	test(a.disdetta(0), true);
	test(a.appuntamento(0).getNome(), "Mario");
    }

    private static int t = 1;
    public static <T> void test(T x, T y) {
	System.out.println("test " + (t++) + " " + (equality(x, y) ? "OK" : "NO"));
    }

    public static <T> boolean equality(T x, T y) {
	if (x == null && y == null) return true;
	else if (x != null && y != null) return x.equals(y);
	else return false;
    }
}