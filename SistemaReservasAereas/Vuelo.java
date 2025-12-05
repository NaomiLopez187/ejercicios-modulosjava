package SistemaReservasAereas;

public class Vuelo {
    private String codigoVuelo;
    private int capacidadMaxima;
    private int asientosReservados;

    public Vuelo(String codigoVuelo, int capacidadMaxima) {
        this.codigoVuelo = codigoVuelo;
        this.capacidadMaxima = capacidadMaxima;
        this.asientosReservados = 0;
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }
    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getAsientosReservados() {
        return asientosReservados;
    }
    public void setAsientosReservados(int a) {
        asientosReservados = a;
    }

    public String reservar(int boletos) {
        if (asientosReservados+boletos <= capacidadMaxima) {
            asientosReservados=asientosReservados+boletos;
            return "RESERVA EXITOSA";
        }
        else {
            return "RESERVA FALLIDA";
        }
    }

    public double porcentajeOcupacion() {
        return (asientosReservados * 100.0) / capacidadMaxima;
    }
}
