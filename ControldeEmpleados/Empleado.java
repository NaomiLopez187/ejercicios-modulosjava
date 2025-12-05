package ControldeEmpleados;

public class Empleado {
    private String claveEmpleado;
    private double salarioMensual;
    private double porcentajeImpuestos;

    public Empleado(String claveEmpleado, double salarioMensual, double porcentajeImpuestos) {
        this.claveEmpleado = claveEmpleado;
        this.salarioMensual = salarioMensual;
        this.porcentajeImpuestos = porcentajeImpuestos;
    }

    public String getClaveEmpleado() {
        return claveEmpleado;
    }
    public void setClaveEmpleado(String claveEmpleado) {
        this.claveEmpleado = claveEmpleado;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }
    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public double getPorcentajeImpuestos() {

        return porcentajeImpuestos;
    }
    public void setPorcentajeImpuestos(double porcentajeImpuestos) {

        this.porcentajeImpuestos = porcentajeImpuestos;
    }


    public double calcularSalarioNeto() {
        double impuestos = salarioMensual *(porcentajeImpuestos/100);
        return salarioMensual - impuestos;
    }


    public void aplicarAumento(double porcentajeAumento) {
        salarioMensual = salarioMensual + (salarioMensual * (porcentajeAumento/100));
    }
}


