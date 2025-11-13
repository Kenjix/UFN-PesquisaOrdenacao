import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        ArrayList<String> listaPalavras = new ArrayList<>();

        Util.popularListaNumerosAleatorios(listaNumeros, 1000, 50, 100);
        Util.exibirListaNumeros(listaNumeros);
        Util.popularListaPalavrasAleatorio(listaPalavras, 100, 10);
        Util.exibirListaPalavras(listaPalavras);

        Util.salvarListaNumerosEmArquivo(listaNumeros, "numeros.txt");
        Util.salvarListaPalavrasEmArquivo(listaPalavras, "palavras.txt");
    }
}