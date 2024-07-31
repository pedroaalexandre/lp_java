/*Ler o peso e altura do usuário. Em seguida, mostre o valor do Índice de Massa Corporal (IMC) dessa pessoa. Fórmula: IMC = peso / altura2.*/

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double peso, altura, imc;

        peso = s.nextDouble();
        altura = s.nextDouble();

        imc = peso/(altura*altura);

        System.out.printf("%.3f\n",imc);
    }
}
