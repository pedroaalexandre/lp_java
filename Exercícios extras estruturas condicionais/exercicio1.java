/*Exercícios extras sobre estruturas condicionais*/

import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     
     int a,b;
     a = s.nextInt();
     b = s.nextInt();

     if (a > b){
        System.out.println("O maior número é " + a);
     }else{
        System.out.println("O maior número é " + b);
     }
    }
}