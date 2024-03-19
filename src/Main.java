import com.bernardokassick.buscas.Profundidade;
import com.bernardokassick.estruturas.Pilha;
import com.bernardokassick.grafocidades.Mapa;

public class Main {

    public static void main(String[] args) {
//        Mapa mapa = new Mapa();
//
//        Pilha pilha = new Pilha(5);
//
//        pilha.empilhar(mapa.getPortoUniao());
//        pilha.empilhar(mapa.getCampoLargo());
//        pilha.empilhar(mapa.getCanoinhas());
//
//        System.out.println(pilha.getTopo().getNome());
//
//        pilha.desempilhar();
//        System.out.println(pilha.getTopo().getNome());


        Mapa mapa = new Mapa();
        Profundidade profundidade = new Profundidade(mapa.getPortoUniao(), mapa.getCuritiba());

        profundidade.buscar();
    }
}
