import java.util.Scanner;

public class salariocombonus {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String nome = s.nextLine(); //entrada nome funcionário
        double $ = s.nextDouble(); //entrada salário fixo
        double vendas = s.nextDouble(); //entrada valor vendas realizadas
        double c = vendas*(0.15); //valor comissão

        System.out.printf("TOTAL = R$ %.2f%n", $+c);

    }
}