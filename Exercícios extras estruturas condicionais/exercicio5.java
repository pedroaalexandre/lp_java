/* A escola #PROGRAMAR faz o pagamento de seus professores por hora/aula. Faça um programa que calcule e exiba o salário de um professor. O programa irá receber como entrada o nível e a quantidade de horas de trabalho do professor. Sabe-se que o valor da hora/aula segue a tabela abaixo:

Nível   Hora/aula
1       R$ 12.00
2       R$ 17.00
3       R$ 25.00
*/

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int nivel, horas;
        double salario;
        nivel = s.nextInt();
        horas = s.nextInt();

        if(nivel == 1){
            salario = horas * 12.0;
            System.out.printf("O pagamento é de %.2f\n", salario);

        }else if(nivel == 2){
            salario = horas * 17.0;
            System.out.printf("O pagamento é de %.2f\n", salario);

        }else{
            salario = horas * 25.0;
            System.out.printf("O pagamento é de %.2f\n", salario);
        }
    }
}
