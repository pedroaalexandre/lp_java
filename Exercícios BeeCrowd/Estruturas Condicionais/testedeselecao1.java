import java.util.Scanner;

public class testedeselecao1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int A, B, C, D; // definição de variáeis inteiras

        A = s.nextInt(); // leitura da variável inteira A
        B = s.nextInt(); // leitura da variável inteira B
        C = s.nextInt(); // leitura da variável inteira C
        D = s.nextInt(); // leitura da variável inteira D

        if (B > C && D > A && C + D > A + B && C > 0 && D > 0 && A % 2 == 0) { // Condições definidas: B maior que C ; D
                                                                               // maior que A ; Soma de C + D maior que
                                                                               // soma de A + B ; C e D números
                                                                               // positivos ; A sendo par
            System.out.println("Valores aceitos"); // Se encaixar em todas as condições definidas imprimir "Valores
                                                   // aceitos"
        } else {
            System.out.println("Valores nao aceitos"); // Se não se encaixar imprimir "Valores nao aceitos"

        }

    }
}
