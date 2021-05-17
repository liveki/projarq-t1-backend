package com.bcopstein.aplicacao.servicos;

public class ImpostoBrasil implements ICalculoImposto {

  private static final Integer PORCENTAGEM_IMPOSTO = 12;

  @Override
  public Integer calculaImposto(Integer valorTotalCompra) {
    return valorTotalCompra * PORCENTAGEM_IMPOSTO / 100;
  }

}
