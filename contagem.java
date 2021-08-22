import java.util.Scanner;

public class contagem {
    static String texto = "";
    static int valor = 0;
    String caractere ="";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite alguns caracteres, podem ser letras, números ou caracteres especiais: ");
        texto = scanner.nextLine();
        scanner.close();
        int letras = contarLetras(texto, 0);
        valor = 0;
        int numeros = contarNumeros(texto, 0);
        valor = 0;
        int cEspeci = contarCaracteresEspeciais(texto, 0);
        int resultado = letras + numeros + cEspeci;
        System.out.println("No texto existem " + letras + " letras e " + numeros + " números e " + cEspeci + " caracteres especiais.");
        System.out.println("Total de caracteres: " + resultado);
    }

    public static int contarLetras(String texto, int caracter){
        if (texto.equals("")) return 0;
        if ((caracter + 1) > texto.length()) return valor;
        char letra = texto.charAt(caracter);
        if (((letra >= 65) && (letra <= 90)) || ((letra >= 97) && (letra <= 122)) ){
            valor = valor + 1;
            contarLetras(texto, caracter + 1);
        } else contarLetras(texto, caracter + 1);
        return valor;
    }

    public static int contarNumeros(String texto, int caracter){
        if (texto.equals("")) return 0;
        if ((caracter + 1) > texto.length()) return valor;
        char letra = texto.charAt(caracter);
        if ((letra > 47) && (letra < 58)){
            valor = valor + 1;
            contarNumeros(texto, caracter + 1);
        } else contarNumeros(texto, caracter + 1);
        return valor;
    }

    public static int contarCaracteresEspeciais(String texto, int caracter){
        if (texto.equals("")) return 0;
        if ((caracter + 1) > texto.length()) return valor;
        char letra = texto.charAt(caracter);
        if ((letra < 48) || ((letra > 57) && (letra < 65)) || ((letra > 90) && (letra < 97)) || (letra > 122)){
            valor = valor + 1;
            contarCaracteresEspeciais(texto, caracter + 1);
        } else contarCaracteresEspeciais(texto, caracter + 1);
        return valor;
    }
}

/*
Entidade: Unifil EAD
Nome: Raphael Henrique Zanluqui
Data: 18-08-2021
Objetivo: Contar caracteres utilizando recursão em java
Resumo: Nem perde muito tempo com esse e vai pro contagem3 que é o certo, kkkk
*/