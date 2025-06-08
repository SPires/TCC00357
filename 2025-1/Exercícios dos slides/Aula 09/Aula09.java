// Gabarito dos exercícios presentes nos slides da aula sobre coleções em Java
package aula09;
import java.util.*;

public class Aula09 {

    // Escreva uma função em Java que calcule a diferença entre duas ArrayLists do tipo inteiro.
    // Esta operação remove da primeira ArrayList toda primeira ocorrência de um elemento da segunda ArrayList.
    public static List<Integer> listDifference(List<Integer> list1, List<Integer> list2) {
        List<Integer> difference = new ArrayList<>();
        for (Integer element : list2) {
            if (!list1.contains(element)) {
                difference.add(element);
            }
        }
        return difference;
    }

    // Escreva uma função em Java que receba um HashSet de inteiros S e um número inteiro n.
    // Sua função deve retornar o subconjunto de S em que todos os elementos sejam estritamente menores que n.
    public static Set<Integer> lessThan(Set<Integer> set, int value) {
        Set<Integer> less = new HashSet<>();
        for (Integer element : set) {
            if (element < value) {
                less.add(element);
            }
        }
        return less;
    }

    // Escreva uma função em Java que receba uma ArrayList de palavras.
    // A função deve retornar um dicionário em que as chaves são as palavras e o valor é o número de ocorrências da palavra na lista.
    public static Map<String,Integer> countOcurrences(ArrayList<String> words) {
        Map<String,Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.keySet().contains(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        return map;
    }

    // Escreva uma função em Java que receba um dicionário de pares de strings e
    // retorne um ArrayList das strings que são valores do dicionário.
    public static List<String> valuesIn(Map<String,String> map){
        List<String> values = new ArrayList<>();
        for (String word : map.keySet()) {
            values.add(map.get(word));
        }
        return values;
    }

    // Escreva uma função em Java que receba dois dicionários de pares string/inteiro.
    // A função retorna a fusão dos dicionários.
    // Em outras palavras, toda chave presente em algum dos dicionários de entrada estará no dicionário de saída.
    // Se uma chave é compartilhada pelos dicionários, o valor no dicionário de saída é a soma dos valores.
    public static Map<String,Integer> fusion(Map<String,Integer> map1, Map<String,Integer> map2) {
        Map<String,Integer> fusionMap = new HashMap<>();
        Set<String> newKeys = new HashSet<>();
        newKeys.addAll(map1.keySet());
        newKeys.addAll(map2.keySet());
        for (String key : newKeys) {
            fusionMap.put(key,map1.getOrDefault(key,0)+map2.getOrDefault(key,0));
        }
        return fusionMap;
    }
}
