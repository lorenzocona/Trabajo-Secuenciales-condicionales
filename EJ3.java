import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nivel de condición física (principiante, intermedio, avanzado): ");
        String nivel = scanner.next().toLowerCase();

        generarRutina(nivel);

        scanner.close();
    }

    private static void generarRutina(String nivel) {
        switch (nivel) {
            case "principiante":
                System.out.println("Rutina de ejercicios para principiantes:");
                System.out.println("Lunes: 20 minutos de caminata");
                System.out.println("Martes: 15 minutos de yoga");
                System.out.println("Miércoles: Descanso");
                System.out.println("Jueves: 30 minutos de bicicleta");
                System.out.println("Viernes: 15 minutos de estiramiento");
                System.out.println("Sábado: Descanso");
                System.out.println("Domingo: 20 minutos de caminata");
                break;
            case "intermedio":
                System.out.println("Rutina de ejercicios para intermedios:");
                System.out.println("Lunes: 30 minutos de correr");
                System.out.println("Martes: 20 minutos de entrenamiento de fuerza");
                System.out.println("Miércoles: 30 minutos de nadar");
                System.out.println("Jueves: 30 minutos de bicicleta");
                System.out.println("Viernes: 20 minutos de yoga");
                System.out.println("Sábado: 30 minutos de correr");
                System.out.println("Domingo: Descanso");
                break;
            case "avanzado":
                System.out.println("Rutina de ejercicios para avanzados:");
                System.out.println("Lunes: 60 minutos de correr");
                System.out.println("Martes: 45 minutos de entrenamiento de fuerza");
                System.out.println("Miércoles: 60 minutos de nadar");
                System.out.println("Jueves: 45 minutos de bicicleta");
                System.out.println("Viernes: 30 minutos de HIIT");
                System.out.println("Sábado: 60 minutos de correr");
                System.out.println("Domingo: Descanso");
                break;
            default:
                System.out.println("Nivel de condición física no válido.");
        }
    }
}
