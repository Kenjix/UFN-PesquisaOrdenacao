import java.util.ArrayList;
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class Util {
    /**
     * Método de classe que popula aleatoriamente uma lista com números inteiros.
     *
     * @param lista      lista que irá conter os números sorteados
     * @param quantidade quantidade de números a serem armazenados
     * @param inicio     valor mínimo para os números sorteados
     * @param fim        valor máximo para os números sorteados
     */
    public static void popularListaNumerosAleatorios(ArrayList<Integer> lista, int quantidade, int inicio, int fim) {
        Random gerador = new Random();
        int numero;
        for (; quantidade > 0; quantidade--) {
            numero = gerador.nextInt(fim - inicio) + inicio;
            lista.add(numero);
        }
    }

    /**
     * Método de classe que exibe uma lista de números inteiros no console.
     *
     * @param lista lista de números inteiros a ser exibida
     */
    public static void exibirListaNumeros(ArrayList<Integer> lista) {
        for (Integer item : lista) {
            System.out.println(item);
        }
    }

    /**
     * Método de classe que popula aleatoriamente uma lista com palavras de tamanho fixo.
     *
     * @param lista      lista que irá conter as palavras geradas
     * @param quantidade quantidade de palavras a serem geradas
     * @param tamanho    tamanho de cada palavra
     */
    public static void popularListaPalavrasAleatorio(ArrayList<String> lista, int quantidade, int tamanho) {
        Random gerador = new Random();
        String palavraGerada;
        char letraSorteada;
        String letras = "abcdefghijklmnopqrstuvwxyz ";
        int posicao;
        for (; quantidade > 0; quantidade--) {
            palavraGerada = "";
            for (int i = 0; i < tamanho; i++) {
                posicao = gerador.nextInt(letras.length());
                letraSorteada = letras.charAt(posicao);
                palavraGerada += letraSorteada;
            }
            lista.add(palavraGerada);
        }
    }

    /**
     * Método de classe que exibe uma lista de palavras no console.
     *
     * @param lista lista de palavras a ser exibida
     */
    public static void exibirListaPalavras(ArrayList<String> lista) {
        for (String item : lista) {
            System.out.println(item);
        }
    }

    /**
     * Salva uma lista de números inteiros em um arquivo texto, um número por linha.
     *
     * @param lista lista de números inteiros a ser salva
     * @param nomeArquivo nome do arquivo onde os números serão salvos
     */
    public static void salvarListaNumerosEmArquivo(ArrayList<Integer> lista, String nomeArquivo) {
        try (FileWriter writer = new FileWriter(nomeArquivo)) {
            for (Integer numero : lista) {
                writer.write(numero + "\n");
            }
        } catch (IOException e) {
            System.err.println("Erro ao salvar lista de números: " + e.getMessage());
        }
    }

    /**
     * Salva uma lista de palavras em um arquivo texto, uma palavra por linha.
     *
     * @param lista lista de palavras a ser salva
     * @param nomeArquivo nome do arquivo onde as palavras serão salvas
     */
    public static void salvarListaPalavrasEmArquivo(ArrayList<String> lista, String nomeArquivo) {
        try (FileWriter writer = new FileWriter(nomeArquivo)) {
            for (String palavra : lista) {
                writer.write(palavra + "\n");
            }
        } catch (IOException e) {
            System.err.println("Erro ao salvar lista de palavras: " + e.getMessage());
        }
    }
}
