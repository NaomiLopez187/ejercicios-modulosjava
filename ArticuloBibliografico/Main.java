package ArticuloBibliografico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa el id del libro que desas solicitar: ");
        String id=sc.nextLine();
        System.out.println("Ingrese el autor del libro solicitado: ");
        String autor=sc.nextLine();
        ArticuloBibliografico gestionlibro=new ArticuloBibliografico(id, autor, "Disponible", 6);
        System.out.println("El identificador del libro es: "+gestionlibro.getId());
        System.out.println("El autor del libro es: "+gestionlibro.getAutor());
        System.out.println("El libro esta en estado: "+gestionlibro.getEstadoPrestamo());
        System.out.println("El libro tiene una antiguedad de: "+gestionlibro.getAntiguedad()+" años");
        System.out.println("-----------------------------");
        gestionlibro.aptoReserva();
        System.out.println("------------------------------");
        gestionlibro.reservar();
        System.out.println("El nuevo estado del libro es: "+gestionlibro.getEstadoPrestamo());
    }
}
