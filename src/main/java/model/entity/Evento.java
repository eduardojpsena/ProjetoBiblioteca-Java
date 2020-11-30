package model.entity;
/**
 *
 * @author eduardoSena
 */

public class Evento {
    //Atributos
    private long id;
    private String nomeEvento;
    private Espaco espaco;
    private String data;
    private String hora;

    //Construtores
    public Evento() {}

    public Evento(long id, String nomeEvento, Espaco espaco, String data, String hora) {
        this.id = id;
        this.nomeEvento = nomeEvento;
        this.espaco = espaco;
        this.data = data;
        this.hora = hora;
    }
    
    //Get e Set
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }
    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public Espaco getEspaco() {
        return espaco;
    }
    public void setEspaco(Espaco espaco) {
        this.espaco = espaco;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }

    //toString
    public String toString() {
        return "Evento [id=" + id + ", nomeEvento=" + nomeEvento + ", espaco=" + espaco 
                + ", data=" + data + ", hora=" + hora + "]";
    }
}
