package com.bernardokassick.buscas;

import com.bernardokassick.estruturas.Fila;
import com.bernardokassick.grafocidades.Adjacente;
import com.bernardokassick.grafocidades.Cidade;

public class Largura {

    private Fila fronteira;
    private Cidade partida;
    private Cidade objetivo;
    private boolean achou;

    public Largura(Cidade partida, Cidade objetivo) {
        this.partida = partida;
        this.partida.setVisitado(true);
        this.objetivo = objetivo;
        this.achou = false;

        fronteira = new Fila(20);
        fronteira.enfileirar(partida);
    }

    public void buscar() {
        Cidade primeiro = fronteira.getPrimeiro();
        System.out.println("Primeiro: " + primeiro.getNome());

        if (primeiro == objetivo) {
            this.achou = true;
            System.out.println("Chegou ao objetivo: " + primeiro.getNome());
        } else {
            for (Adjacente adj : primeiro.getAdjacentes()) {
                if(!this.achou) {
                    System.out.println("Verificando se já visitado: " + adj.getCidade().getNome());

                    if (!adj.getCidade().isVisitado()) {
                        adj.getCidade().setVisitado(true);
                        fronteira.enfileirar(adj.getCidade());
                    }
                }
            }
            System.out.println("Removendo da fila: " + fronteira.desenfileirar().getNome());

            if (fronteira.getNumElementos() > 0) {
            buscar();
            }
        }
    }
}
