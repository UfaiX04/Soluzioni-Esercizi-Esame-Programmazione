public class Treno{
    private int maxVagoni;
    private Vagone[] vagoni;
    public Treno(int maxVagoni) throws Exception{
        if(maxVagoni < 1) throw new IllegalArgumentException("Numero di vagoni massimi errato");
        else this.maxVagoni = maxVagoni;
        this.vagoni = new Vagone[maxVagoni];
    }


    public int indiceVagoni = 0;


    public boolean add(Vagone v) {
        if(maxVagoni > indiceVagoni) {
            vagoni[indiceVagoni++] = v;
            return true;} else return false;
    }

    public boolean check() {

        int accCavalli = 0;
        int accPeso = 0;

        for(int i = 0; i<vagoni.length; i++) {
            accCavalli = accCavalli + ((Locomotiva) vagoni[i]).getCavalli();	}
        for(int i = 0; i<vagoni.length; i++) {
            accPeso = accPeso + vagoni[i].getPeso();
        }
        if(accCavalli > accPeso) return true;
        else return false;
    }

    public int posti() {
        int acc = 0;
        for(int i = 0; i<vagoni.length; i++) {
            acc = acc + ((Carrozza)vagoni[i]).getPosti();
        }
        return acc;
    }
}