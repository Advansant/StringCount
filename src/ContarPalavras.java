import java.util.HashMap;
import java.util.Map;

public class ContarPalavras {

    public static int contarAparicoesMaisFrequente(String texto) {
        String[] palavras = texto.split(" ");

        Map<String, Integer> contagem = new HashMap<>();

        for (String palavra : palavras) {
            contagem.put(palavra, contagem.getOrDefault(palavra, 0) + 1);
        }

        int maxAparicoes = 0;

        for (int aparicoes : contagem.values()) {
            if (aparicoes > maxAparicoes) {
                maxAparicoes = aparicoes;
            }
        }

        return maxAparicoes;
    }
    public static void main(String[] args) {
        String texto1 = "o tempo perguntou pro tempo quanto tempo o tempo tem o tempo respondeu pro tempo que o tempo tem tanto tempo quanto o tempo tem";
        System.out.println("A quantiade de palavras repetidas na frase é = " + contarAparicoesMaisFrequente(texto1));

        String texto2 = "quero comer milho eu nao quero comer batata eu nao quero comer coxinha";
        System.out.println("A quantiade de palavras repetidas na frase é = " + contarAparicoesMaisFrequente(texto2));
    }
}
