import java.util.Scanner;

public class par_ou_impar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n, x;
        n = s.nextInt();

        for(int i = 0; i < n; i++){
            x = s.nextInt();

            //NULL
            if(x == 0){
                System.out.println("NULL");
            //ODD (negativo)
            }else if(x % 2 != 0){
                //POSITIVE
                if(x > 0){
                    System.out.println("ODD POSITIVE");
                //NEGATIVE
                }else{
                    System.out.println("ODD NEGATIVE");
                }
            //EVEN (par)   
            }else if(x % 2 == 0){
                //POSITIVE
                if(x > 0){
                    System.out.println("EVEN POSITIVE");
                //NEGATIVE
                }else{
                    System.out.println("EVEN NEGATIVE");
                }
            }
        }
    }
}
