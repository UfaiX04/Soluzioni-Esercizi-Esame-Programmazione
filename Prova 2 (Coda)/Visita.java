/**
 * The Visita class represents a visit.
 * It stores the name and surname of the visitor.
 */
public class Visita {
    String nome, cognome;

    /**
     * Constructs a Visita object with the specified name and surname.
     * 
     * @param nome    the name of the visitor
     * @param cognome the surname of the visitor
     * @throws Exception if the name or surname is null or has less than 2 characters
     */
    public Visita(String nome, String cognome) throws Exception {
        if (nome == null || cognome == null || nome.length() < 2 || cognome.length() < 2)
            throw new Exception();
        this.nome = nome;
        this.cognome = cognome;
    }

    /**
     * Returns the name of the visitor.
     * 
     * @return the name of the visitor
     */
    public String getNome() {
        return nome;
    }

    /**
     * Returns the surname of the visitor.
     * 
     * @return the surname of the visitor
     */
    public String getCognome() {
        return cognome;
    }
}
