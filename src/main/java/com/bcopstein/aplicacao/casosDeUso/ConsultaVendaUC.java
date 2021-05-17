package com.bcopstein.aplicacao.casosDeUso;

import java.util.List;

import com.bcopstein.negocio.entidades.ItemCarrinho;
import com.bcopstein.negocio.servicos.ServicoVenda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConsultaVendaUC {
  private ServicoVenda servicoVenda;

  @Autowired
  public ConsultaVendaUC(ServicoVenda servicoVenda) {
    this.servicoVenda = servicoVenda;
  }

  public Integer[] executar(List<ItemCarrinho> itens) {
    return servicoVenda.consultaVenda(itens);
  }
}
