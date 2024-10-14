import java.util.Scanner;
public class EJ2COND {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese la categoría del cliente (estudiante, adulto, jubilado): ");
        String categoria = scanner.next().toLowerCase();

        double precioFinal = calcularPrecioFinal(precio, categoria);
        System.out.println("El precio final después del descuento es: $" + precioFinal);

        scanner.close();
    }

    private static double calcularPrecioFinal(double precio, String categoria) {
        double descuento;

        switch (categoria) {
            case "estudiante":
                descuento = 0.10;
                break;
            case "adulto":
                descuento = 0.05;
                break;
            case "jubilado":
                descuento = 0.15;
                break;
            default:
                descuento = 0;
                System.out.println("Categoría no válida, sin descuento aplicado.");
        }

        return precio - (precio * descuento);
    }
}
