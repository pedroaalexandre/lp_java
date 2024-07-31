import java.util.Scanner;

public class ERW05_validarSalarios {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double salario = s.nextDouble();
        int media = 0;
        double somaSalario = 0;

        while (salario < 100000 && salario > 0){
            media += 1;
            somaSalario += salario;
            salario = s.nextDouble();
        }
        System.out.printf("R$ %.2f\n", (somaSalario/media));
    }
}