package com.example.exercicio07;

public class RelatorioCSV implements Relatorio {

  @Override
  public void gerarCabecalho() {
      System.out.println("Gerando cabeçalho do CSV...");
  }

  @Override
  public void gerarCorpo() {
      System.out.println("Gerando corpo do CSV...");
  }

  @Override
  public void gerarRodape() {
      System.out.println("Gerando rodapé do CSV...");
  }
}
