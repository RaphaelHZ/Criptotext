import java.util.Scanner;

public class contagem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cont = 0;
        System.out.print("Insira alguns caracteres: ");
        int resposta = contarCaracteres(scanner.nextLine(), cont);
        scanner.close();
        System.out.println("O texto contém " + resposta + " caracteres.");
    }

    public static int contarCaracteres(String texto,int cont){
        if (texto.equals("")){
            return 0;
        }
        cont = cont + 1;
        return 1 + contarCaracteres (texto.substring(1), cont);
    }
}

/*
Entidade: Unifil EAD
Nome: Raphael Henrique Zanluqui
Data: 21-08-2021
Objetivo: Contar caracteres utilizando recursão em java
*/