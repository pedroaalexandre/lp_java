/*O preço das maçãs de uma frutaria custam R$ 0,30 cada se forem compradas menos do que uma dúzia, e R$ 0,25 se forem compradas pelo menos doze. Escreva um programa que leia o número de maçãs compradas, calcule e escreva o valor total da compra.*/

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        double precoMacas, quantMacas;
        quantMacas = s.nextDouble();

        if(quantMacas < 12){
            precoMacas = quantMacas * 0.30;
            System.out.printf("Valor da compra é %.2f\n", precoMacas);
            
        }else{
            precoMacas = quantMacas * 0.25;
            System.out.printf("Valor da compra é %.2f\n", precoMacas);
        }
    }
}
