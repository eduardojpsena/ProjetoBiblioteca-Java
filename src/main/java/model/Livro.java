package model;

public class Livro {
    //Atributos
    private int id;
    private FichaCatalografica fichaCat;

    //Construtores
    public Livro() {
    }

    public Livro(int id, FichaCatalografica fichaCat) {
            this.id = id;
            this.fichaCat = fichaCat;
    }

    //Get e Set
    public int getId() {
            return id;
    }
    public void setId(int id) {
            this.id = id;
    }

    public FichaCatalografica getFichaCat() {
            return fichaCat;
    }
    public void setFichaCat(FichaCatalografica fichaCat) {
            this.fichaCat = fichaCat;
    }

    //toString
    public String toString() {
            return "Livro [id=" + id + ", fichaCat=" + fichaCat + "]";
    }
	
}