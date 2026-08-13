import java.util.Random;
import java.util.Scanner;

public class ex3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        double n1, n2, n3, n4;
        double[] md = new double[10];
        int aprovados = 0;

        for (int i = 0; i < md.length; i++) {
            n1 = random.nextDouble(0, 10);
            n2 = random.nextDouble(0, 10);
            n3 = random.nextDouble(0, 10);
            n4 = random.nextDouble(0, 10);
            System.out.println(md [i]);
            if (md[i] >= 6){
                aprovados++;
            }
        }
        System.out.println("Total de aprovados: " + aprovados);
    }
}
