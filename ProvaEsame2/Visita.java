public class Visita {
    String nome, cognome;

    public Visita(String nome, String cognome) throws Exception {
        if (nome == null || cognome == null || nome.length() < 2 || cognome.length() < 2)
            throw new Exception();
        this.nome = nome;
        this.cognome = cognome;
    }


    
    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

}
