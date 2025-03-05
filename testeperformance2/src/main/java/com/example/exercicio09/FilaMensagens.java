package com.example.exercicio09;

import java.util.LinkedList;
import java.util.Queue;

public class FilaMensagens {
  private Queue<String> mensagens = new LinkedList<>();

  // Consulta: Retorna a próxima mensagem sem removê-la
  public String visualizarProximaMensagem() {
      return mensagens.peek();
  }

  // Comando: Retorna e remove a próxima mensagem
  public String obterProximaMensagem() {
      return mensagens.poll();
  }

  // Método para adicionar mensagens na fila
  public void adicionarMensagem(String mensagem) {
      mensagens.offer(mensagem);
  }

  // Método para verificar se a fila está vazia
  public boolean estaVazia() {
      return mensagens.isEmpty();
  }
}
