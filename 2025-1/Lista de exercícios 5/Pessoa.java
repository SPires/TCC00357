import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Pessoa {
    private String nome;
    private int idade;
    private String naturalidade;
    private String nacionalidade;
    private Pessoa pai;
    private Pessoa mae;
    private ArrayList<Pessoa> filhos;

    public Pessoa(String nome, int idade, String naturalidade, String nacionalidade, Pessoa pai, Pessoa mae) throws IllegalArgumentException, NullPointerException {
        if (nome == null || nome.isEmpty()) throw new IllegalArgumentException("Nome vazio");
        if (idade < 0) throw new IllegalArgumentException("Idade negativa");
        if (naturalidade == null || naturalidade.isEmpty()) throw new IllegalArgumentException("Naturalidade vazia");
        if (nacionalidade == null) throw new IllegalArgumentException("Nacionalidade vazia");
        if (pai == null) throw new NullPointerException("Pai inexistente");
        if (mae == null) throw new NullPointerException("Mãe inexistente");
        this.nome = nome;
        this.idade = idade;
        this.naturalidade = naturalidade;
        this.nacionalidade = nacionalidade;
        this.pai = pai;
        this.mae = mae;
        this.filhos = new ArrayList<>();
    }

    public Pessoa getPai(){
        return pai;
    }

    public Pessoa getMae(){
        return mae;
    }

    public ArrayList<Pessoa> getFilhos(){
        return filhos;
    }

    public Tuple<Pessoa,Pessoa> getAvosPaternos(){
        return new Tuple<>(this.pai.getPai(),this.pai.getMae());
    }

    public Tuple<Pessoa,Pessoa> getAvosMaternos(){
        return new Tuple<>(this.mae.getPai(),this.mae.getMae());
    }

    public HashMap<String,Integer> numeroPrimos(){
        HashMap<String,Integer> map = new HashMap<>();
        HashSet<Pessoa> temp = new HashSet<>();
        temp.addAll(pai.getPai().getFilhos());
        temp.addAll(pai.getMae().getFilhos());
        temp.remove(pai);
        int count = 0;
        for (Pessoa p : temp){
            count += p.getFilhos().size();
        }
        map.put("Primos paternos",count);
        temp.clear();
        temp.addAll(mae.getMae().getFilhos());
        temp.addAll(mae.getPai().getFilhos());
        temp.remove(mae);
        count = 0;
        for (Pessoa p : temp){
            count += p.getFilhos().size();
        }
        map.put("Primos maternos",count);
        return map;
    }
    
    @Override
    public String toString() {
        return nome + " " + idade + "\n" + naturalidade + " " + nacionalidade + "\nFiliação: " + pai.nome + " e " + mae.nome;
    }
}
