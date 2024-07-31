/* Faça um programa para calcular o peso ideal de uma pessoa. Dados de entrada: altura (em metros, ex.: 1,70) e sexo (M: masculino e F: feminino). Fórmula para cálculo do peso:
- peso ideal de homem = (72,7 * altura) - 58
- peso ideal da mulher = (62,1 * altura) - 44,7 */


import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double altura, pesoIdeal;
        String sexo;

        altura = s.nextDouble();
        sexo = s.next();

        if(sexo.equals("M")){
            pesoIdeal = (72.7 * altura) - 58;
            System.out.printf("O peso ideal é %.2f\n", pesoIdeal);

        }else if(sexo.equals("F")){
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("O peso ideal é %.2f\n", pesoIdeal);
        }

    }
}
