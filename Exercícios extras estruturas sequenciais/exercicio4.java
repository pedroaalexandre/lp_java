/*Fazer um programa para ler o nome (apenas uma palavra) e idade de duas pessoas. Ao final mostrar uma mensagem com os nomes e a idade média entre essas pessoas.*/

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String nome1, nome2;
        Double idade1, idade2, idadeMedia;

        nome1 = s.next();
        idade1 = s.nextDouble();
        nome2 = s.next();
        idade2 = s.nextDouble();
        idadeMedia = (idade1 + idade2)/2;

        System.out.printf("A idade média de %s e %s é de %.1f anos\n", nome1, nome2, idadeMedia);
    }
}
