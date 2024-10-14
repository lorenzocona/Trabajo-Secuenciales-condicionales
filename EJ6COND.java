import java.util.Scanner;
public class EJ6COND {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántas horas al día duerme? ");
        int horasDormir = scanner.nextInt();
        System.out.print("¿Cuántas horas al día hace ejercicio? ");
        int horasEjercicio = scanner.nextInt();
        System.out.print("¿Cuántas comidas saludables consume al día? ");
        int comidasSaludables = scanner.nextInt();

        evaluarHabitos(horasDormir, horasEjercicio, comidasSaludables);

        scanner.close();
    }

    private static void evaluarHabitos(int dormir, int ejercicio, int comidas) {
        System.out.println("Evaluación de hábitos saludables:");
        if (dormir < 7) {
            System.out.println("Deberías dormir más para una mejor salud.");
        } else {
            System.out.println("Buen tiempo de sueño.");
        }

        if (ejercicio < 1) {
            System.out.println("Es recomendable hacer más ejercicio.");
        } else {
            System.out.println("¡Sigue así con el ejercicio!");
        }

        if (comidas < 3) {
            System.out.println("Intenta incluir más comidas saludables en tu dieta.");
        } else {
            System.out.println("¡Excelente, estás comiendo bien!");
        }
    }
}
