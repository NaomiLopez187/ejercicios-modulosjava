package GeometriaBasica;

public class Rectangulo {
    private int base;
    private int altura;
    private String id;

    public Rectangulo(int base, int altura, String id){
        this.base=base;
        this.altura=altura;
        this.id=id;
    }
    public int getBase(){
        return base;
    }
    public void setBase(int base){
        this.base=base;
    }
    public int getAltura(){
        return altura;
    }
    public void setAltura(int altura){
        this.altura=altura;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }
    public int calcularArea(){
        return altura*base;
    }
    public int calcularPerimetro(){
        return (2*altura)+(2*base);
    }
}
