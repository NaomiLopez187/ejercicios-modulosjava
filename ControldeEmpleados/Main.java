package ControldeEmpleados;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        Empleado datos = new Empleado("Empleado1", 2300.500, 10);
        System.out.println("La clave del empleado es: "+datos.getClaveEmpleado());
        System.out.println("Su salario mensual es de : $"+datos.getSalarioMensual());
        System.out.println("Su porcentaje de impuestos es del: "+datos.getPorcentajeImpuestos()+"%");

        System.out.println("Su salario neto es de : $"+datos.calcularSalarioNeto());
        System.out.println("Ingresa el porcentaje de aumento que quieras agregarle al salario del "+datos.getClaveEmpleado());
        double aumento=sc.nextDouble();
        datos.aplicarAumento(aumento);//solo cuando el metodo es void, no retorna nada, solo llama
        System.out.println("El nuevo salario de el " +datos.getClaveEmpleado()+" es de : $"+datos.getSalarioMensual());//aqui llamas lo que ya cambio

    }
}
