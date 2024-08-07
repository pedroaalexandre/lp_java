import java.util.Scanner;

public class ERW05_validarSalarios {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //ler a variável "salario"
        double salario = s.nextDouble();

        //declaração do contador "media", para saber quantos salários deram entrada e "somaSalario", para computar a soma de cada salário que deu entrada
        int media = 0;
        double somaSalario = 0;

        //Enquanto o salário for maior que 100000 e menor 0, irá continuar na estrutura
        while (salario < 100000 && salario > 0){
            //contador que quantos salários passaram pela estrutura
            media += 1;

            //soma dos salários que passaram pela estrutura
            somaSalario += salario;

            //nova leitura da variável "salario"
            salario = s.nextDouble();
        }
        //imprimir a média de salários
        System.out.printf("R$ %.2f\n", (somaSalario/media));
    }
}