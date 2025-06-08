package AP2;

public class EventoRemoto extends Evento{
    private String url;

    public EventoRemoto(String nome, String organizador, int horaInicio, int minutoFim, int horaFim, int minutoInicio, String url) throws IllegalArgumentException {
        if (url.isEmpty()) {
            throw new IllegalArgumentException("A URL não pode ficar em branco.");
        } else {
            this.url = url;
        }
        super(nome,organizador,horaInicio,minutoInicio,horaFim,minutoFim);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
