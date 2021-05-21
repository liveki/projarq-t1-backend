package com.bcopstein.negocio.entidades;

import javax.persistence.Embeddable;

@Embeddable
public class ItemCarrinho {
  private Produto produto;
  private int quantidade;

  public ItemCarrinho(Produto produto, int quantidade) {
    this.produto = produto;
    this.quantidade = quantidade;
  }

  public Produto getProduto() {
    return produto;
  }

  public void setProduto(Produto produto) {
    this.produto = produto;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  @Override
  public String toString() {
    return "ItemCarrinho [produto=" + produto.toString() + ", qtd=" + quantidade + "]";
  }
}
