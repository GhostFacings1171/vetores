import java.util.Random;

public class ex5 {
    static void main() {
        Random random = new Random();
        int[] x = new int[10];
        int aux, j;

        System.out.println("Antes da inversao");

        //geração dos numeros aleatórios
        for (int i = 0; i < x.length; i++) {
            x[i] = random.nextInt(1, 30);
            System.out.print(x[i] + " ");
        }

        //inversão dos valores
        j = x.length - 1;
        for (int i = 0; i < x.length/2; i++, j--) {
            aux = x[i];
            x[i] = x[j];
            x[j] = aux;
        }

        //impressão pós inversão
        System.out.println("\n Depois da inversao");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }
}
