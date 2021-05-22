package com.bcopstein.negocio.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Produto {

  @Id
  private Integer codigo;
  private String descricao;
  private Double preco;

  @OneToOne(mappedBy = "produto")
  private ItemCarrinho itemCarrinho;

  public Produto(Integer codigo, String descricao, Double preco) {
    this.codigo = codigo;
    this.descricao = descricao;
    this.preco = preco;
  }


  public ItemCarrinho getItemCarrinho() {
    return itemCarrinho;
  }


  public void setItemCarrinho(ItemCarrinho itemCarrinho) {
    this.itemCarrinho = itemCarrinho;
  }


  public Produto() {
  }

  public Integer getCodigo() {
    return codigo;
  }

  public String getDescricao() {
    return descricao;
  }

  public Double getPreco() {
    return preco;
  }

  public void setPreco(Double preco) {
    this.preco = preco;
  }

  @Override
  public String toString() {
    return "Produto [codigo=" + codigo + ", descricao=" + descricao + ", preco=" + preco + "]";
  }
}
