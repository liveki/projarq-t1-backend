package com.bcopstein.aplicacao.servicos;

public class ImpostoChile implements ICalculoImposto {
  private static final Integer VALOR_PARA_IVA_MINIMO = 8000;

  @Override
  public Integer calculaImposto(Integer valorTotalCompra) {
    Integer porcentagemImposto = 0;

    if (valorTotalCompra <= VALOR_PARA_IVA_MINIMO) {
      porcentagemImposto = 15;
    } else {
      porcentagemImposto = 20;
    }

    return valorTotalCompra * porcentagemImposto / 100;
  }

}
