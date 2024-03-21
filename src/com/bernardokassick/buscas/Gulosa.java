package com.bernardokassick.buscas;

import com.bernardokassick.estruturas.VetorOrdenado;
import com.bernardokassick.grafocidades.Adjacente;
import com.bernardokassick.grafocidades.Cidade;

public class Gulosa {

    private VetorOrdenado fronteira;
    private Cidade objetivo;
    private boolean achou;

    public Gulosa(Cidade objetivo) {
        this.objetivo = objetivo;
        this.achou = false;
    }

    public void buscar(Cidade atual) {
        System.out.println("Cidade atual: " + atual.getNome());
        atual.setVisitado(true);

        if (atual == this.objetivo) {
            this.achou = true;
        } else {
            fronteira = new VetorOrdenado(atual.getAdjacentes().size());
            for (Adjacente adj : atual.getAdjacentes()) {
                if (!adj.getCidade().isVisitado()) {
                    adj.getCidade().setVisitado(true);
                    fronteira.inserir(adj.getCidade());
                }
            }

            fronteira.mostrar();
            if (fronteira.getPrimeiro() != null) {
                buscar(fronteira.getPrimeiro());
            }

        }

    }

}
