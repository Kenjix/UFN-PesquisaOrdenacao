import java.util.HashMap;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String caminho = "telephony_sessions.txt";       
        Utils utils = new Utils();
        HashMap<String, Sessao> sessoes = utils.carregarSessoes(caminho);
        System.out.println("Total de sessões lidas: " + sessoes.size());
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Buscar por número");
            System.out.println("2 - Listar todos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            String opcao = scanner.nextLine().trim();            
            if (opcao.equals("0")) {
                System.out.println("Encerrando...");
                break;
            } else if (opcao.equals("1")) {
                System.out.print("Digite o número do telefone: ");
                String numero = scanner.nextLine().trim();
                Sessao sessao = sessoes.get(numero);
                if (sessao != null) {
                    System.out.println("\nSessão encontrada:");
                    System.out.println(sessao.toString());
                } else {
                    System.out.println("Número não encontrado.");
                }
            } else if (opcao.equals("2")) {
                System.out.println("\nListando todas as sessões:");
                for (String numero : sessoes.keySet()) {
                    Sessao sessao = sessoes.get(numero);
                    System.out.println(sessao.toString());
                    System.out.println("----------------------------------------");
                }
            } else {
                System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }
}