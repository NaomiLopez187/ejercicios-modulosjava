package TemperaturayClima;

public class Temperatura {
    private double valor;
    private String unidad; // "C" o "F"
    private String fechaRegistro;

    public Temperatura(double valor, String unidad, String fechaRegistro) {
        this.valor = valor;
        this.unidad = unidad;
        this.fechaRegistro = fechaRegistro;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getUnidad() {
        return unidad; }
    public void setUnidad(String unidad) { this.unidad = unidad;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }
    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void conversion() {
        if (unidad.equals("C")) {
            valor = (valor * 9.0/5.0) + 32;
            unidad = "F";
        } else {
            valor = (valor - 32) * 5.0/9.0;
            unidad = "C";
        }
    }

    public String esExtrema() {
        if (unidad.equals("C") && valor > 40) {
            return "SI";
        }
        if (unidad.equals("F") && valor > 104) {
            return "SI";
        }
        return "NO";
    }

}
