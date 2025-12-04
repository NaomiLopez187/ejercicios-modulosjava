package ArticuloBibliografico;

public class ArticuloBibliografico {
    private String id;
    private String autor;
    private String estadoPrestamo;
    private int antiguedad;

    public ArticuloBibliografico(String id, String autor, String estadoPrestamo, int antiguedad){
        this.id=id;
        this.autor=autor;
        this.antiguedad=antiguedad;
        this.estadoPrestamo=estadoPrestamo;
    }

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    public String getEstadoPrestamo(){
        return estadoPrestamo;
    }
    public void setEstadoPrestamo(String estadoPrestamo){
        this.estadoPrestamo=estadoPrestamo;
    }
    public int getAntiguedad(){
        return antiguedad;
    }
    public void setAntiguedad(int antiguedad){
        this.antiguedad=antiguedad;
    }

    public String reservar(){
        if(estadoPrestamo.equals("Disponible")){
            estadoPrestamo="No disponible";
            System.out.println("El articulo ha sido reservado");
        }else {
            System.out.println("No se puede reservar, el articulo no disponible");
        }
        return estadoPrestamo;
    }
    public  void aptoReserva(){
        if(antiguedad>5){
            System.out.println("Puedes reservar");
        }else {
            System.out.println("No puedes reservar");
        }
    }
}
