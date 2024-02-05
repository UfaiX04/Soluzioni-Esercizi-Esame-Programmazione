/**
 * Represents a carriage in a train.
 * Extends the Vagone class.
 */
public class Carrozza extends Vagone{
    private int posti;
    
    /**
     * Constructs a Carrozza object with the specified parameters.
     * 
     * @param p the number of the carriage
     * @param posti the number of seats in the carriage
     * @throws Exception if the number of seats is less than 40 or greater than 200
     */
    public Carrozza(int p, int posti) throws Exception{
        super(p);
        if(posti < 40 || posti > 200) throw new IllegalArgumentException();
    }
    
    /**
     * Returns the number of seats in the carriage.
     * 
     * @return the number of seats
     */
    public int getPosti() {return posti;}
}