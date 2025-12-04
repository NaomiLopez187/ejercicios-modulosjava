package SistemadeCuentasBancarias;

public class CuentadeAhorros {
    private int numcuenta;
    private String titular;
    private double saldo;

    public CuentadeAhorros(int numcuenta, String titular, double saldo){
        this.numcuenta=numcuenta;
        this.titular=titular;
        this.saldo=saldo;
    }
    public int getNumcuenta(){
        return numcuenta;
    }
    public void setNumcuenta(int numcuenta){
        this.numcuenta=numcuenta;
    }
    public String getTitular(){
        return titular;
    }
    public void setTitular(String titular){
        this.titular=titular;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
    public double Deposito(double cantidad){
        if(cantidad > 0){
            saldo =saldo+ cantidad;
        }
        return saldo;
    }

    public double Retiro(double cantidad){
        if (saldo>=cantidad){
            saldo=saldo-cantidad;
        }else{
            System.out.println("ERROR, La cantidad que deses retirar excede de tu saldo actual");
        }
        return saldo;
    }

}
