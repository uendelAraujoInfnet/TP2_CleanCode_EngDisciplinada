package com.example.exercicio07;

public class RelatorioPDF implements Relatorio{

  @Override
  public void gerarCabecalho() {
    System.out.println("Gerando cabeçalho do PDF...");
  }

  @Override
  public void gerarCorpo() {
    System.out.println("Gerando corpo do PDF...");
  }

  @Override
  public void gerarRodape() {
    System.out.println("Gerando rodapé do PDF...");
  }

}
