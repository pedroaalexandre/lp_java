import java.util.Scanner; //leitura de entradas do teclado

public class omaior {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();        //entrada variável a
        int b = s.nextInt();        //entrada variável b
        int c = s.nextInt();        //entrada variável c

        int d = ((a+b)+(Math.abs(a-b)))/2;          //o maior entre 'a' e 'b' -- defino essa variável como 'd'
        int maior = ((c+d) + (Math.abs(c-d)))/2;    //o maior entre 'c' (variável definida pela entra do teclado) e 'd' (maior entra 'a' e 'b')

        System.out.println(maior + " eh o maior");

    }
}