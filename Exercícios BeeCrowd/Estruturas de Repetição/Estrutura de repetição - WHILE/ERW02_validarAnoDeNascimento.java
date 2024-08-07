import java.util.Scanner;

public class ERW02_validarAnoDeNascimento {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        //leitura da variável "ano"
        int ano = s.nextInt();

        //condição do while para ler diferentes anos digitados, se for entre 1900 e 2023 é válido e encerra o programa, se for diferente desse intervalo imprime: Ano invalido
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