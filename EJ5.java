import java.util.Scanner;
public class EJ5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la distancia del viaje en kilómetros: ");
        double distancia = scanner.nextDouble();
        System.out.print("Ingrese el consumo de combustible del vehículo en litros por kilómetro: ");
        double consumo = scanner.nextDouble();
        System.out.print("Ingrese el precio del combustible por litro: ");
        double precioCombustible = scanner.nextDouble();

        double costoTotal = calcularCostoViaje(distancia, consumo, precioCombustible);
        System.out.println("El costo total del viaje es: $" + costoTotal);

        scanner.close();
    }

    private static double calcularCostoViaje(double distancia, double consumo, double precioCombustible) {
        double litrosNecesarios = distancia * consumo;
        return litrosNecesarios * precioCombustible;
    }
}
