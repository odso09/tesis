package ilp;

/**
 * Created by ysapymimbi on 20/12/2016.
 */
public class Solicitud {


    private String origen;
    private String destino;
    private Double velocidad;

    public Solicitud(String origen, String destino, Double velocidad) {
        this.origen = origen;
        this.destino = destino;
        this.velocidad = velocidad;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

}