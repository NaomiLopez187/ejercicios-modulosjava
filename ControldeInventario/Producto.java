package ControldeInventario;

public class Producto {
    private int referencia;
    private int cantidad;
    private double preciounitario;

    public Producto(int referencia, int cantidad, double precioUnitario){
        this.referencia=referencia;
        this.cantidad=cantidad;
        this.preciounitario=precioUnitario;
    }
    public int getReferencia(){
        return referencia;
    }
    public void setReferencia(int referencia){
        this.referencia=referencia;
    }
    public int getCantidad(){
        return cantidad;
    }
    public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }
    public double getPreciounitario(){
        return preciounitario;
    }
    public void setPrecioUnitario(double precioUnitario){
        this.preciounitario=precioUnitario;
    }
    public int incremento(int entrada){
        if (entrada>0){
            cantidad=cantidad+entrada;
            System.out.println("Se agregaron "+entrada+ " unidades al stock");
        }else{
            System.out.println("La cantidad debe ser mayor que 0");
        }
        return cantidad;
    }
    public double valorTotal(){
        double total=cantidad*preciounitario;
        return total;
    }
}
