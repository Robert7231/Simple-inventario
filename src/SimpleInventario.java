import java.util.Scanner;

public class SimpleInventario {

    public static void agregarArticulo(String articulo) {
        if (articulo.length() > 4) {
            System.out.println("Artículo agregado exitosamente!");
        } else {
            System.out.println("No se permite este artículo");
        }
    }

    public static void removerArticulo(int id) {
        if (id > 0) {
            // Coloca aquí la lógica para remover el artículo.
            System.out.println("Artículo removido exitosamente.");
        } else {
            System.out.println("ID no válido para remover un artículo");
        }
    }

    public static String obtenerNombreArticulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del artículo: ");
        String nombredeArticulo = scanner.next();
        if (nombredeArticulo.length() > 3) {
            System.out.println("Usted ha ingresado el artículo " + nombredeArticulo);
            return nombredeArticulo;
        } else {
            return "Error en operación";
        }
    }

    public static String obtenerPrecioArticulo(String articulo, double precio) {
        double randomValue = (Math.random() * 4900) + 100; // Valores entre 100 y 5000.
        if (articulo.startsWith("mar") && precio >= 0.00) {
            return "Artículo " + articulo + " tiene un valor de RD$ " + randomValue;
        } else if (articulo.startsWith("tab") || precio >= 12000.00) {
            return "Artículo " + articulo + " tiene un valor que sobrepasa los 12,000.00. El monto es de RD$ " + randomValue;
        } else {
            return "Ninguno de los escenarios pudo aplicar";
        }
    }

    public static void imprimirInventario() {
        System.out.println("Ingrese su Nombre");
        Scanner scanner = new Scanner(System.in);
        String usuario = scanner.next();
        System.out.println("Bienvenido " + usuario);
        String articuloExistente = obtenerNombreArticulo();
        System.out.println("Artículo existente: " + articuloExistente);
    }

    public static void main(String[] args) {
        imprimirInventario();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Elija una opción: ");
        System.out.println("1. Agregar artículo");
        System.out.println("2. Remover artículo");
        System.out.println("3. Obtener precio de artículo");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el nombre del artículo a agregar: ");
                String articulo = scanner.next();
                agregarArticulo(articulo);
                break;
            case 2:
                System.out.println("Ingrese el ID del artículo a remover: ");
                int id = scanner.nextInt();
                removerArticulo(id);
                break;
            case 3:
                System.out.println("Ingrese el nombre del artículo: ");
                String nombreArticulo = scanner.next();
                System.out.println("Ingrese el precio del artículo: ");
                double precio = scanner.nextDouble();
                String resultado = obtenerPrecioArticulo(nombreArticulo, precio);
                System.out.println(resultado);
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}