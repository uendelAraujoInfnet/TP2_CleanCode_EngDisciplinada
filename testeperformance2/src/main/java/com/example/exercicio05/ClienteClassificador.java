package com.example.exercicio05;

public class ClienteClassificador {

  public TipoCliente classificarCliente(int idade, double renda, int compras){
    if (isSenior(idade)){
      return classificarSenior(renda, compras);
    } else {
      return classificarJovem(renda, compras);
    }
  }

  private boolean isSenior(int idade) {
    return idade > 60;
  }

  private TipoCliente classificarSenior(double renda, int compras) {
    if (renda > 5000) {
        return (compras > 10) ? TipoCliente.PREMIUM_SENIOR : TipoCliente.REGULAR_SENIOR;
    }
    return TipoCliente.SENIOR_BAIXA_RENDA;
  }

  private TipoCliente classificarJovem(double renda, int compras) {
    if (renda > 7000) {
        return (compras > 20) ? TipoCliente.PREMIUM_JOVEM : TipoCliente.REGULAR_JOVEM;
    }
    return TipoCliente.JOVEM_BAIXA_RENDA;
  }
}
