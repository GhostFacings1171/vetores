import java.util.Random;
import java.util.Scanner;

public class ordenacao {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int[] al = new int[10];

        for (int i = 0; i < al.length; i++) {
            al[i] = random.nextInt(1, 10);
            System.out.print(al[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < al.length; i++) {
            for (int j = 0; j < al.length - 1 - i; j++) { // Se o número atual for MAIOR que o próximo, eles trocam de lugar
                if (al[j] > al[j + 1]) {
                    int auxiliar = al[j]; // Guarda o número atual temporariamente
                    al[j] = al[j + 1];    // Coloca o menor na posição anterior
                    al[j + 1] = auxiliar; // Coloca o maior na posição seguinte
                }
            }
        }
        System.out.println("\nArray ordenado em ordem crescente:");
        for (int i = 0; i < al.length; i++) {
            System.out.print(al[i] + "\t");
        }
    }
}
