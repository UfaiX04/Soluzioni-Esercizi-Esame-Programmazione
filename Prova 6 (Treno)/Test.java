public class Test {
    public static void main(String[] args) throws Exception {
        try {
            Locomotiva locomotiva1 = new Locomotiva(100, 500);
            Locomotiva locomotiva2 = new Locomotiva(150, 700);
            Locomotiva carrozza1 = new Locomotiva(80, 100);
            Locomotiva carrozza2 = new Locomotiva(90, 150);

            Treno treno = new Treno(4);
            treno.add(locomotiva1);
            treno.add(locomotiva2);
            treno.add(carrozza1);
            treno.add(carrozza2);

            System.out.println("Numero di passeggeri: " + treno.passeggeri());
            System.out.println("La somma dei cavalli delle locomotive è maggiore al peso complessivo del treno? " + treno.check());
        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}
