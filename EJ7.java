import java.util.Scanner;
public class EJ7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Califique su nivel de satisfacción con la vida (1-10): ");
        int satisfaccion = scanner.nextInt();
        System.out.print("Califique su nivel de estrés (1-10): ");
        int estres = scanner.nextInt();
        System.out.print("Califique su nivel de salud (1-10): ");
        int salud = scanner.nextInt();

        double indiceFelicidad = calcularIndiceFelicidad(satisfaccion, estres, salud);
        System.out.println("Índice de felicidad: " + indiceFelicidad);

        scanner.close();
    }

    private static double calcularIndiceFelicidad(int satisfaccion, int estres, int salud) {
        return (satisfaccion + (10 - estres) + salud) / 3.0;
    }
}
