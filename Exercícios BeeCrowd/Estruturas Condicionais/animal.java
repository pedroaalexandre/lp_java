//Bom para IDENTAÇÃO

import java.util.Scanner;

public class animal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String coluna, classe, ordem;
        coluna = s.nextLine();

        if(coluna.equals("vertebrado")){
            classe = s.nextLine();
                if(classe.equals("ave")){
                    ordem = s.nextLine();
                        if(ordem.equals("carnivoro")){
                            System.out.println("aguia");
                        }else{
                            System.out.println("pomba");
                        }
                }else{
                    ordem = s.nextLine();
                        if(ordem.equals("onivoro")){
                            System.out.println("homem");
                        }else{
                            System.out.println("vaca");
                        }
                }
        }else{
            classe = s.nextLine();
                if(classe.equals("inseto")){
                    ordem = s.nextLine();
                        if(ordem.equals("hematofago")){
                            System.out.println("pulga");
                        }else{
                            System.out.println("lagarta");
                        }
                }else{
                    ordem = s.nextLine();
                        if(ordem.equals("hematofago")){
                            System.out.println("sanguessuga");
                        }else{
                            System.out.println("minhoca");
                        }
                }
        }

    }
}

