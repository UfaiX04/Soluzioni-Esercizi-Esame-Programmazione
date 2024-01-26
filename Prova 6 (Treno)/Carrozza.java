public class Carrozza extends Vagone{
    private int posti;
    public Carrozza(int p, int posti)throws Exception{
        super(p);
        if(posti < 40 || posti > 200) throw new IllegalArgumentException();
    }
    public int getPosti() {return posti;}
}