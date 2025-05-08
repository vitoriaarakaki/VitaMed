function sendMessage() {
  const input = document.getElementById("userInput");
  const message = input.value.trim();
  if (message === "") return;

  const chatBox = document.getElementById("chatBox");

  // Adiciona a mensagem do usuário
  const userMessage = document.createElement("div");
  userMessage.className = "message user";
  userMessage.innerText = message;
  chatBox.appendChild(userMessage);

  // Resposta automática simples do bot
  const botMessage = document.createElement("div");
  botMessage.className = "message bot";

  // Respostas baseadas em palavras-chave
  if (message.toLowerCase().includes("o que é saúde mental")) {
    botMessage.innerText =
      "Saúde mental refere-se ao bem-estar psicológico, emocional e social, e envolve a capacidade de lidar com os desafios da vida de forma saudável.";
  } else if (message.toLowerCase().includes("como cuidar da saúde mental")) {
    botMessage.innerText =
      "Aqui estão algumas formas de cuidar da sua saúde mental e emocional:\n\n- Dormir bem (7-9 horas por noite)\n- Alimentação equilibrada\n- Praticar atividades físicas\n- Fazer meditação ou mindfulness\n- Conversar com amigos e familiares sobre seus sentimentos";
  } else if (message.toLowerCase().includes("prevenção saúde mental")) {
    botMessage.innerText =
      "A prevenção envolve práticas regulares de autocuidado, evitar substâncias psicoativas, reduzir o estresse e buscar apoio psicológico ao sentir sinais de sofrimento.";
  } else if (message.toLowerCase().includes("plano de autocuidado")) {
    botMessage.innerText =
      "Aqui está um exemplo de plano semanal de autocuidado emocional:\n\nSegunda-feira: Dormir cedo, alimentação leve, respiração profunda\nTerça-feira: Caminhada ou alongamento, tempo offline, observar seus pensamentos\nQuarta-feira: Alimentação saudável, ver filme ou ouvir música relaxante\nQuinta-feira: Beber 2L de água, conversar com alguém querido\nSexta-feira: Organizar a semana, fazer algo inspirador\nSábado: Organizar seu espaço, praticar um hobby\nDomingo: Dormir bem, meditação guiada, preparação para a semana";
  } else if (message.toLowerCase().includes("como buscar ajuda")) {
    botMessage.innerText =
      "Você pode buscar ajuda com psicólogos, psiquiatras, terapeutas ocupacionais e serviços de apoio como o CVV (188). No SUS, existem serviços como o CAPS para atendimento gratuito.";
  } else if (message.toLowerCase().includes("depressão")) {
    botMessage.innerText =
      "A depressão é um transtorno mental que afeta o humor, causando tristeza intensa, perda de interesse e prazer nas atividades. Os sintomas podem incluir cansaço extremo, sentimentos de inutilidade e dificuldade para se concentrar.\n\nComo cuidar: buscar ajuda profissional (psicoterapia e, se necessário, medicamentos), praticar atividades físicas, ter uma rotina regular de sono, evitar o isolamento social e aprender técnicas de relaxamento.";
  } else if (message.toLowerCase().includes("ansiedade")) {
    botMessage.innerText =
      "A ansiedade é uma resposta normal ao estresse, mas, quando excessiva, pode se tornar um transtorno. Sintomas incluem preocupação constante, medo irracional, tremores, aumento da frequência cardíaca e dificuldade para relaxar.\n\nComo cuidar: técnicas de respiração, mindfulness, terapia cognitivo-comportamental, evitar cafeína e outras substâncias que estimulam a ansiedade, além de uma rotina regular de atividades físicas.";
  } else {
    botMessage.innerText =
      "Desculpe, ainda estou aprendendo! Você pode reformular sua pergunta ou me perguntar sobre saúde mental, como cuidar da saúde emocional, como lidar com depressão, ansiedade ou outros cuidados!";
  }

  chatBox.appendChild(botMessage);

  input.value = "";
  chatBox.scrollTop = chatBox.scrollHeight;
}
