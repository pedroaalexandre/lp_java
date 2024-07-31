import java.util.Scanner;

public class multiplos{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int A,B;
        A = s.nextInt();        //leitura dos valores inteiros
        B = s.nextInt();

        /*Necessário fazer uma divisão, em que se o resto for 0, os números são multiplos.
        Assim, antes é preciso saber qual dos nº é maior, para a divisão dar certo. Logo se
        segue para as condições: 
        Se A for maior que B - divida A / B;
        Se B for maior que A - divida B / A.
        Se o resto da divisão for 0, eles são multiplos.*/

        if (A > B){
            if (A % B == 0){
                System.out.println("Sao Multiplos");
            }else{
                System.out.println("Nao sao Multiplos");
            }

        }else if (B > A){
            if (B % A == 0){
                System.out.println("Sao Multiplos");
            }else{
                System.out.println("Nao sao Multiplos");
            }
        }

    }
}