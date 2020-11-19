package model;

public class Aluguel {
    //Atributos
    private int id;
    private Usuario usuario;
    private Funcionario funcionario;
    private String quantLivros;
    private String prazo;
    private double multa;

    //Get e Set
    public Aluguel() {
    }

    public Aluguel(int id, Usuario usuario, Funcionario funcionario, String quantLivros, String prazo, double multa) {
            this.id = id;
            this.usuario = usuario;
            this.funcionario = funcionario;
            this.quantLivros = quantLivros;
            this.prazo = prazo;
            this.multa = multa;
    }

    //Get e Set
    public int getId() {
            return id;
    }
    public void setId(int id) {
            this.id = id;
    }

    public Usuario getUsuario() {
            return usuario;
    }
    public void setUsuario(Usuario usuario) {
            this.usuario = usuario;
    }

    public Funcionario getFuncionario() {
            return funcionario;
    }
    public void setFuncionario(Funcionario funcionario) {
            this.funcionario = funcionario;
    }

    public String getQuantLivros() {
            return quantLivros;
    }
    public void setQuantLivros(String quantLivros) {
            this.quantLivros = quantLivros;
    }

    public String getPrazo() {
            return prazo;
    }
    public void setPrazo(String prazo) {
            this.prazo = prazo;
    }

    public double getMulta() {
            return multa;
    }
    public void setMulta(double multa) {
            this.multa = multa;
    }

    //toString
    public String toString() {
            return "Aluguel [id=" + id + ", usuario=" + usuario + ", quantLivros=" + quantLivros + ", prazo=" + prazo
                            + ", multa=" + multa + "]";
    }
}