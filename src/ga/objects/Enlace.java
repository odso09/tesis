package ga.objects;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ysapy on 15/02/16.
 */
public class Enlace {

    int inicio, fin, nroFibras;
    List<Fibra> fibras;

    public Enlace (){
        inicio = -1;
        fin = -1;
        fibras = new ArrayList<Fibra>();
        nroFibras = 3;
    }

    public Enlace(int p, int s, List<Fibra> fibras) {
        this.inicio = p;
        this.fin = s;
        this.fibras = fibras;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }
    
    public int getNroFibras() {
        return nroFibras;
    }

    public void setNroFibras(int nroFibras) {
        this.nroFibras = nroFibras;
    }

    public List<Fibra> getFibras() {
        return fibras;
    }

    public void setFibras(List<Fibra> fibras) {
        this.fibras = fibras;
    }
}
