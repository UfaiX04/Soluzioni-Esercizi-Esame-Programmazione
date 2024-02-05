/**
 * Questa classe astratta rappresenta un vagone del treno.
 */
public abstract class Vagone {
    private int peso;

    /**
     * Costruisce un oggetto Vagone con il peso specificato.
     * 
     * @param p il peso del vagone
     * @throws Exception se il peso non è positivo
     */
    Vagone(int p) throws Exception {
        if (p > 0)
            peso = p;
        else
            throw new Exception();
    }

    /**
     * Restituisce il peso del vagone.
     * 
     * @return il peso del vagone
     */
    public int getPeso() {
        return peso;
    }
}
