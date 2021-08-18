import java.util.Scanner;

public class contagem2 {
    static String texto = "";
    static int caracter = 0;
    static int letras = 0;
    static int numeros = 0;
    static int cEspeci = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite alguns caracteres, podem ser letras, números ou caracteres especiais: ");
        texto = scanner.nextLine();
        scanner.close();
        contarCaracteres(texto, 0);
    }

    public static void contarCaracteres(String texto, int caracter){
        if (texto != "") {
            if ((caracter + 1) > texto.length()) {
                System.out.println("No texto existem " + letras + " letras e " + numeros + " números e " + cEspeci + " caracteres especiais.");
                System.out.println("Total de caracteres: " + (letras + numeros + cEspeci));
            } else {
                char letra = texto.charAt(caracter);
                if (((letra >= 65) && (letra <= 90)) || ((letra >= 97) && (letra <= 122)) ){
                    letras = letras + 1;
                        contarCaracteres(texto, caracter + 1);
                } else if ((letra > 47) && (letra < 58)){
                        numeros = numeros + 1;
                        contarCaracteres(texto, caracter + 1);
                } else if ((letra < 48) || ((letra > 57) && (letra < 65)) || ((letra > 90) && (letra < 97)) || (letra > 122)){
                        cEspeci = cEspeci + 1;
                contarCaracteres(texto, caracter + 1);
                } else contarCaracteres(texto, caracter + 1);
            }
        } else {
            System.out.println("Não foi informado nenhum caracter");
        }
    }
}