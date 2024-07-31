/*Fazer um programa para ler as medidas de frente(base) e lados(altura) de um terreno retangular,
bem como o preço do metro quadrado do terreno. Depois, mostrar a área e preço total do terreno.
Considere todos números inteiros.*/

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int frente, lados, preco, area, precoTotal;

        frente = s.nextInt();
        lados = s.nextInt();
        preco = s.nextInt();

        area = frente * lados;
        precoTotal = area * preco;

        System.out.println("Area = " + area);
        System.out.println("Preco = " + precoTotal);
    }
}