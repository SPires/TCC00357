import java.util.*;

// Gabarito da Questão 1

public class Main {
    public static Map<Character,Integer> letterCount(String s) throws NullPointerException{
        if (s == null || s.length() == 0){
            throw new NullPointerException("String vazia ou nula.");
        } else {
            Map<Character,Integer> map = new HashMap<>();
            for(int i=0;i<s.length();i++){
                if (map.keySet().contains(s.charAt(i))){
                    map.put(s.charAt(i),map.get(s.charAt(i))+1);
                } else {
                    map.put(s.charAt(i),1);
                }
            }
            return map;
        }
    }

    public static Set<String> recSigmaK(Set<Character> sigma, int k) throws IllegalArgumentException{
        if(sigma == null || sigma.size() == 0){
            throw new IllegalArgumentException("O conjunto de caracteres está vazio.");
        }
        if (k <= 0){
            throw new IllegalArgumentException("O tamanho das palavras não pode ser menor que 1.");
        }
        Set<String> set = new HashSet<>();
        if (k == 1){
            for (Character c : sigma){
                set.add(Character.toString(c));
            }
            return set;
        }
        Set<String> prev = recSigmaK(sigma,k-1);
        for (Character c : sigma){
            for (String s : prev){
                set.add(Character.toString(c) + s);
            }
        }
        return set;
    }

    public static Set<Tuple<Integer,Integer>> cartesianProduct(Set<Integer> set1, Set<Integer> set2) throws NullPointerException{
        if (set1 == null || set2 == null || set1.size() == 0 || set2.size() == 0){
            throw new NullPointerException("Ao menos um dos conjuntos é vazio ou nulo.");
        }
        Set<Tuple<Integer,Integer>> set = new HashSet<>();
        for (Integer i : set1){
            for (Integer j : set2){
                set.add(new Tuple<>(i,j));
            }
        }
        return set;
    }

    // Teste de primalidade iterativo
    public static boolean primeTest(int n){
        if (n < 2){
            return false;
        }
        for (int i = 2; i < n; i++){
            if (n % i == 0) return false;
        }
        return true;
    }

    public static Set<Integer> primeSet(int n) throws IllegalArgumentException{
        if (n < 2){
            throw new IllegalArgumentException("O limitante deve ser maior ou igual a 2.");
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 2; i <= n; i++){
            if (primeTest(i)) set.add(i);
        }
        return set;
    }

    public static Set<String> kSizeSubstring(String s, int k) throws IllegalArgumentException, NullPointerException{
        if (s == null || s.length() == 0) throw new NullPointerException("String vazia ou nula.");
        if (k <= 0) throw new IllegalArgumentException("O tamanho da substring deve ser ao menos 1.");
        Set<String> set = new HashSet<>();
        if (k > s.length()) return set;
        for (int i = 0; i < s.length()-k+1; i++){
            set.add(s.substring(i,i+k));
        }
        return set;
    }

    public static List<Integer> derangement(int n) throws IllegalArgumentException{
        if (n < 1) throw new IllegalArgumentException("O valor de entrada deve ser positivo.");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 1; i < n; i++){
            list.add((int) (i * list.getLast() + Math.pow(-1.0,i)));
        }
        return list;
    }

    public static Map<Integer,Integer> recamanSeq(int n) throws IllegalArgumentException{
        if (n < 1) throw new IllegalArgumentException("O valor de entrada deve ser positivo.");
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,0);
        for (int i = 1; i < n; i++){
            int x = map.get(i-1);
            if (x - i > 0 && !map.containsValue(x-i)) map.put(i,x-i);
            else map.put(i,x+i);
        }
        return map;
    }
}
