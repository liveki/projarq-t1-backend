package com.bcopstein.adaptadores.repositorios.implementacoes;

import java.util.List;

import com.bcopstein.adaptadores.repositorios.interfaces.IVendaRepositoryJPA;
import com.bcopstein.negocio.entidades.Venda;
import com.bcopstein.negocio.repositorios.IVendaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Venda_IMPL implements IVendaRepository {

  private IVendaRepositoryJPA vendaRepository;

  @Autowired
  public Venda_IMPL(IVendaRepositoryJPA vendaRepository) {
    this.vendaRepository = vendaRepository;
  }

  @Override
  public void cadastra(Venda venda) {
    vendaRepository.save(venda);

  }

  @Override
  public List<Venda> todos() {
    return vendaRepository.findAll();
  }

}
