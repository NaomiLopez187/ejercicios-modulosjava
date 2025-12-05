package ProcesoCadenasTexto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa una cadena de texto: ");
        String texto=sc.nextLine();
        System.out.println("Agrega un identificador de modulo: ");
        String id=sc.nextLine();
        CadenasTexto c1 = new CadenasTexto(texto, id, 50);

        System.out.println("=== Datos de la cadena ===");
        System.out.println("Cadena actual: " + c1.getCadenaActual());
        System.out.println("ID Módulo: " + c1.getIdModulo());
        System.out.println("Longitud máxima: " + c1.getLongitudMaxima());
        System.out.println("\nAñade un prefijo: ");
        String prefijo=sc.nextLine();
        System.out.println("\nCadena con prefijo: " + c1.agregarPrefijo(prefijo));
        System.out.println("Cantidad de espacios: " + c1.contarEspacios());
    }
}
