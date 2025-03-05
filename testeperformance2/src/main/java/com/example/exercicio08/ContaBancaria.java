package com.example.exercicio08;

public class ContaBancaria {

  private double saldo;

  public ContaBancaria(double saldoInicial){
    this.saldo = saldoInicial;
  }

  // Método que faz a Query - Verificação apenas se o saldo é ou não o suficiente
  public boolean podeComprar(double valor) {
    return saldo >= valor;
  }

  // Método que faz o Command - Responsável por realizar a compra caso aja saldo suficiente
  public boolean realizarCompra( double valor) {
    if(podeComprar(valor)) {
      saldo -= valor;
      return true;
    }

    return false;
  }

  public double getSaldo(){
    return saldo;
  }
}
