package com.bernardokassick.estruturas;

import com.bernardokassick.grafocidades.Adjacente;
import com.bernardokassick.grafocidades.Cidade;

public class VetorOrdenado {

    private Cidade[] cidades;
    private int numElementos;

    public VetorOrdenado(int tamanho) {
        this.cidades = new Cidade[tamanho];
        this.numElementos = 0;
    }

    public Cidade getPrimeiro() {
        return cidades[0];
    }

    public void inserir(Cidade cidade) {
        int posicao;

        for (posicao = 0; posicao < this.numElementos; posicao++) {
            if (this.cidades[posicao].getDistanciaObjetivo() >
                    cidade.getDistanciaObjetivo()) {
                break;
            }
        }

        for (int k = this.numElementos; k > posicao; k--) {
            this.cidades[k] = this.cidades[k - 1];
        }

        cidades[posicao] = cidade;
        numElementos++;

    }

    public void mostrar() {
        for (int i = 0; i < numElementos; i++) {
            System.out.println(cidades[i].getNome());

        }
    }
}
