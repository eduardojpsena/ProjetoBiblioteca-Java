package model.entity;

public class Evento {
    private long id;
    private String nomeEvento;
    private Espaco espaco;
    private String data;
    private String hora;

    public Evento() {
    }

    public Evento(long id, String nomeEvento, Espaco espaco, String data, String hora) {
            super();
            this.id = id;
            this.nomeEvento = nomeEvento;
            this.espaco = espaco;
            this.data = data;
            this.hora = hora;
    }

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

    public String toString() {
            return "Evento [id=" + id + ", nomeEvento=" + nomeEvento + ", espaco=" + espaco + ", data=" + data + ", hora="
                            + hora + "]";
    }
}
