import java.util.Scanner;

public class Lanche {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        //1 - Cachorro-quente - R$ 4,00
        //2 - X-Salada - R$ 4,50
        //3 - X-Bacon - R$ 5,00
        //4 - Torrada Simples - R$ 2,00
        //5 - Refrigerante - R$ 1,50

        int x = s.nextInt();      //Código produto
        int y = s.nextInt();      //Quantidade

        if(x == 1){                 //Cachorro-quente
            double z = y * 4.00;
            System.out.printf("Total: R$ %.2f\n", z);

        }else if (x == 2){          //X-Salada
            double z = y * 4.50;
            System.out.printf("Total: R$ %.2f\n", z);
        
        }else if (x == 3){          //X-Bacon
            double z = y * 5.00;
            System.out.printf("Total: R$ %.2f\n", z);

        }else if (x == 4){          //Torrada Simples
            double z = y * 2.00;
            System.out.printf("Total: R$ %.2f\n", z);

        }else if (x == 5){          //Refrigerante
            double z = y * 1.50;
            System.out.printf("Total: R$ %.2f\n", z);
        }
    }
}