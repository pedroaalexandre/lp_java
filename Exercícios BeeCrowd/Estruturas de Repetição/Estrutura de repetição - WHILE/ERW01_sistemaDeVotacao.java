import java.util.Scanner;

public class ERW01_sistemaDeVotacao {
    public static void main(String[] args) {
         Scanner s = new Scanner (System.in);
        
         //leitura de variável n e atribuição de outras variáveis que vão servir como contadores de votos
         int n = s.nextInt();
         int cand1 = 0;
         int cand2 = 0;
         int cand3 = 0;
         int nulo = 0;
         int branco = 0;

         do{
            if(n == 1){
                cand1 += 1;
            }else if (n == 2){
                cand2 += 1;
            }else if (n == 3){
                cand3 += 1;
            }else if(n == 4){
                nulo += 1;
            }else if(n == 5){
                branco += 1;
            }else{
                break;
            }
            n = s.nextInt();
         }while (n > 0);

         //impressão da quantidade de cada voto para cada candidato e branco ou nulo
         System.out.println("Candidato 1 : "+cand1+" voto(s)");
         System.out.println("Candidato 2 : "+cand2+" voto(s)");
         System.out.println("Candidato 3 : "+cand3+" voto(s)");
         System.out.println("Nulos : "+nulo+" voto(s)");
         System.out.println("Brancos : "+branco+" voto(s)");
    }
}