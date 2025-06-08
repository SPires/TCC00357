// Escreva um programa em Java que converta um HashSet de inteiros em um vetor de inteiros.
// Lembre-se de imprimir o vetor resultante.
package aula09;
import java.util.*;

public class Conjunto2Vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Diga quantos inteiros quer inserir (mais que 0): ");
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        while (set.size() < n) {
            set.add(sc.nextInt());
        }
        Object[] array = set.toArray();
        System.out.println(Arrays.toString(array));
    }
}
