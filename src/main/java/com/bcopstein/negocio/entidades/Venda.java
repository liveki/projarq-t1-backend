package com.bcopstein.negocio.entidades;

import java.util.List;

public class Venda {
    
    private Double subtotal;
    private Double impostos;
    private Double total;
    private List<ItemCarrinho> produtos;

    public Venda(Double subtotal, Double impostos, Double total, List<ItemCarrinho> produtos) {
        this.subtotal = subtotal;
        this.impostos = impostos;
        this.total = total;
        this.produtos = produtos;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getImpostos() {
        return impostos;
    }

    public void setImpostos(Double impostos) {
        this.impostos = impostos;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public List<ItemCarrinho> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ItemCarrinho> produtos) {
        this.produtos = produtos;
    }

    

    
}
