import java.util.Scanner;

public class media2 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        double A = s.nextDouble(); //leitura das variáveis
        double B = s.nextDouble();
        double C = s.nextDouble();

        A = A*2; //A tem peso 2
        B = B*3; //B tem peso 3
        C = C*5; //C tem peso 5

        double M = ((A+B+C)/10);

        System.out.printf("MEDIA = %.1f%n", M);
    }
}