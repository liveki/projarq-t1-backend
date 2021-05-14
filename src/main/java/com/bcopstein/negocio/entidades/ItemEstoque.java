package com.bcopstein.negocio.entidades;

public class ItemEstoque {

    private Produto produto;
    private int qtdade;


    public ItemEstoque(Produto produto, int qtdade) {
        this.produto = produto;
        this.qtdade = qtdade;
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
