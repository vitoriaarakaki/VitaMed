package Sistema;

// Classe responsável pela interação com o usuário
import java.util.Scanner;

class Interacao {
    private Scanner scanner;
    private Resposta resposta;

    public Interacao() {
        scanner = new Scanner(System.in);
        resposta = new Resposta();
    }

    public void iniciarConversa() {
        System.out.println("Olá! Eu o chatbot da VitaMed. Como posso te ajudar hoje?");

        while (true) {
            System.out.print("Você: ");
            String input = scanner.nextLine().toLowerCase();

            if (input.contains("qual é o seu nome")) {
                System.out.print("Vitta: Meu nome é Vita! E como é o seu? ");
                String nome = scanner.nextLine();
                System.out.println("Vitta: Prazer, " + nome + "!");
                continue;
            }

            String respostaChatbot = resposta.obterResposta(input);
            System.out.println("Vitta: " + respostaChatbot);

            if (input.contains("adeus") || input.contains("tchau")) {
                break;
            }
        }
        scanner.close();
    }
}