package com.bernardokassick.estruturas;

import com.bernardokassick.grafocidades.Cidade;

public class Pilha {

    private int tamanho;
    private Cidade[] cidades;
    private int topo;



    public Pilha(int tamanho) {
        this.tamanho = tamanho;
        cidades = new Cidade[this.tamanho];
        topo = -1;
    }

    public void empilhar(Cidade cidade) {
        if (!pilhaCheia()) {
            this.cidades[++topo] = cidade;
        } else {
            System.out.println("A pilha já está cheia");
        }
    }



    public Cidade desempilhar() {
        if (!pilhaVazia()) {
            return this.cidades[topo--];
        } else {
            System.out.println("A pilha já está vazia");
            return null;
        }
    }

    public Cidade getTopo() {
        return cidades[topo];
    }

    private boolean pilhaVazia() {
        return topo == -1;
    }

    private boolean pilhaCheia() {
        return topo == tamanho - 1;
    }


}
