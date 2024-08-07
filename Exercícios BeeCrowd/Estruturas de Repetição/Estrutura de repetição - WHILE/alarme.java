import java.util.Scanner;

public class alarme {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //leitura de todas as variáveis
        int h1 = s.nextInt();
        int m1 = s.nextInt();
        int h2 = s.nextInt();
        int m2 = s.nextInt();

        //while criado com todas as condições para definir se irá repetir ou não
        while(h1 > 0 || h2 > 0 || m1 > 0 || m2 > 0){

            //transformação das horas em minutos
            int horaInicial = (h1*60) + m1;
            int horaFinal = (h2*60) + m2;

            //criação de variável com o cálculo total de minutos
            int minTotal = horaFinal - horaInicial;

            //condição se as horas digitadas forem iguais, ou a hora 1 for maior que a hora 2, para que o programa ajuste e entenda que se passaram 24 horas
            if(h1 == h2 && m1 > m2 || h1 == h2 && m1 == m2 || h1 > h2){
                minTotal += 1440;

                //impressão dos minutos totais
                System.out.println(minTotal);
            }else{
                //impressão dos minutos totais
                System.out.println(minTotal);
            }

            //nova leitura das variáveis
            h1 = s.nextInt();
            m1 = s.nextInt();
            h2 = s.nextInt();
            m2 = s.nextInt();
        }
    }
}