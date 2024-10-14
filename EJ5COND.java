import java.util.Random;
import java.util.Scanner;
public class EJ5COND {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Elige: piedra, papel o tijera: ");
        String eleccionUsuario = scanner.next().toLowerCase();

        String[] opciones = {"piedra", "papel", "tijera"};
        String eleccionComputadora = opciones[random.nextInt(opciones.length)];

        System.out.println("La computadora eligió: " + eleccionComputadora);
        determinarGanador(eleccionUsuario, eleccionComputadora);

        scanner.close();
    }

    private static void determinarGanador(String usuario, String computadora) {
        if (usuario.equals(computadora)) {
            System.out.println("¡Es un empate!");
        } else if ((usuario.equals("piedra") && computadora.equals("tijera")) ||
                (usuario.equals("papel") && computadora.equals("piedra")) ||
                (usuario.equals("tijera") && computadora.equals("papel"))) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("¡Perdiste!");
        }
    }
}
