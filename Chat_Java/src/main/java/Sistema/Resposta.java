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

        // Perguntas sobre a empresa
        respostas.put("me fale sobre a empresa", "A VitaMed é uma clínica multidisciplinar especializada em cuidados integrativos, voltada para promover saúde física, mental e emocional de forma humanizada. Unimos medicina convencional, terapias complementares e tecnologia de ponta para oferecer um atendimento completo, individualizado e centrado na pessoa.\n" +
                "\n" +
                "Nosso time reúne médicos, psicólogos, nutricionistas, fisioterapeutas, terapeutas integrativos e educadores físicos, trabalhando em sinergia para restaurar e manter a qualidade de vida dos nossos pacientes.");
        respostas.put("quais são os Segmento de Atuação?", "Medicina Integrativa, Saúde Mental e Emocional, Nutrição e Bem-Estar, Fisioterapia e Reabilitação, Check-ups e Prevenção e Programas Corporativos.");
        respostas.put("o que é medicina integrativa?", "Combinação de medicina tradicional com práticas como acupuntura, fitoterapia, meditação e auriculoterapia.");
        respostas.put("o que é saúde mental e emocional?", "Psicoterapia, neuropsicologia, psiquiatria e programas de redução de estresse.");
        respostas.put("o que é nutrição e bem-estar?", "Planos alimentares personalizados, nutrição funcional e acompanhamento metabólico.");
        respostas.put("o que é fisioterapia e reabilitação?", "Atendimento ortopédico, esportivo, neurológico e postural com abordagem personalizada.");
        respostas.put("o que é check-ups e prevenção:?", "valiações periódicas, exames laboratoriais e programas de saúde preventiva.");
        respostas.put("o que é programas corporativos?", "Parcerias com empresas para promover saúde no ambiente de trabalho.");
        respostas.put("qual é o futuro da inteligência artificial", "O futuro da IA inclui avanços em automação, diagnósticos médicos, veículos autônomos e assistentes virtuais cada vez mais inteligentes.");

        //FAQ
        respostas.put("a VitaeMed é um hospital?", " Não. Somos uma clínica de atendimento ambulatorial, com foco em prevenção, tratamento e promoção da saúde, mas sem internações.");
        respostas.put("vocês aceitam planos de saúde?", "Trabalhamos com reembolso para a maioria dos planos, mas também oferecemos pacotes acessíveis e descontos para pagamentos particulares.");
        respostas.put("posso fazer apenas consultas isoladas?", "Sim! Embora recomendemos acompanhamento contínuo, você pode agendar consultas pontuais conforme sua necessidade.");
        respostas.put("como funciona a abordagem integrativa?", "Você pode ser atendido por uma equipe multidisciplinar que integra diferentes áreas da saúde, com foco na causa dos sintomas e não apenas no alívio imediato.");
        respostas.put("vocês atendem crianças e idosos?", "Sim, temos profissionais especializados em pediatria, gerontologia, psicologia infantil e fisioterapia para todas as faixas etárias.");
        respostas.put("os tratamentos alternativos são seguros?", "Sim. Todas as práticas integrativas que oferecemos são respaldadas por evidências científicas e aplicadas por profissionais certificados.");
        respostas.put("como agendo uma consulta?", "Você pode agendar pelo nosso site, aplicativo ou telefone. Também oferecemos algumas especialidades em formato de teleconsulta.");

        //Meios de comunicação
        respostas.put("qual é o telefone para agendamentos?", "Você pode ligar no (11) 4002-8922 ou marcar a sua consulta pelo nossa WhatsApp (11) 94002-8922");
        respostas.put("qual é canal de suporte ao cliente?", "Você pode ligar no 0800 000 800 ou encaminhar um e-mail para suporte@vitamed.com.br e relatar seu problema.");
        respostas.put("qual é o endereço?", "Estamos localizados na Avenida Paulista, 0001 - São Paulo");



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