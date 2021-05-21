package com.bcopstein.negocio.servicos;

import java.util.List;

import com.bcopstein.aplicacao.servicos.ICalculoImposto;
import com.bcopstein.aplicacao.servicos.IRestricaoHorarioVenda;
import com.bcopstein.aplicacao.servicos.RestricaoVendaFactory;
import com.bcopstein.negocio.entidades.ItemCarrinho;
import com.bcopstein.negocio.entidades.Venda;
import com.bcopstein.negocio.repositorios.IVendaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicoVenda {
  private IVendaRepository vendaRepository;
  private ICalculoImposto calculoImposto;

  @Autowired
  public ServicoVenda(IVendaRepository vendaRepository, ICalculoImposto calculoImposto) {
    this.vendaRepository = vendaRepository;
    this.calculoImposto = calculoImposto;
  }

  public boolean cadastraVenda(Venda novaVenda) {
    IRestricaoHorarioVenda restricaoVenda = RestricaoVendaFactory.getInstance();
    boolean vendaIsValida = restricaoVenda.vendaIsValida(novaVenda);

    if (vendaIsValida) {
      this.vendaRepository.cadastra(novaVenda);
    }

    return false;

  }

  public Integer[] consultaVenda(List<ItemCarrinho> itens) {
    Integer subtotal = 0;
    Integer imposto = 0;

    for (final ItemCarrinho prod : itens) {
      if (prod != null) {
        subtotal += (int) (prod.getProduto().getPreco() * prod.getQuantidade());
      } else {
        throw new IllegalArgumentException("Codigo invalido");
      }
    }

    imposto = calculoImposto.calculaImposto(subtotal);

    final Integer[] resp = new Integer[3];

    resp[0] = subtotal;
    resp[1] = imposto;
    resp[2] = subtotal + imposto;

    return resp;
  }

  public List<Venda> todos() {
    return vendaRepository.todos();
  }
}
