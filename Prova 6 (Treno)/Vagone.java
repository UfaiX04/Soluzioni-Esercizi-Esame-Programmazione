public abstract class Vagone {
    private int peso;
    Vagone(int p) throws Exception {
        if (p > 0) peso = p; else throw new Exception(); }
    public int getPeso() { return peso; }
}
