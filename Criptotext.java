import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Criptotext {
    public static void main(String[] args) {
        // testa se vai funcionanr, senao cai no catch
        try {
            // caminho do arquivo no GITHUB 
            URL arquivo = new URL("https://raw.githubusercontent.com/RaphaelHZ/Criptotext/main/Frase_Encriptada.TXT");
             
            // lê o arquivo
            BufferedReader entrada = new BufferedReader(new InputStreamReader(arquivo.openStream()));
            
            // variavel pra armazenar linha a linha do arquivo
            String linha;
            // variavel pra armazenar a linha com os caracteres já alterados            
            String novaLinha;

            // loop pra enviar pra variavel linha a linha até chegar no fim do arquivo
            while ((linha = entrada.readLine()) != null) {

                // faz a troca de todos os caracteres e armazena na outra variavel
                novaLinha = linha.replace("4", "a").replace("3", "e").replace("1", "i").replace("0", "o").replace("7", "u");
                
                // imprime a variavel com a linha já descriptada
                System.out.println(novaLinha);
            }
            // fecha o arquivo de entrada
            entrada.close();
             
        }
        // no caso da URL estar incorreta, exibe a mensagem abaixo
        catch (MalformedURLException e) {
            System.out.println("URL incorreta: " + e.getMessage());
        }
        
        catch (IOException e) {
            System.out.println("Erro de I/O: " + e.getMessage());
        }
        
    }
}

/*
Entidade: Unifil EAD
Nome: Raphael Henrique Zanluqui
Data: 06-08-2021 09:20
Objetivo: Ler arquivo TXT e descriptar seu conteudo
*/