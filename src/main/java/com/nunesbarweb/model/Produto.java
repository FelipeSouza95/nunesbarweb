package com.nunesbarweb.model;

public class Produto {

    private int idproduo;
    private String nome;
    private String categoria;
    private double valor;
    private int quantidade;

    //Gets e Sets
    public int getIdproduo() {
        return idproduo;
    }
    public void setIdproduo(int idproduo) {
        this.idproduo = idproduo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    } 
}