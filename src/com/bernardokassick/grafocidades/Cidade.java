/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bernardokassick.grafocidades;

import java.util.ArrayList;
import java.util.List;

public class Cidade {
    private String nome;
    private boolean visitado;
    private int distanciaObjetivo;
    private List<Adjacente> adjacentes;

    public Cidade(String nome, int distanciaObjetivo) {
        this.nome = nome;
        this.visitado = false;
        this.distanciaObjetivo = distanciaObjetivo;
        this.adjacentes = new ArrayList<Adjacente>();
    }
    
    public void addCidadeAdjacente(Adjacente cidade) {
        adjacentes.add(cidade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public List<Adjacente> getAdjacentes() {
        return adjacentes;
    }

    public int getDistanciaObjetivo() {
        return distanciaObjetivo;
    }

    public void setDistanciaObjetivo(int distanciaObjetivo) {
        this.distanciaObjetivo = distanciaObjetivo;
    }
}
