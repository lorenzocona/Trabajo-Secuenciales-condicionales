import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su estado de ánimo (feliz, triste, enérgico, relajado): ");
        String estado = scanner.next().toLowerCase();

        generarListaReproduccion(estado);

        scanner.close();
    }

    private static void generarListaReproduccion(String estado) {
        System.out.println("Lista de reproducción para estado de ánimo: " + estado);

        switch (estado) {
            case "feliz":
                System.out.println("1. Happy - Pharrell Williams");
                System.out.println("2. Walking on Sunshine - Katrina and the Waves");
                System.out.println("3. Best Day of My Life - American Authors");
                break;
            case "triste":
                System.out.println("1. Fix You - Coldplay");
                System.out.println("2. Someone Like You - Adele");
                System.out.println("3. Let Her Go - Passenger");
                break;
            case "enérgico":
                System.out.println("1. Eye of the Tiger - Survivor");
                System.out.println("2. Can't Stop the Feeling - Justin Timberlake");
                System.out.println("3. Stronger - Kanye West");
                break;
            case "relajado":
                System.out.println("1. Weightless - Marconi Union");
                System.out.println("2. Ocean Eyes - Billie Eilish");
                System.out.println("3. Aqueous Transmission - Incubus");
                break;
            default:
                System.out.println("Estado de ánimo no válido.");
        }
    }
}
