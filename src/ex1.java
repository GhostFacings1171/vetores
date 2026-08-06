import java.util.Scanner;

public class ex1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int [] x = new int [10];

        for (int i = 0; i < x.length; i++) {
            System.out.print("Digite um numero inteiro: ");
            x[i] = sc.nextInt();
        }

        int menor = x[0];
        int maior = x[0];

        for (int i = 0; i < x.length; i++) {
            if (x[i] < menor) {
                menor = x[i];
            }
            if (x[i] > maior) {
                maior = x[i];
            }
        }
        System.out.println("O menor número é: " + menor);
        System.out.println("O maior número é: " + maior);
    }
}
