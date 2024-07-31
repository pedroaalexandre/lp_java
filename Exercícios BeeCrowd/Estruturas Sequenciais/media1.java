import java.util.Scanner;

public class media1 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        double A = s.nextDouble();
        double B = s.nextDouble();
        double MEDIA = ((A * 3.5) + (B * 7.5)) / 11;        //média ponderada

        System.out.printf("MEDIA = %.5f%n", MEDIA);

    }
}
