import java.util.Scanner;

public class sequencia_de_numeros {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Leitura de variáveis        
        int m = s.nextInt();
        int n = s.nextInt();

        //Enquanto m e n forem maiores que 0, continue executando
        while (m > 0 && n > 0){
            //tirando qual é o menor e maior valores entre m & n
            int menor = Math.min(m, n);
            int maior = Math.max(m, n);

            //Adicionando uma variável para somar todos números entre m e n
            int soma = 0;

            //Adicionando while para, sempre que a varíavel "menor" for menor que a variável "maior", somará o valor
            while (menor <= maior) {
                System.out.print(menor+" ");
                soma += menor;
                menor += 1;
            }
            //Imprimir a soma e receber novos valores para m e n
            System.out.println("Sum="+soma);
            m = s.nextInt();
            n = s.nextInt();
        }
    }
}