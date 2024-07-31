import java.util.Scanner;

public class maior_e_posicao {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //declaração de variáveis
        int n,x,i,count;

        //inicialização das variaveis x e count, pois, se iniciá-las dentro do for, sempre que for repetir a ação elas voltaram a ser 0
        x = 0;
        count = 0;

        //contar 100 números
        for(i = 1; i <= 100; i++){
            n = s.nextInt();

            //o x tomará o valor de n sempre que n for maior que x e, além disso, quando n for maior do que x, a variavel count tomara o valor do i
            if(n > x){
                x = n;
                count = i;
            }
        }
        System.out.println(x);
        System.out.println(count);
    }
}