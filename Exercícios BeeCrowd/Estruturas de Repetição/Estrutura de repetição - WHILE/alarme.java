import java.util.Scanner;

public class alarme {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int h1 = s.nextInt();
        int m1 = s.nextInt();
        int h2 = s.nextInt();
        int m2 = s.nextInt();

        while(h1 > 0 || h2 > 0 || m1 > 0 || m2 > 0){

            int horaInicial = (h1*60) + m1;
            int horaFinal = (h2*60) + m2;
            int minTotal = horaFinal - horaInicial;

            if(h1 == h2 && m1 > m2 || h1 == h2 && m1 == m2 || h1 > h2){
                minTotal += 1440;
                System.out.println(minTotal);
            }else{
                System.out.println(minTotal);
            }
            h1 = s.nextInt();
            m1 = s.nextInt();
            h2 = s.nextInt();
            m2 = s.nextInt();
        }
    }
}