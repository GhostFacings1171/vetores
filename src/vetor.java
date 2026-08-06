import java.util.Scanner;

public class vetor {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[3];

        //entrada
        for (int i = 0;i < x.length; i++){
            System.out.print("Informe um valor: ");
            x[i] = sc.nextInt();
        }

        //saida
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }
}
