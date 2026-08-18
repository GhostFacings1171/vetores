import java.util.Random;
import java.util.Scanner;

public class ex6 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int qnt;
        boolean especial = true;
        System.out.print("Informe a quantidade de numeros: ");
        qnt = sc.nextInt();
        int[] x = new int[qnt];
        for (int i = 0; i < x.length; i++) {
            x[i] = random.nextInt(1, 5);
            System.out.print(x[i] + "\t");
        }
        for (int i = 0; i < x.length - 1; i++) {
            if (x[i] % 2 == x[i+1] % 2){
                especial = false;
                break;
            }
        }
        if(especial){
            System.out.println("e especial");
        }
        else {
            System.out.println("nao e especial");
        }
    }
}
