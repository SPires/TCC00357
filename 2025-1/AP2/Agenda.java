package AP2;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Arrays;

public class Agenda {
    private Map<String,Map<Integer,ArrayList<Evento>>> agenda;
    private static final String[] meses = {"JAN", "FEV", "MAR", "ABR", "MAI", "JUN", "JUL", "AGO", "SET", "OUT", "NOV", "DEZ"};
    private static final String[] meses30 = {"ABR","JUN","SET","NOV"};
    private static final String[] meses31 = {"JAN","MAR","MAI","JUL","AGO","OUT","DEZ"};

    public Agenda(int ano) {
        Map<String, Map<Integer,ArrayList<Evento>>> agenda = new HashMap<>();
        for (String mes: meses) {
            Map<Integer,ArrayList<Evento>> dias = new HashMap<>();
            if (Arrays.asList(meses30).contains(mes)) {
                for (int i = 1; i <= 30; i++) {
                    dias.put(i, new ArrayList<>());
                }
            }
            if (Arrays.asList(meses31).contains(mes)) {
                for (int i = 1; i <= 31; i++) {
                    dias.put(i, new ArrayList<>());
                }
            } else {
                if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
                    for (int i = 1; i <= 29; i++) {
                        dias.put(i, new ArrayList<>());
                    }
                } else {
                    for (int i = 1; i <= 28; i++) {
                        dias.put(i, new ArrayList<>());
                    }
                }

            }
            agenda.put(mes,dias);
        }
        this.agenda = agenda;
    }

    public void addEvento(String mes, int dia, Evento evento) throws IllegalArgumentException {
        if (!Arrays.asList(meses).contains(mes)) {
            throw new IllegalArgumentException("Mês no formato incorreto.");
        }
        if (dia < 1 || dia > 31){
            throw new IllegalArgumentException("Dia inexistente.");
        }
        if (dia == 31 && Arrays.asList(meses30).contains(mes)) {
            throw new IllegalArgumentException("Dia inválido para o mês selecionado.");
        }
        if (mes.equals("FEV") && dia == 29) {
            if (agenda.get("FEV").size() == 28) {
                throw new IllegalArgumentException("Data inválida em ano não bissexto.");
            }
        }
        ArrayList<Evento> eventos = agenda.get(mes).get(dia);
        for (Evento e : eventos) {
            if (e.getHoraInicio() == evento.getHoraInicio() || e.getHoraFim()[0] < evento.getHoraInicio()[0]) {
                throw new IllegalArgumentException("Há uma sobreposição de eventos.");
            }
        }
        eventos.add(evento);
        this.agenda.get(mes).put(dia,eventos);
    }
}
