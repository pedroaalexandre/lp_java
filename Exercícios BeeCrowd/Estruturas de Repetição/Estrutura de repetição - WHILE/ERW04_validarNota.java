import java.util.Scanner;

public class ERW04_validarNota {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        double n = s.nextDouble();

        do{
            if(n >= 0 && n <= 10 || n >= 100 && n <= 200){
                System.out.println(n);
                break;
            }else{
                System.out.println("nota invalida");
                n = s.nextDouble();
            }
        }while(n >= 0 && n <= 10 || n >= 100 || n <= 200);
    }
}