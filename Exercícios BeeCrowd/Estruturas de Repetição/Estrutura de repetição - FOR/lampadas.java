import java.util.Scanner;

public class lampadas {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        int n,x,a,b;

        n = s.nextInt();

        a = 0;
        b = 0;


        for(int i = 0; i < n; i++){
            x = s.nextInt();

            if(x == 1 && a == 0){
                a = 1;

            }else if (x == 2 && a == 0 && b == 0){
                a = 1;
                b = 1;

            }else if (x == 1 && a == 1){
                a = 0;

            }else if (x == 2 && a == 1 && b == 1){
                a = 0;
                b = 0;

            }else if (x == 2 && a == 1 && b == 0){
                a = 0;
                b = 1;

            }else if(x == 2 && a == 0 && b == 1){
                a = 1;
                b = 0;
            }
        }
        System.out.println(a);
        System.out.println(b);
    }
}
