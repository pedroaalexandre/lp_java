import java.util.Scanner;

public class tempodejogo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x, y, d;
        x = s.nextInt(); //hora inicial
        y = s.nextInt(); //hora final

        if (x > y){
            d = (y + 24) - x;
            System.out.printf("O JOGO DUROU %d HORA(S)\n", d);      //caso x for maior que y é necessário somar 24 horas ao y, para ficar equivalente

        }else if (x == y){
            d = (x - y) + 24;
            System.out.printf("O JOGO DUROU %d HORA(S)\n", d);      //se x for exatamente igual y significa que se passaram 24 horas
        
        }else{
            d = y - x;
            System.out.printf("O JOGO DUROU %d HORA(S)\n", d);
        }
    }
}