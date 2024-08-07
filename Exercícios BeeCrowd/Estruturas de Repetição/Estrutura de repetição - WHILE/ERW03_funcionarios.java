import java.util.Scanner;

public class ERW03_funcionarios {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        //variável char continuidade, que será a condição para entrar no while, por isso já começa com o valor "s"
        char continuidade = 's';
        
        //criação de todas as variáveis
        double salario = 0, somaSalario = 0, mediaSalario = 0;
        int idade = 0, media = 0, mulheres = 0;

        //criação das variáveis maior e menor, que servirão para definir o maior e o menor números aplicados na variável idade, posteriormente
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        //condição para entrar na estrutura de repetição: char continuidade = 's'
        while (continuidade == 's'){

            //leitura das variáveis 'idade', 'sexo', 'salario' e 'continuidade'
            idade = s.nextInt();
            char sexo = s.next().charAt(0);
            salario = s.nextDouble();
            continuidade = s.next().charAt(0);

            //Se o sexo for 'f' (feminino) e tiver um salario maior que 300, adicionar +1 à variável 'mulheres', que servirá para contador final de quantas mulheres ganham mais de R$ 3000
            if(sexo == 'f' && salario > 3000){
                mulheres += 1;
            }

            //Se a idade for maior que a variável "maior", o valor da variável "maior" agora passa a ser substituido pelo valor da variável "idade"
            if(idade > maior){
                maior = idade;
            }
            //Se a idade for menor que o valor da variável "menor", o valor da variável "menor" agora passa a ser substituído pelo valor da variável "idade" 
            if(idade < menor){
                menor = idade;
            }

            //somar +1 na média para ajustar e somar os salários à variável "somaSalario"
            media += 1;
            somaSalario += salario;

        }
        //cálculo da média dos salários atribuídos à variável "mediaSalario"
        mediaSalario = somaSalario/media;

        //impressão da média dos salários, menor e maior idade e quantidade de mulheres que ganham mais de R$ 3000 respectivamente
        System.out.printf("Media salarios = R$ %.2f\n", (mediaSalario));
        System.out.println("Menor e maior idade = " + menor + " e " + maior);
        System.out.println("Salarios de mulheres acima de R$ 3000.00 = "+mulheres);
    }
}