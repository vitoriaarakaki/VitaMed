package Sistema;

// Classe que gerencia o mapeamento de perguntas para respostas
import java.util.HashMap;
import java.util.Map;

class Resposta {
    private Map<String, String> respostas;

    public Resposta() {
        respostas = new HashMap<>();
        inicializarRespostas();
    }

    private void inicializarRespostas() {
        // Cumprimentos
        respostas.put("oi", "Olá! Como você está?");
        respostas.put("olá", "Oi! Como posso te ajudar?");
        respostas.put("eai", "Eai! Como posso te ajudar cara?");
        respostas.put("como você tá?", "Eu tô bem, valeu ai!");
        respostas.put("como você está", "Estou bem, obrigado por perguntar! E você?");

        // Despedidas
        respostas.put("adeus", "Até logo! Tenha um ótimo dia!");
        respostas.put("tchau", "Até mais! Foi bom conversar com você.");

        // Perguntas
        respostas.put("o que é saúde mental", "Saúde mental refere-se ao bem-estar psicológico, emocional e social, e envolve a capacidade de lidar com os desafios da vida de forma saudável.");
        respostas.put("como cuidar da saúde mental", "Aqui estão algumas formas de cuidar da sua saúde mental e emocional:\n\n- Dormir bem (7-9 horas por noite)\n- Alimentação equilibrada\n- Praticar atividades físicas\n- Fazer meditação ou mindfulness\n- Conversar com amigos e familiares sobre seus sentimentos!");
        respostas.put("prevenção saúde mental", "A prevenção envolve práticas regulares de autocuidado, evitar substâncias psicoativas, reduzir o estresse e buscar apoio psicológico ao sentir sinais de sofrimento.");
        respostas.put("plano de autocuidado", "Aqui está um exemplo de plano semanal de autocuidado emocional:\n\nSegunda-feira: Dormir cedo, alimentação leve, respiração profunda\nTerça-feira: Caminhada ou alongamento, tempo offline, observar seus pensamentos\nQuarta-feira: Alimentação saudável, ver filme ou ouvir música relaxante\nQuinta-feira: Beber 2L de água, conversar com alguém querido\nSexta-feira: Organizar a semana, fazer algo inspirador\nSábado: Organizar seu espaço, praticar um hobby\nDomingo: Dormir bem, meditação guiada, preparação para a semana");
        respostas.put("como buscar ajuda", "Você pode buscar ajuda com psicólogos, psiquiatras, terapeutas ocupacionais e serviços de apoio como o CVV (188). No SUS, existem serviços como o CAPS para atendimento gratuito.");
        respostas.put("depressão", "A depressão é um transtorno mental que afeta o humor, causando tristeza intensa, perda de interesse e prazer nas atividades. Os sintomas podem incluir cansaço extremo, sentimentos de inutilidade e dificuldade para se concentrar.\n\nComo cuidar: buscar ajuda profissional (psicoterapia e, se necessário, medicamentos), praticar atividades físicas, ter uma rotina regular de sono, evitar o isolamento social e aprender técnicas de relaxamento.");
        respostas.put("ansiedade", "A ansiedade é uma resposta normal ao estresse, mas, quando excessiva, pode se tornar um transtorno. Sintomas incluem preocupação constante, medo irracional, tremores, aumento da frequência cardíaca e dificuldade para relaxar.\n\nComo cuidar: técnicas de respiração, mindfulness, terapia cognitivo-comportamental, evitar cafeína e outras substâncias que estimulam a ansiedade, além de uma rotina regular de atividades físicas.");

    }


    public String obterResposta(String entrada) {
        for (Map.Entry<String, String> entradaMap : respostas.entrySet()) {
            if (entrada.contains(entradaMap.getKey())) {
                return entradaMap.getValue();
            }
        }
        return "Desculpe, não entendi. Pode reformular a pergunta?";
    }
}