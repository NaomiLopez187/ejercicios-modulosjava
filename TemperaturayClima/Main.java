package TemperaturayClima;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa el valor de la temperatura: ");
        double valor= sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingresa la unidad de temperarura: (C/F)");
        String unidad=sc.nextLine();
        System.out.println("Ingrese la fecha de registro: ");
        String fecha=sc.nextLine();
        Temperatura tempe = new Temperatura(valor, unidad, fecha);

        System.out.println("=== Temperatura Inicial ===");
        System.out.println("Valor: " + tempe.getValor() + " " + tempe.getUnidad());
        System.out.println("Fecha de registro : " + tempe.getFechaRegistro());
        System.out.println("¿Es extrema? " + tempe.esExtrema());

        System.out.println("\n--- Convirtiendo la temperatura ---\n");
        tempe.conversion();
        System.out.println("=== Temperatura Convertida ===");
        System.out.println("Valor: " + tempe.getValor() + " " + tempe.getUnidad());
        System.out.println("Fecha: " + tempe.getFechaRegistro());
        System.out.println("¿Es extrema? " + tempe.esExtrema());
    }
}
