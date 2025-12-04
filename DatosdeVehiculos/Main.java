package DatosdeVehiculos;

public class Main {
    public static void main(String[] args) {
        Automovil datos =new Automovil("Nissan", 2006, 120);
        System.out.println("El automovil es de la marca "+datos.getMarca());
        System.out.println("El año de fabricacion del auto es: "+datos.getAnioFabricacion());
        System.out.println("La velocidad maxima que alcanza es de "+datos.getVelocidadmax()+" km/h");
        System.out.println("El automovil "+datos.Encendido());
        System.out.println("La antiguedad del automovil es de "+datos.calcularAntiguedad()+" años");
    }
}
