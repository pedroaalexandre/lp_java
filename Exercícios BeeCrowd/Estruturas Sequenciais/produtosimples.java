import java.util.Scanner;

public class produtosimples {
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);

        int X = s.nextInt();
        int Y = s.nextInt();
        int PROD = X*Y;

        System.out.println("PROD = " + PROD);
    }
    
}
