import java.util.Scanner;

public class SimpleInventario {
    // Se crea una variable estática de arreglo llamada "articulos" con 5 elementos de tipo String
    private static String[] articulos = new String[5];

    public static void agregarArticulo(String s) {
        // Se itera sobre el arreglo para asignar el valor del método "obtenerNombredeArticulo" a cada elemento del arreglo
        for (int i = 0; i < articulos.length; i++) {
            articulos[i] = obtenerNombredeArticulo();
        }
        System.out.println("Artículos agregados exitosamente al inventario.");
    }

    public static void imprimirInventario() {
        // Se crea un objeto Scanner para leer el nombre del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String usuario = scanner.nextLine();
        System.out.println("Bienvenid@ " + usuario);

        // Se imprime el mensaje "Articulos registrados:" seguido de los elementos del arreglo
        System.out.println("Artículos registrados: ");
        for (String articulo : articulos) {
            if (articulo != null) {
                System.out.println(articulo);
            }
        }
    }

    public static void main(String[] args) {
        agregarArticulo("");
        imprimirInventario();
    }

    public static String obtenerNombredeArticulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del artículo: ");
        String nombrearticulo = scanner.nextLine();
        if (nombrearticulo.length() > 3) {
            System.out.println("Usted ha ingresado un artículo: " + nombrearticulo);
            return nombrearticulo;
        } else {
            System.out.println("El nombre del artículo es demasiado corto.");
            return "";
        }
    }
}









