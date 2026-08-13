import java.util.Scanner;

public class ex4 {
    static void main() {
        Scanner sc= new Scanner(System.in);
        double[] temp = new double[12];
        String[] mes = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        double md = 0;
        // entrada de dados
        for (int i = 0; i < temp.length; i++) {
            System.out.printf("Temperatura media de " + mes[i] + ": ");
            temp[i] = sc.nextDouble();
            md = md + temp[i];
        }
        md = md/ temp.length;
        System.out.println("media anual " + String.format("%.2f", md));
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] >= md){
                System.out.print(String.format("%8s", mes[i]) + ": ");
                System.out.println(String.format("%.2f", temp[i]));
            }
        }
    }
}
