/*Faça um programa que receberá como entrada as três notas obtidas por um aluno durante o semestre. Calcular a sua média (aritmética) e depois informar se o aluno foi Aprovado (media >= 7), Reprovado (media <=5) ou está de recuperação Recuperação (media entre 5.1 a 6.9).*/

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double n1, n2, n3, media;

        n1 = s.nextDouble();
        n2 = s.nextDouble();
        n3 = s.nextDouble();
        media = (n1 + n2 + n3)/3;

        if(media >= 7){
            System.out.println("O aluno foi Aprovado");

        }else if(media <= 5){
            System.out.println("O aluno está Reprovado");

        }else{
            System.out.println("O aluno está de Recuperação");
        }
    }
}
