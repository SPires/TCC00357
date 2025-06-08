// Escreva um programa em java que receba uma string denotando uma frase,
// inverta a ordem das palavras e imprima a frase com a ordem trocada das palavras.

package aula09;
import java.util.*;

public class Inversao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phrase = scanner.nextLine();
        List<String> list = Arrays.asList(phrase.split(" "));
        String reversed = "";
        for(String word : list){
            reversed = word + " " + reversed;
        }
        System.out.println(reversed);
        scanner.close();
    }
}
