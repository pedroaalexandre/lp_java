import java.util.Scanner; //biblioteca para entrada de teclado

public class consumo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int X = s.nextInt();           //valor de entrada para a variável X (distância total em Km)
        double Y = s.nextDouble();    //valor de entrada para a variável Y (total de combustível gasto)
        double kmpl = X/Y;           //cálculo km/l (distância divida pelo combustível gasto)
        
        System.out.printf("%.3f km/l\n", kmpl);
    }
}