/* Em um determinado estado, para transferências de veículos, o DETRAN cobra uma taxa de 1% para carros fabricados antes de 2000 e uma taxa de 1.5% para os fabricados de 2000 em diante. A taxa incide sobre o valor do carro. Faça um programa que recebe como entrada o ano e o preço do carro, calcule e imprima o valor a ser pago.
- Para carros fabricados antes de 2000: taxa=valor_carro*0.01
- Para carros fabricados após 2000: taxa=valor_carro*0.015 */

import java.util.Scanner;

public class exercicio6{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        int ano;
        double valorCarro, taxa;
        ano = s.nextInt();
        valorCarro = s.nextDouble();

        if(ano < 2000){
            taxa = valorCarro * 0.01;
            System.out.printf("Taxa de transferência é %.2f\n", taxa);

        }else{
            taxa = valorCarro * 0.015;
            System.out.printf("Taxa de transferência é %.2f\n", taxa);
        }
    }
}