package com.bernardokassick.estruturas;

import com.bernardokassick.grafocidades.Cidade;

public class Fila {

    private int tamanho;
    private Cidade[] cidades;
    private int inicio;
    private int fim;
    private int numElementos;

    public int getNumElementos() {
        return numElementos;
    }

    public Fila(int tamanho) {
        this.tamanho = tamanho;
        cidades = new Cidade[tamanho];
        inicio = 0;
        fim = -1;
        numElementos = 0;
    }

    public void enfileirar(Cidade cidade) {
        if (!filaCheia()) {
            if (fim == tamanho - 1) {
                fim = -1;
            }

            cidades[++fim] = cidade;
            numElementos++;
        } else {
            System.out.println("Fila cheia! Não é possível enfileirar mais cidades.");
        }
    }

    public Cidade desenfileirar() {
        if (!filaVazia()) {
            Cidade desenfileirada = cidades[inicio++];
            if (inicio == tamanho) {
                inicio = 0;
            }

            numElementos--;
            return desenfileirada;
        } else {
            System.out.println("Filha vazia!!!");
            return null;
        }
    }

    public Cidade getPrimeiro() {
        return cidades[inicio];
    }

    public boolean filaVazia() {
        return (numElementos == 0);
    }

    public boolean filaCheia() {
        return (numElementos == tamanho);
    }

}
