import java.util.Scanner;

public class resto_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n;
        //por qual número eu quero dividir os números de 1 a 10000?
        n = s.nextInt();

        for(int i = 1; i <= 10000; i++){
            if(i % n == 2){
                System.out.println(i);
            }
        }
    }
}