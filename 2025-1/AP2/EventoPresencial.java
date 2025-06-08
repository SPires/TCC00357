package AP2;

public class EventoPresencial extends Evento{
    private String endereco;

    public EventoPresencial(String nome, String organizador, int horaInicio, int minutoFim, int horaFim, int minutoInicio, String endereco) throws IllegalArgumentException {
        if (endereco.isEmpty()) {
            throw new IllegalArgumentException("O endereço não pode ficar em branco.");
        } else {
            this.endereco = endereco;
        }
        super(nome,organizador,horaInicio,minutoInicio,horaFim,minutoFim);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
