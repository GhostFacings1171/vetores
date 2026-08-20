import java.util.Random;

public class randomsemrepeticao {
    static void main() {
        Random random = new Random();
        int[] x = new int[10];
        boolean achou;

        for (int i = 0; i < x.length;) {
            x[i] = random.nextInt(15);
            achou = false;
            for (int j = 0; j < i; j++) {
                if (x[i] == x[j]){
                    achou = true;
                    break;
                }
            }
            if (achou == false){
                System.out.print(x[i] + "\t");
                i++;
            }
        }
    }
}
