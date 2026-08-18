import java.util.Random;

public class ex7 {
    static void main() {
        Random random = new Random();
        int[] x = new int[5];
        int cont, grau = 0;

        for (int i = 0; i < x.length; i++) {
            x[i] = random.nextInt(1, 10);
            System.out.print(x[i] + "\t");
        }

        for (int i = 0; i < x.length; i++) {
            cont = 0;
            for (int j = i; j < x.length; j++) {
                if (x[i] == x[j]){
                    cont++;
                }
            }
            if (cont > grau){
                grau = cont;
            }
        }
        System.out.println("\n" + grau);
    }
}