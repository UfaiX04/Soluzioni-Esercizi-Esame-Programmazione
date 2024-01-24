/**
 * This class represents a planet.
 */
public class Pianeta {
    private String nome;
    private double massa;
    private double distanza;
    /**
     * Constructs a new Pianeta object with the given nome, massa, and distanza.
     * 
     * @param nome     the name of the planet
     * @param massa    the mass of the planet
     * @param distanza the distance of the planet from the sun
     * @throws RuntimeException if the nome is null or the massa or distanza is negative
     */
    public Pianeta(String nome, double massa, double distanza) {
        if (nome == null || nome.isEmpty()) {
            throw new RuntimeException("Invalid nome");
        }

        this.nome = nome;
        this.massa = massa;
        this.distanza = distanza;

        if (this.massa < 0 || this.distanza < 0) {
            throw new RuntimeException("Invalid arguments");
        }
    }

    /**
     * Returns the name of the planet.
     * 
     * @return the name of the planet
     */
    public String getNome() {
        return nome;
    }

    /**
     * Returns the mass of the planet.
     * 
     * @return the mass of the planet
     */
    public double getMassa() {
        return massa;
    }

    /**
     * Returns the distance of the planet from the sun.
     * 
     * @return the distance of the planet from the sun
     */
    public double getDistanza() {
        return distanza;
    }
}
