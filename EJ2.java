import java.util.Scanner;
public class EJ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();
        System.out.print("Ingrese la duración del ejercicio en minutos: ");
        int duracion = scanner.nextInt();
        System.out.print("Ingrese el tipo de ejercicio (correr, nadar, andar en bicicleta): ");
        String tipoEjercicio = scanner.next().toLowerCase();

        double caloriasQuemadas = calcularCalorias(peso, duracion, tipoEjercicio);
        System.out.println("Calorías quemadas: " + caloriasQuemadas);

        scanner.close();
    }

    private static double calcularCalorias(double peso, int duracion, String tipoEjercicio) {
        double tasaCaloriasPorMinuto;

        switch (tipoEjercicio) {
            case "correr":
                tasaCaloriasPorMinuto = 10.0; // Ejemplo de tasa
                break;
            case "nadar":
                tasaCaloriasPorMinuto = 8.0; // Ejemplo de tasa
                break;
            case "andar en bicicleta":
                tasaCaloriasPorMinuto = 6.0; // Ejemplo de tasa
                break;
            default:
                System.out.println("Tipo de ejercicio no válido.");
                return 0;
        }

        return peso * tasaCaloriasPorMinuto * duracion;
    }
}
