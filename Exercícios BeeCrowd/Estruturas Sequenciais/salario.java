import java.util.Scanner;

public class salario {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int N = s.nextInt(); //N = número do funcionário
    int H = s.nextInt(); //H = horas trabalhadas
    double S = s.nextDouble(); //S = salário do funcionário
    double $ = (S*H); //quanto o funcionário deve receber
    
    System.out.println("NUMBER = " + N);
    System.out.printf("SALARY = U$ %.2f%n",$);

    }
}