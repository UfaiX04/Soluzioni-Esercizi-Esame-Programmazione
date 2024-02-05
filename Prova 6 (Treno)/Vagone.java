/**
 * This abstract class represents a train car.
 */
public abstract class Vagone {
    private int peso;
    
    /**
     * Constructs a Vagone object with the specified weight.
     * 
     * @param p the weight of the train car
     * @throws Exception if the weight is not positive
     */
    Vagone(int p) throws Exception {
        if (p > 0) 
            peso = p; 
        else 
            throw new Exception(); 
    }
    
    /**
     * Returns the weight of the train car.
     * 
     * @return the weight of the train car
     */
    public int getPeso() { 
        return peso; 
    }
}
