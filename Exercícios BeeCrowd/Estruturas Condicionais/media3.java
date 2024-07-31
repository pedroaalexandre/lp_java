import java.util.Scanner;

public class media3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        float n1, n2, n3, n4;

        n1 = s.nextFloat() * 2;         //entrada das notas multiplicado a seus respectivos pesos
        n2 = s.nextFloat() * 3;
        n3 = s.nextFloat() * 4;
        n4 = s.nextFloat() * 1;

        float media = (n1 + n2 + n3 + n4)/10;           //fórmula media ponderada
        System.out.printf("Media: %.1f\n", media);      //impressão da media

        if (media >= 7.0){
            System.out.println("Aluno aprovado.");          //Se a media for maior ou igual a 7.0 imprimir Aluno aprovado e ir para o final do código

        }else if (media < 5.0){
            System.out.println("Aluno reprovado.");         //Se a media for menor que 5.0 imprimir Aluno reprovado e ir para o final do código

        }else if (media >= 5.0 && media <= 6.9){            //Se a media estiver entre 5.0 e 6.9 imprimir Aluno em exame e seguir para uma nova variável a ser declarada
            System.out.println("Aluno em exame.");
            float n5 = s.nextFloat();
            System.out.printf("Nota do exame: %.1f\n", n5); //Imprime a nota do novo exame realizado
            float media2 = ((media+n5)/2);                  //nova media: media inicial + media exame / 2
                if (media2 >= 5.0) {
                    System.out.println("Aluno aprovado.");  //Se a nova media(media2) for maior ou igual a 5, imprime Aluno aprovado
                }else{
                    System.out.println("Aluno reprovado."); //Se a nova media(media2) for menor que 5, imprime Aluno reprovado
                }
            System.out.printf("Media final: %.1f\n", media2); //imprimir media final
        }
    }
}