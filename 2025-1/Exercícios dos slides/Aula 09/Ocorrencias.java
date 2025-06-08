//Escreva um programa em Java que receba, a partir do teclado, uma série de cores.
// Para parar a inserção na coleção de cores, a palavra ``parar'' deve ser inserida.
// Após parar a captura de dados pelo teclado, o programa deve imprimir as cores presentes na coleção e seu tamanho.

package aula09;
import java.util.*;

public class Ocorrencias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o nome de uma cor ou 'parar' para cancelar a inserção:");
        String word = scanner.nextLine();
        List<String> list = new ArrayList<>();
        while(!word.equals("parar")){
            list.add(word);
            word = scanner.nextLine();
        }
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list.size());
        scanner.close();
    }
}
