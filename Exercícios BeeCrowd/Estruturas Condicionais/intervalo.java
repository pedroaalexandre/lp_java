import java.util.Scanner;

public class intervalo {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        float X = s.nextFloat();

        if(X >= 0 && X <= 25){
            System.out.println("Intervalo [0,25]");

        }else if (X > 25 && X <= 50){
            System.out.println("Intervalo (25,50]");

        }else if (X > 50 && X <= 75){
            System.out.println("Intervalo (50,75]");
        
        }else if (X > 75 && X <= 100){
            System.out.println("Intervalo (75,100]");

        }else{
            System.out.println("Fora de intervalo");
        }

    }

}