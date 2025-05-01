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
  
    if (message.toLowerCase().includes("consulta")) {
      botMessage.innerText =
        "Você pode agendar sua consulta diretamente em nosso site ou me informar a especialidade desejada.";
    } else if (message.toLowerCase().includes("horário")) {
      botMessage.innerText =
        "Nosso horário de atendimento é de segunda a sexta, das 8h às 18h.";
    } else {
      botMessage.innerText =
        "Desculpe, ainda estou aprendendo! Você pode reformular sua pergunta?";
    }
  
    chatBox.appendChild(botMessage);
  
    input.value = "";
    chatBox.scrollTop = chatBox.scrollHeight;
  }