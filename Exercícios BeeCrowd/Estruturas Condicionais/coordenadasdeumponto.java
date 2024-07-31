import java.util.Scanner;

public class coordenadasdeumponto {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        double x,y;
        x = s.nextDouble();
        y = s.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("Q1");           //Quandrante 1

        }else if (x < 0 && y > 0){
            System.out.println("Q2");           //Quandrante 2

        }else if (x < 0 && y < 0){
            System.out.println("Q3");           //Quandrante 3

        }else if (x > 0 && y < 0){
            System.out.println("Q4");           //Quandrante 4

        }else if (x == 0 && y < 0 || y > 0){    //Eixo X
            System.out.println("Eixo Y");

        }else if (y == 0 && x < 0 || x > 0){    //Eixo Y
            System.out.println("Eixo X");
        
        }else if (x==0 && y==0){
            System.out.println("Origem");       //Origem
        }
    }
}
