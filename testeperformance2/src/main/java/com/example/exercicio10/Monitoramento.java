package com.example.exercicio10;

public class Monitoramento {
  private int contadorAcessos = 0;

  // Consulta: Retorna o número atual de acessos sem modificá-lo
  public int getContadorAcessos() {
      return contadorAcessos;
  }

  // Comando: Incrementa o contador de acessos
  public void incrementarAcessos() {
      contadorAcessos++;
  }
}

