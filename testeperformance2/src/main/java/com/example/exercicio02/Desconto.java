package com.example.exercicio02;

public class Desconto {
  private static final double LIMITE_DESCONTO = 1000.0;
  private static final double PERCENTUAL_DESCONTO = 0.10;

  public double calcular(double preco){
    if(preco >= LIMITE_DESCONTO) {
      return preco * (1 - PERCENTUAL_DESCONTO);
    }
    return preco;
  }
 
}
