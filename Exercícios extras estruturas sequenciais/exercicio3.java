/*Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida, mostrar o valor da área, perímetro e diagonal deste retângulo, conforme exemplo.
Para fazer a raiz quadrada utilize a função Math.sqrt(base2 + altura2)*/

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double base, altura, area, perimetro, diagonal;

        base = s.nextDouble();
        altura = s.nextDouble();

        area = base*altura;
        perimetro = (base * 2) + (altura * 2);
        diagonal = Math.sqrt((base * base) + (altura * altura));

        System.out.println("AREA = " + area);
        System.out.println("PERIMETRO = " + perimetro);
        System.out.printf("DIAGONAL = %.4f\n", diagonal);


    }    
}
