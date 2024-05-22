public class TestGioielleria {
    private static int t = 0;

    public static void main(String[] args) {
        // Create instances of Oro, Pietra, and Prezioso
        Oro oro = new Oro(10, 5);
        Pietra pietra = new Pietra(11, 2);
        Prezioso prezioso = new Prezioso(14);

        // Call the caratiPietre method and test the result
        test(oro.getCarati(), 5);
        test(pietra.getCarati(), 2);

        // Call the check method and test the result

    }

    public static <T> void test(T x, T y) {
        System.out.println("test " + (t++) + " " + ((x == null && y == null) || (x != null && x.equals(y)) ? "OK" : "NO"));
    }
}