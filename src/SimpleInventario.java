import java.security.PublicKey;
import java.util.Scanner;
public class SimpleInventario {
    public static void agregarinventario(String s) {
        System.out.println("Agregar un Articulo: ");
        if (s.length() > 4) {
            System.out.printf("Articulo agregado Exitosamente");
        } else {
            System.out.println("No se permite el Articulo");
        }

    }

    public static String obtenerNombreArticulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de articulo: ");
        String nombredeArticulo;
        nombredeArticulo = scanner.next();
        System.out.println("Usted a ingresado el articulo" + nombredeArticulo);
        return nombredeArticulo;

    }


    public static void removerArticuloint(int id) {
        if (id > 0.00) {
            System.out.println("Articulo Removido");
        }
    }


    public static String ObtenerPrecioArticulo(String articulo, double precio) {
        double random = (Math.random() * 5000) + 100;
        if (articulo.startsWith("mar") && precio > 0.00) {
            return "Articulo " + articulo + " tiene un valor de RD$ " + random;
        } else if (articulo.startsWith("tab") || precio >= 12000.00) {
            return "Articulo " + articulo + " tiene un valor que sobrepasa 12,000.00. " + " El monto de RD$ " + random;
        }else {
            return "Ninguno de los escenarios pudo aplicar";
        }
    }

    public static void imprimirinventario () {
        System.out.println("Ingrese su Nombre");
        Scanner scanner = new Scanner(System.in);
        String usuario;
        usuario = scanner.next();
        System.out.println("Bienvenido " + usuario);
        String articuloExistente = obtenerNombreArticulo();
        System.out.println("Articulo existente: " + articuloExistente);
    }

    public static void main (String[]args){
        imprimirinventario();
    }
}