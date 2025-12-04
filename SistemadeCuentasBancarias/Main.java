package SistemadeCuentasBancarias;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        CuentadeAhorros banco = new CuentadeAhorros(2347892, "Naomi", 7900);
        System.out.println("El numero de cuenta es: "+banco.getNumcuenta());
        System.out.println("El titular es: "+banco.getTitular());
        System.out.println("El sueldo actual de tu cuenta es: $"+banco.getSaldo());
        System.out.println("--------------------");
        System.out.println("Ingresa la cantidad que quieras depositar: ");
        double cantidad=sc.nextDouble();
        System.out.println("Gracias por tu deposito, tu saldo actual es: $"+banco.Deposito(cantidad));
        System.out.println("----------------------------");
        System.out.println("Ingresa la cantidad que quieras retirar: ");
        cantidad=sc.nextDouble();
        System.out.println("Retiro completado. Tu saldo actual es de $"+banco.Retiro(cantidad));
    }
}
