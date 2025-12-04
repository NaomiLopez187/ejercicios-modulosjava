package DatosdeVehiculos;

public class Automovil {
    private String marca;
    private int anioFabricacion;
    private int velocidadmax;

    public Automovil(String marca, int anioFabricacion, int velocidadmax) {
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
        this.velocidadmax = velocidadmax;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public int getVelocidadmax() {
        return velocidadmax;
    }

    public void setVelocidadmax(int velocidadmax) {
        this.velocidadmax = velocidadmax;
    }

    public String Encendido() {
        int antiguedad = calcularAntiguedad();

        if (antiguedad > 25) {
            return "no fue encendido, es muy antiguo";
        } else {
            return "fue encendido exitosamente";
        }
    }

    public int calcularAntiguedad() {
        int anioActual = java.time.Year.now().getValue();
        return anioActual - anioFabricacion;
    }
}