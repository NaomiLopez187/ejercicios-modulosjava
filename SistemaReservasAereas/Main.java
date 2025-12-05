package SistemaReservasAereas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vuelo vuelo1 = new Vuelo("PM234", 5);

        System.out.println("=== Información del vuelo ===");
        System.out.println("Código: " + vuelo1.getCodigoVuelo());
        System.out.println("Capacidad máxima: " + vuelo1.getCapacidadMaxima());
        System.out.println("¿Cuantos asientos deseas reservar?");
        int boletos=sc.nextInt();
        System.out.println(vuelo1.reservar(boletos));
        System.out.println("Asientos reservados: " + vuelo1.getAsientosReservados());
        System.out.println("Ocupación: " + vuelo1.porcentajeOcupacion() + "%");

    }
}
