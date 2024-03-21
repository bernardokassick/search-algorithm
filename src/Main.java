import com.bernardokassick.buscas.AEstrela;
import com.bernardokassick.buscas.Gulosa;
import com.bernardokassick.buscas.Largura;
import com.bernardokassick.buscas.Profundidade;
import com.bernardokassick.estruturas.Pilha;
import com.bernardokassick.grafocidades.Mapa;

public class Main {

    public static void main(String[] args) {
        Mapa mapa = new Mapa();

//        Profundidade profundidade = new Profundidade(mapa.getPortoUniao(), mapa.getCuritiba());
//        profundidade.buscar();

//        Largura largura = new Largura(mapa.getPortoUniao(), mapa.getIrati());
//        largura.buscar();

//        Gulosa gulosa = new Gulosa(mapa.getCuritiba());
//        gulosa.buscar(mapa.getPortoUniao());

        AEstrela aEstrela = new AEstrela(mapa.getCuritiba());
        aEstrela.buscar(mapa.getPortoUniao());

    }


}
