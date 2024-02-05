public abstract class TV {
    private int pollici;
    protected String nomeModello;

    public TV(int p) throws Exception{
        if(p > 1) pollici = p;
        else throw new Exception("Dimensione TV errata!");
    }

    public int getPollici() { return pollici; }
}