package AP2;

public abstract class Evento {
    protected String nome;
    protected String organizador;
    protected int horaInicio;
    protected int minutoInicio;
    protected int horaFim;
    protected int minutoFim;

    public Evento(String nome, String organizador, int horaInicio, int minutoFim, int horaFim, int minutoInicio) throws IllegalArgumentException{
        if (nome.isEmpty()){
            throw new IllegalArgumentException("O nome do evento não pode ficar em branco.");
        } else {
            this.nome = nome;
        }
        if (organizador.isEmpty()){
            throw new IllegalArgumentException("O nome do organizador não pode ficar em branco.");
        } else {
            this.organizador = organizador;
        }
        this.organizador = organizador;
        if (horaInicio < 0 || horaInicio > 23) {
            throw new IllegalArgumentException("Hora de início inválida. Definir entre 0 e 23.");
        } else {
            this.horaInicio = horaInicio;
        }
        if ((horaFim < 0 || horaFim > 23) && horaFim < horaInicio) {
            throw new IllegalArgumentException("Hora de encerramento inválida. Definir entre 0 e 23 e/ou após o início.");
        } else {
            this.horaFim = horaFim;
        }
        if (minutoInicio < 0 || minutoInicio > 59) {
            throw new IllegalArgumentException("Minuto de início fora dos limites estabelecidos.");
        } else {
            this.minutoInicio = minutoInicio;
        }
        if (minutoFim < 0 || minutoFim > 59) {
            throw new IllegalArgumentException("Minuto de início fora dos limites estabelecidos.");
        } else {
            this.minutoFim = minutoFim;
        }
    }

    public String getNome() {
        return nome;
    }

    public String getOrganizador() {
        return organizador;
    }

    public int[] getHoraInicio() {
        int[] horario = new int[2];
        horario[0] = horaInicio;
        horario[1] = minutoInicio;
        return horario;
    }

    public int[] getHoraFim() {
        int[] horario = new int[2];
        horario[0] = horaFim;
        horario[1] = minutoFim;
        return horario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraFim(int horaFim) {
        this.horaFim = horaFim;
    }

    public void setMinutoInicio(int minutoInicio) {
        this.minutoInicio = minutoInicio;
    }

    public void setMinutoFim(int minutoFim) {
        this.minutoFim = minutoFim;
    }
}
