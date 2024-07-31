import java.util.Scanner;

public class soma_de_impares_consecutivos_i {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int y = s.nextInt();
        int soma_impares = 0;

        int menor = Math.min(x, y);
        int maior = Math.max(x, y);

        for(int i = menor + 1;  i < maior; i++){
            if(i % 2 != 0){
                soma_impares += i;
            }else{

            }
        }
        System.out.println(soma_impares);
    }
}
