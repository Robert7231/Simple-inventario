import java.util.Scanner;

public class SimpleInventario {
    public static double obtenerPrecioArticulo() {
        double random = Math.random() * 5000 + 100;
        return random > 0 ? random : -1;
    }

    public static void modificarArticulo() {
        String nombre = obtenerNombreArticulo();
        double precio = obtenerPrecioArticulo();

        if (nombre.matches("[adAD].*")) {
            precio *= (precio >= 150 && precio <= 250) ? 1.02 : (precio > 250 && precio <= 500) ? 1.08 : 1.12;
        } else if (nombre.matches("[cmCM].*")) {
            precio *= 0.80;
        } else {
            System.out.println("El artículo no cumple con los criterios para modificar el precio.");
            return;
        }

        System.out.printf("Artículo %s tiene un precio actualizado de RD$%.2f%n", nombre, precio);
    }

    public static void agregarInventario(String s) {
        System.out.println("Agregar un Articulo: " + (s.length() > 4 ? "Articulo agregado Exitosamente" : "No se permite el Articulo"));
    }

    public static String obtenerNombreArticulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de artículo: ");
        return scanner.next();
    }

    public static void imprimirInventario() {
        System.out.println("Ingrese su Nombre");
        String usuario = new Scanner(System.in).next();
        System.out.println("Bienvenido " + usuario);
        String articuloExistente = obtenerNombreArticulo();
        System.out.println("Artículo existente: " + articuloExistente);
    }

    public static void main(String[] args) {
        modificarArticulo();
    }
}