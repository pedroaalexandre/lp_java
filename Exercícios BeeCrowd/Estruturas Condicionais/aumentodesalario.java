import java.util.Scanner;

public class aumentodesalario {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double x,y;                     //Declaração variáveis

        x = s.nextDouble();             //Leitura variável - Salário atual

        if(x >= 0 && x <= 400.0){
            y = (x * 0.15) + x;         //Fórmula: Salário atual * Porcentagem de aumento + Salário atual = Novo salário
            System.out.printf("Novo Salario: %.2f\n", y);               //Impressão novo salário
            System.out.printf("Reajuste de ganho: %.2f\n", y - x);      //Impressão valor reajustado
            System.out.println("Em percentual: 15 %");                  //Impressão porcentagem reajustada

        }else if(x > 400 && x <= 800.0){
            y = (x * 0.12) + x;
            System.out.printf("Novo Salario: %.2f\n", y);
            System.out.printf("Reajuste de ganho: %.2f\n", y - x);
            System.out.println("Em percentual: 12 %");

        }else if(x > 800 && x <= 1200.0){
            y = (x * 0.10) + x;
            System.out.printf("Novo Salario: %.2f\n", y);
            System.out.printf("Reajuste de ganho: %.2f\n", y - x);
            System.out.println("Em percentual: 10 %");

        }else if(x > 1200 && x <= 2000.0){
            y = (x * 0.07) + x;
            System.out.printf("Novo Salario: %.2f\n", y);
            System.out.printf("Reajuste de ganho: %.2f\n", y - x);
            System.out.println("Em percentual: 7 %");

        }else if(x > 2000){
            y = (x * 0.04) + x;
            System.out.printf("Novo Salario: %.2f\n", y);
            System.out.printf("Reajuste de ganho: %.2f\n", y - x);
            System.out.println("Em percentual: 4 %");
        }
        
    }
}
