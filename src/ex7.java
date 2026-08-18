import java.util.Random;

public class ex7 {
    static void main() {
        Random random = new Random();
        int[] x = new int[10];

        for (int i = 0; i < x.length; i++) {
            x[i] = random.nextInt(1, 10);
            System.out.println(x[i] + "\t");
        }
    }
}
