package com.bernardokassick.estruturas;

import com.bernardokassick.grafocidades.Adjacente;

public class VetorOrdenadoAdj {

    private Adjacente[] adjacentes;
    private int numElementos;

    public VetorOrdenadoAdj(int tamanho) {
        this.adjacentes = new Adjacente[tamanho];
        this.numElementos = 0;
    }

    public Adjacente getPrimeiro() {
        return adjacentes[0];
    }

    public void inserir(Adjacente adjacente) {
        int posicao;

        for (posicao = 0; posicao < this.numElementos; posicao++) {
            if (this.adjacentes[posicao].getDistAEstrela() >
                    adjacente.getDistAEstrela()) {
                break;
            }
        }

        for (int k = this.numElementos; k > posicao; k--) {
            this.adjacentes[k] = this.adjacentes[k - 1];
        }

        adjacentes[posicao] = adjacente;
        numElementos++;

    }

    public void mostrar() {
        for (int i = 0; i < numElementos; i++) {
            System.out.println(adjacentes[i].getCidade().getNome());

        }
    }
}
