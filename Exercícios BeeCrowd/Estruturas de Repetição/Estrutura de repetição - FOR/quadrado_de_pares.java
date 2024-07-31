import java.util.Scanner;

public class quadrado_de_pares{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n, x;
        //Até qual número vai contar?
        n = s.nextInt();

        //Contar de 1 até o numero n. Se o número for PAR, multiplique-o por ele mesmo e salve o valor na variável x.
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                x = i*i;
                System.out.println(i+"^2 = "+x);
            }else{

            }
         }
    }
}
