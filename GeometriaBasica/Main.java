package GeometriaBasica;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Ingrese la medida de la base del rectangulo: ");
        int base=sc.nextInt();
        System.out.println("Ingresa la medida de la altura del rectangulo: ");
        int altura=sc.nextInt();
        System.out.println("Ingresa una etiqueta de identificacion para la figura: ");
        String id=sc.nextLine();

        Rectangulo calculo=new Rectangulo(base,altura,id);
        System.out.println("La etiqueta de identificacion del rectangulo es: "+calculo.getId());
        System.out.println("El area del rectangulo es: "+calculo.calcularArea()+" metros cuadrados");
        System.out.println("El perimetro del rectangulo es: "+calculo.calcularPerimetro()+" metros");
    }
}
