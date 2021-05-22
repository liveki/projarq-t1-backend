package com.bcopstein.negocio.entidades;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class ItemCarrinho {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer codigo;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "codigo", referencedColumnName = "codigo")
  private Produto produto;
  private int quantidade;

  public ItemCarrinho(Produto produto, int quantidade) {
    this.produto = produto;
    this.quantidade = quantidade;
  }

  public ItemCarrinho(){
    
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
