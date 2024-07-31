import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        int n = s.nextInt();

        for(int i = 1; i <= 10; i++){
            int x = n * i;
            System.out.print(i+" x "+n);
            System.out.println(" = "+x);
        }
    }
}