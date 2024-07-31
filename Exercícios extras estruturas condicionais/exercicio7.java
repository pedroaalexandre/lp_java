/*Um banco concederá um crédito especial aos seus clientes, baseado no saldo médio no último ano. Faça um programa receberá como entrada o saldo médio de um cliente e irá calcular o valor do crédito de acordo com a tabela a seguir. Imprima uma mensagem informando o saldo médio e o valor do crédito.
Saldo                   Médio Percentual
0.00 a 200.00           Sem direito a crédito
201.00 a 400.00         20% do valor do saldo médio
401.00 a 600.00         30% do valor do saldo médio
Acima de 601.00         40% do valor do saldo médio*/

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double saldo, percentual;
        saldo = s.nextDouble();

        if (saldo >= 0 && saldo <= 200) {
            System.out.println("Sem direito a crédito");

        }else if (saldo > 200 && saldo <= 400){
            percentual = saldo * 0.2;
            System.out.printf("Valor de crédito é %.2f\n", percentual);

        }else if (saldo > 400 && saldo <= 600){
            percentual = saldo * 0.3;
            System.out.printf("Valor de crédito é %.2f\n", percentual);

        }else{
            percentual = saldo * 0.4;
            System.out.printf("Valor de crédito é %.2f\n", percentual);
        }

    }
}
