import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.HashMap;

public class Utils {

    /**
     * Carrega as sessões de um arquivo de texto.
     * Atribui o numero de celular como chave no HashMap. formato chave;{json}
     * 
     * @param caminho Caminho do arquivo de texto.
     * @return HashMap<String, Sessao> com as sessões carregadas.
     */
    public HashMap<String, Sessao> carregarSessoes(String caminho) {
        HashMap<String, Sessao> sessoes = new HashMap<>();
        File arquivo = new File(caminho);
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                linha = linha.trim();
                if (linha.isEmpty()) {
                    continue;
                }

                String[] separador = linha.split(";", 2);
                String numero = separador[0];
                String dadosSessao = separador[1];

                Sessao sessao = new Sessao(numero, dadosSessao);
                sessoes.put(sessao.numeroCelular, sessao);
            }
        } catch (IOException erro) {
            System.out.println("Erro ao ler arquivo: " + erro.getMessage());
        }
        return sessoes;
    }
}
