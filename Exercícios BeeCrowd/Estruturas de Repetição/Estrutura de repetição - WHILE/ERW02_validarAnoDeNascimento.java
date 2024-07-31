import java.util.Scanner;

public class ERW02_validarAnoDeNascimento {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        int ano = s.nextInt();

        do{
            if(ano >= 1900 && ano <= 2023){
                System.out.println(ano);
                break;
            }else{
                System.out.println("Ano invalido");
            }
            ano = s.nextInt();
        }while(ano > 0);
    }
}