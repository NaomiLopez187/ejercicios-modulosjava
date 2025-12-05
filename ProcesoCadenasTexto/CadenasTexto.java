package ProcesoCadenasTexto;

public class CadenasTexto {
    private String cadenaActual;
    private String idModulo;
    private int longitudMaxima;

    public CadenasTexto(String cadenaActual, String idModulo, int longitudMaxima) {
        this.cadenaActual = cadenaActual;
        this.idModulo = idModulo;
        this.longitudMaxima = longitudMaxima;
    }

    public String getCadenaActual() {
        return cadenaActual;
    }
    public void setCadenaActual(String cadenaActual) {
        this.cadenaActual = cadenaActual;
    }

    public String getIdModulo() {
        return idModulo;
    }
    public void setIdModulo(String idModulo) {
        this.idModulo = idModulo;
    }

    public int getLongitudMaxima() {
        return longitudMaxima;
    }
    public void setLongitudMaxima(int longitudMaxima) {
        this.longitudMaxima = longitudMaxima;
    }

    public String agregarPrefijo(String prefijo) {
        String cadenanueva=prefijo+cadenaActual;
        return cadenanueva;
    }

    public int contarEspacios() {
        int contador = 0;
        for (int i = 0; i < cadenaActual.length(); i++) {
            if (cadenaActual.charAt(i) == ' ') {
                contador++;
            }
        }
        return contador;
    }
}
