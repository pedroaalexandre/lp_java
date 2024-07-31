import java.util.Scanner;  //biblioteca para Scannear o teclado

public class area {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double pi = 3.14159;             //criação da variável 'pi' (será utilizada na área do círculo)]
        double A = s.nextDouble();      //entrada variável A
        double B = s.nextDouble();     //entrada variável B
        double C = s.nextDouble();    //entrada variável C

        double tri = ((A*C)/2);         //área do triângulo: metade do produto entre base e altura  -- A = base ; C = altura
        double circ = ((pi)*(C*C));    //área do círculo: o produto entre pi e o quadrado do raio -- C = raio
        double trap = (((A+B)*C)/2);  //área do trapézio: base maior + base menor, vezes a altura, divido por 2 -- A & B = bases ; C = altura
        double quad = (B*B);         //área do quadrado: lado ao quadrado ; B = lado
        double ret = (A*B);         //área do retângulo: lado * lado ; A & B = lado

        System.out.printf("TRIANGULO: %.3f\n", tri);        //impressão resultado
        System.out.printf("CIRCULO: %.3f\n", circ);
        System.out.printf("TRAPEZIO: %.3f\n", trap);
        System.out.printf("QUADRADO: %.3f\n", quad);
        System.out.printf("RETANGULO: %.3f\n", ret);


    }
}