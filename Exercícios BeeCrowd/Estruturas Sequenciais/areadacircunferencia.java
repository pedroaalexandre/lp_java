//area da circunferencia: A=π*r^2
import java.util.Scanner;
public class areadacircunferencia {
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);

        double π = 3.14159;
        double r = s.nextDouble();
        double A = π*(r*r);

        System.out.printf("A=%.4f%n", A);         //para definir o nº de casa decimais => %.xf%n (x=nº de casas decimais desejado)
    }
}