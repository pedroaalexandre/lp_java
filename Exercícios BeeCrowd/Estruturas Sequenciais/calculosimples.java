import java.util.Scanner;

public class calculosimples {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

            int peca1 = s.nextInt(); int n1 = s.nextInt(); double vu1 = s.nextDouble(); //entrada n1: cód. da peça1 ; n1: quantidade ; vu1: valor unitário peça1
            int peca2 = s.nextInt(); int n2 = s.nextInt(); double vu2 = s.nextDouble(); //entrada n2: cód. da peça2 ; n2: quantidade ; vu2: valor unitário peça2
            Double T = ((vu1*n1) + (vu2*n2)); //cálculo valor total a ser pago | valor unitário * quantidade

            System.out.printf("VALOR A PAGAR: R$ %.2f%n",T); //Imprimir na tela | VALOR A PAGAR: R$ T
    }
}