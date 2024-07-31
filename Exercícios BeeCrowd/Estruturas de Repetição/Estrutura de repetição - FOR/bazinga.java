import java.util.Scanner;

public class bazinga {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int t,i;
        String resultado;
        
        t = s.nextInt();

        for(i = 0; i <= t; i++){
            resultado = s.nextLine();

            if(resultado.equals("tesoura papel")){
                System.out.println("Caso #" + i + ": Bazinga!");

            }else if(resultado.equals("papel pedra")){
                System.out.println("Caso #" + i + ": Bazinga!");

            }else if(resultado.equals("lagarto Spock")){
                System.out.println("Caso #" + i + ": Bazinga!");

            }else if(resultado.equals("pedra lagarto")){
                System.out.println("Caso #" + i + ": Bazinga!");

            }else if(resultado.equals("Spock tesoura")){
                System.out.println("Caso #" + i + ": Bazinga!");

            }else if(resultado.equals("tesoura lagarto")){
                System.out.println("Caso #" + i + ": Bazinga!");

            }else if(resultado.equals("lagarto papel")){
                System.out.println("Caso #" + i + ": Bazinga!");

            }else if(resultado.equals("papel Spock")){
                System.out.println("Caso #" + i + ": Bazinga!");

            }else if(resultado.equals("Spock pedra")){
                System.out.println("Caso #" + i + ": Bazinga!");

            }else if(resultado.equals("pedra tesoura")){
                System.out.println("Caso #" + i + ": Bazinga!");

            }else if(resultado.equals("pedra pedra")){
                System.out.println("Caso #" + i + ": De novo!");

            }else if(resultado.equals("papel papel")){
                System.out.println("Caso #" + i + ": De novo!");

            }else if(resultado.equals("tesoura tesoura")){
                System.out.println("Caso #" + i + ": De novo!");

            }else if(resultado.equals("lagarto lagarto")){
                System.out.println("Caso #" + i + ": De novo!");

            }else if(resultado.equals("Spock Spock")){
                System.out.println("Caso #" + i + ": De novo!");

            }else if(resultado.equals("papel tesoura")){
                System.out.println("Caso #" + i + ": Raj trapaceou!");
                
            }else if(resultado.equals("pedra papel")){
                System.out.println("Caso #" + i + ": Raj trapaceou!");

            }else if(resultado.equals("lagarto pedra")){
                System.out.println("Caso #" + i + ": Raj trapaceou!");

            }else if(resultado.equals("Spock lagarto")){
                System.out.println("Caso #" + i + ": Raj trapaceou!");

            }else if(resultado.equals("tesoura Spock")){
                System.out.println("Caso #" + i + ": Raj trapaceou!");

            }else if(resultado.equals("lagarto tesoura")){
                System.out.println("Caso #" + i + ": Raj trapaceou!");

            }else if(resultado.equals("papel lagarto")){
                System.out.println("Caso #" + i + ": Raj trapaceou!");

            }else if(resultado.equals("Spock papel")){
                System.out.println("Caso #" + i + ": Raj trapaceou!");

            }else if(resultado.equals("pedra Spock")){
                System.out.println("Caso #" + i + ": Raj trapaceou!");

            }else if(resultado.equals("tesoura pedra")){
                System.out.println("Caso #" + i + ": Raj trapaceou!");
            }
        }
    }
}
