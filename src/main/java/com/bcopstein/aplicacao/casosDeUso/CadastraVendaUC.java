package com.bcopstein.aplicacao.casosDeUso;

import java.util.List;

import com.bcopstein.negocio.entidades.ItemCarrinho;
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

  public boolean executar(List<ItemCarrinho> itens) {
    Integer[] valores = servicoVenda.consultaVenda(itens);
    Venda novaVenda = new Venda(valores[0], valores[1], valores[2], itens);
    return servicoVenda.cadastraVenda(novaVenda);
  }
}
