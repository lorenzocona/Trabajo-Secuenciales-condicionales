import java.util.Scanner;
public class EJCOND7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cómo te sientes? (feliz, triste, enérgico, relajado): ");
        String estado = scanner.nextLine().toLowerCase();

        String actividad = obtenerActividad(estado);
        System.out.println("Te recomendamos: " + actividad);

        scanner.close();
    }

    private static String obtenerActividad(String estado) {
        switch (estado) {
            case "feliz":
                return "Celebrar con amigos.";
            case "triste":
                return "Ver una película que te guste.";
            case "enérgico":
                return "Hacer ejercicio al aire libre.";
            case "relajado":
                return "Leer un libro.";
            default:
                return "Estado no reconocido, intenta otra cosa.";
        }
    }
}
