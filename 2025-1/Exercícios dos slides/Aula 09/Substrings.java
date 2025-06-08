// Escreva um programa em Java que leia do usuário uma palavra p e um inteiro n.
// Seu programa deve gerar um conjunto com todas as substrings de tamanho n da palavra de entrada.
package aula09;
import java.util.*;

public class Substrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String word = sc.nextLine();
        System.out.println("Digite um inteiro maior que 0: ");
        int range = sc.nextInt();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < word.length()-range+1; i++) {
            list.add(word.substring(i, i+range));
        }
        String[] subs = list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(subs));
    }
}
