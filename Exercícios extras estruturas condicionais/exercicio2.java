/*Faça um programa que irá receber como entrada três valores inteiros distintos e informar qual deles é o menor.*/

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a,b,c;
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

        if (a < b && a < c){
            System.out.println("O menor número é " + a);
        }else if (b < a && b < c){
            System.out.println("O menor número é " + b);
        }else{
            System.out.println("O menor número é " + c);
        }
    }
}
