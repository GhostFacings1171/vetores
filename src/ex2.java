import java.util.Scanner;
import java.util.ArrayList;

public class ex2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero inteiro: ");
            int x = sc.nextInt();

            if (x % 2 == 0) {
                pares.add(x);
            } else {
                impares.add(x);
            }
        }
        System.out.println("\n--- RESULTADO ---");
        System.out.println("Números PARES digitados: " + pares);
        System.out.println("Números ÍMPARES digitados: " + impares);

    }
}
