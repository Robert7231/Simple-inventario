import java.util.Scanner;

public class Simpleinventario {

    public static void agregarArticulo(String s) {
        System.out.println("agregar un articulo");

    }

    public static void RemoverArticulo(int id) {
    }

    public static double obtenerPrecioArticulo(int in) {
        return 0.00;
    }


    public static void imprimirinventario() {
        System.out.println("ingrese nombre;");
    }

    public static void main(String[] args) {
        imprimirinventario();
    }

    public static String obtenerNombredelArticulo(){
        Scanner scanner =  new Scanner(System.in);
        System.out. println("ingrese nombre del articulo");
        String nombre = scanner.next();
        System.out.println("Usted ha ingresado el articulo"+ nombre);
        return




    }

}