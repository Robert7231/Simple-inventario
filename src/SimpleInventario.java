import java.util.Scanner;

public class SimpleInventario {
    static String[] articulos = new String[5];

    public static void agregarArticulo() {
        for (int i = 0; i < articulos.length; i++) {
            articulos[i] = obtenerNombredeArticulo();
        }
    }

    public static void imprimirInventario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String usuario = scanner.next();
        System.out.println("Bienvenid@ " + usuario);
        System.out.println("Articulos registrados: ");
        for (String articulo : articulos) {
            System.out.println(articulo);
        }
    }

    public static void main(String[] args) {
        agregarArticulo();
        imprimirInventario();
    }

    public static String obtenerNombredeArticulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del artículo");
        String nombrearticulo = scanner.next();
        if (nombrearticulo.length() > 3) {
            System.out.println("Usted ha ingresado un artículo " + nombrearticulo);
            return nombrearticulo;
        } else {
            return "";
        }
    }
}







