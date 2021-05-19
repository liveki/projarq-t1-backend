package com.bcopstein.negocio.entidades;

public class ItemEstoque {

    private Integer codEstoque;
    private Produto produto;
    private int qtdade;


    public ItemEstoque(Integer codEstoque, Produto produto, int qtdade) {
        this.codEstoque = codEstoque;
        this.produto = produto;
        this.qtdade = qtdade;
    }

    public Integer getCodEstoque() {
        return codEstoque;
    }


    public void setCodEstoque(Integer codEstoque) {
        this.codEstoque = codEstoque;
    }


    public Produto getProduto() {
        return produto;
    }


    public void setProduto(Produto produto) {
        this.produto = produto;
    }


    public int getQtdade() {
        return qtdade;
    }


    public void setQtdade(int qtdade) {
        this.qtdade = qtdade;
    }

      

    
}
