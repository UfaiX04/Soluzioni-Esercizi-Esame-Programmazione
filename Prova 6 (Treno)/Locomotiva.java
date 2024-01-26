public class Locomotiva extends Vagone{
    private int cavalli;
    public Locomotiva(int p, int cavalli) throws Exception {
        super(p);
        if(cavalli < 0) throw new IllegalArgumentException("Argomento non valido");
        else this.cavalli = cavalli;
    }

    public int getCavalli() {return cavalli;}
}