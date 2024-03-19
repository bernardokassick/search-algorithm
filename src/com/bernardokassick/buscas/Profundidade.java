package com.bernardokassick.buscas;

import com.bernardokassick.estruturas.Pilha;
import com.bernardokassick.grafocidades.Adjacente;
import com.bernardokassick.grafocidades.Cidade;

public class Profundidade {

    private Pilha fronteira;
    private Cidade inicio;
    private Cidade objetivo;
    private boolean achou;

    public Profundidade(Cidade inicio, Cidade objetivo) {
        this.inicio = inicio;
        this.inicio.setVisitado(true);
        this.objetivo = objetivo;
        this.achou = false;

        fronteira = new Pilha(20);
        fronteira.empilhar(inicio);
    }

    public void buscar() {
        Cidade topo = fronteira.getTopo();
        System.out.println("Topo: " + topo.getNome());

        if (topo == objetivo) {
            this.achou = true;
            System.out.println("Chegou até: " + topo.getNome());
        } else {
        for (Adjacente adj : topo.getAdjacentes()) {
            if (!this.achou) {
                System.out.println("Varificando se já visitado: " + adj.getCidade().getNome());

                if (!adj.getCidade().isVisitado()) {
                    adj.getCidade().setVisitado(true);
                    fronteira.empilhar(adj.getCidade());
                    buscar();
                }
            }
        }
        }

        System.out.println("Desempilhando: "+ fronteira.desempilhar().getNome());
    }

}
