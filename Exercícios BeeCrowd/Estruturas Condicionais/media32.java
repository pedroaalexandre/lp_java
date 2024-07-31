import java.util.Scanner;

public class media32{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double n1 = s.nextDouble()*2.0;
        double n2 = s.nextDouble()*3.0;
        double n3 = s.nextDouble()*4.0;
        double n4 = s.nextDouble()*1.0;
        double media = (n1+n2+n3+n4)/10.0;

        if(media >= 7.0){
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno aprovado.");

        }else if(media < 5.0){
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno reprovado.");

        }else if(media >= 5.0 && media <= 6.9){
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno em exame.");
            double exame = s.nextDouble();
            System.out.printf("Nota do exame: %.1f\n",exame);
            double media2 = (media + exame)/2;

            if(media2 > 5.0){
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n", media2);
            }else{
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f\n", media2);
            }
        }
    }
}