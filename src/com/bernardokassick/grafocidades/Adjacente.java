/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bernardokassick.grafocidades;

public class Adjacente {
    private Cidade cidade;
    private int distancia;
    private int distAEstrela;

    public Adjacente(Cidade cidade, int distancia) {
        this.cidade = cidade;
        this.distancia = distancia;
        this.distAEstrela = this.distancia + this.cidade.getDistanciaObjetivo();
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getDistAEstrela() {
        return distAEstrela;
    }

}
