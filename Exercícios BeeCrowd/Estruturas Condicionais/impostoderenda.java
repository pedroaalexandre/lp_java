import java.util.Scanner;

public class impostoderenda {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double salario, imposto;
        salario = s.nextDouble();

        if(salario >= 0 && salario <= 2000.0){
            System.out.println("Isento");

        }else if(salario > 2000 && salario <= 3000.0){
            imposto = (salario - 2000) * 0.08;
            System.out.printf("R$ %.2f\n", imposto);

        }else if(salario > 3000 && salario <= 4500.0){
            imposto = (salario - (salario - 1000)) * 0.08 + ((salario - 3000) * 0.18);
            System.out.printf("R$ %.2f\n", imposto);
            

        }else if (salario > 4500.0){
            imposto = (salario - (salario - 1000)) * 0.08 + (salario - (salario - 1500)) * 0.18 + ((salario - 4500) * 0.28);
            System.out.printf("R$ %.2f\n", imposto);
        }
    }    
}