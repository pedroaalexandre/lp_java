import java.util.Scanner;

public class intervalo_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n, x, soma_1 = 0, soma_2 = 0;

        //Quantos números serão lidos?
        n = s.nextInt();
        
        //Leitura de n números
        for (int i=0; i < n; i++){
            x = s.nextInt();

            //Se 10 < x < 20 adicione mais 1 à variável soma_1
            if(x >= 10 && x <= 20){
                soma_1 += 1;

            //Se não estiver adicione mais 1 à variável soma_2
            }else{
                soma_2 += 1;
            }
        }
        System.out.println(soma_1+" in");
        System.out.println(soma_2+" out");
    }
}