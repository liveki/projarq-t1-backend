package com.bcopstein.aplicacao.servicos;

public class ImpostoChile implements ICalculoImposto {
  private static final Integer VALOR_PARA_IVA_MINIMO = 8000;

  @Override
  public Integer calculaImposto(Integer valorTotalCompra) {
    Integer porcentagemImposto = 15;
    
    if(valorTotalCompra > VALOR_PARA_IVA_MINIMO){
      
      Integer valorRestante = valorTotalCompra - VALOR_PARA_IVA_MINIMO;
      Integer valorParcial = VALOR_PARA_IVA_MINIMO * porcentagemImposto / 100;

      porcentagemImposto = 20;
      valorRestante = valorRestante * porcentagemImposto / 100;

      return valorParcial + valorRestante;
    }

    
    return valorTotalCompra * porcentagemImposto / 100;
  }

}
