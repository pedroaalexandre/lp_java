import java.util.Scanner;

public class diferenca {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        int A = s.nextInt(); //leitura de variáveis - entradas
        int B = s.nextInt();
        int C = s.nextInt();
        int D = s.nextInt();

        D = (A*B - C*D); //fórmula diferença produtos (D = DIFERENCA)

        System.out.println("DIFERENCA = " + D); //impressão do resultado

    }
}
