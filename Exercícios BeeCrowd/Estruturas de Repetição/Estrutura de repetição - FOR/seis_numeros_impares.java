import java.util.Scanner;

public class seis_numeros_impares{
    public static void main (String[]args){
        Scanner s = new Scanner(System.in);

        //declaração de uma variável x
        int x = s.nextInt();

        //se o número declarado for ímpar, irá printar o número e imprimir somente os 5 numeros ímpares
        if(x % 2 != 0){
            System.out.println(x);

        //estrutura de repetição para repetir o ação de somar 2 números ao x 5 vezes.
            for (int i=0; i < 5; i++){
                x += 2;
                System.out.println(x);
            }

        //se o número declarado for par, irá somar +1 a ele, printar e imprimir os próximos 5 numeros impares
        }else if (x % 2 == 0){
            x += 1;
            System.out.println(x);
            for (int i=0; i < 5; i++){
                x += 2;
                System.out.println(x);
            }  
        }
    }
}