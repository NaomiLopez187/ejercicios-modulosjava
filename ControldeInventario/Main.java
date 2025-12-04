package ControldeInventario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el codigo de referencia del producto: ");
        int referencia=sc.nextInt();
        System.out.println("Ingrese la cantidad de stock en productos: ");
        int stock=sc.nextInt();
        System.out.println("Ingrese el precio unitario de los productos: ");
        double precio=sc.nextDouble();
        Producto control=new Producto(referencia, stock, precio);
        System.out.println("La referencia dle producto es:"+control.getReferencia());
        System.out.println("La cantidad de stock del producto es: "+control.getCantidad());
        System.out.println("El precio unitario del producto: $"+control.getPreciounitario());

        System.out.println("------------------------");
        System.out.println("Ingresa la cantidad de productos ingresados: ");
        int cantidad=sc.nextInt();
        System.out.println("La cantidad de stock actual es de: "+control.incremento(cantidad));
        System.out.println("-------------------------------");
        System.out.println("La Valor total del stock es: $"+control.valorTotal());
    }
}
