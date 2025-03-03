package com.example.exercicio07;

public class RelatorioFactory {

  public static Relatorio criarRelatorio(String tipo) {
    return switch (tipo.toUpperCase()) {
        case "PDF" -> new RelatorioPDF();
        case "CSV" -> new RelatorioCSV();
        case "JSON" -> new RelatorioJSON();
        default -> throw new IllegalArgumentException("Tipo de relatório desconhecido: " + tipo);
    };
  }
}
