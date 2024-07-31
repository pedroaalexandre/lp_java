import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double a, b, c, d;
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();

        //formula para submeter se é triângulo: |a - b| < c < a + b 
        if(Math.abs(a - b) < c && c < a + b || Math.abs(a - c) < b && b < a + c || Math.abs(b - c) < a && a < b + c){
            d = a + b + c;                                               
            System.out.printf("Perimetro = %.1f\n",d);
            
        //formula para área do trapézio: ((B + b)*h)/2 --> Com 'a' e 'b' como bases e 'c' como altura.
        }else{
            d = ((a + b) * c) / 2;
            System.out.printf("Area = %.1f\n", d);
        }

    }
}
