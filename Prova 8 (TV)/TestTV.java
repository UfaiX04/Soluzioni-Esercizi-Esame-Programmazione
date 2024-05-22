public class TestTV {
    public static void main(String[] args) {
        // Create a Panasonic TV object
        Panasonic tv = new Panasonic(55, "Model XYZ", 20, "Full-HD");

        // Set the frequency for channel 1
        tv.setCanale(981, 600);

        // Print the TV details
        System.out.println("TV Details:");
        System.out.println("Model: " + tv.getNomeModello());
        System.out.println("Inches: " + tv.getNumeroPollici());

        // Print the frequency for channel 1
        System.out.println("Canali disponibili: " + tv.getNumerodiCanali());
    }
}
