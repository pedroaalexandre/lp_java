import java.util.Scanner;

public class sequencia_de_numeros {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int m = s.nextInt();
        int n = s.nextInt();

        while (m > 0 && n > 0){
            int menor = Math.min(m, n);
            int maior = Math.max(m, n);
            int soma = 0;
            while (menor <= maior) {
                System.out.print(menor+" ");
                soma += menor;
                menor += 1;
            }
            System.out.println("Sum="+soma);
            m = s.nextInt();
            n = s.nextInt();
        }
    }
}