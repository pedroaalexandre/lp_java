//biblioteca para Scannear a entrada do teclado
import java.util.Scanner;

public class esfera {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in); //definindo s para Scanner

        double pi = 3.14159;  //definição da variável 'pi'
        double R = s.nextDouble();  //entrada da variável 'R' (Raio da esfera)
        double volume = (4/3.0)*pi*(R*R*R); //criação de variável com fórmula de cálculo do volume da esfera

        System.out.printf("VOLUME = %.3f\n", volume);

    }
}