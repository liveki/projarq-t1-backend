package com.bcopstein.aplicacao.casosDeUso;

import com.bcopstein.negocio.entidades.Venda;
import com.bcopstein.negocio.servicos.ServicoVenda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CadastraVendaUC {
  private ServicoVenda servicoVenda;

  @Autowired
  public CadastraVendaUC(ServicoVenda servicoVenda) {
    this.servicoVenda = servicoVenda;
  }

  public void executar(Venda novaVenda) {
    servicoVenda.cadastraVenda(novaVenda);
  }
}
