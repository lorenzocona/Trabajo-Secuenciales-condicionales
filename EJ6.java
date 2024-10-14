import java.util.Scanner;
public class EJ6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántas horas al día puede estudiar? ");
        int horasDiarias = scanner.nextInt();

        generarPlanEstudio(horasDiarias);

        scanner.close();
    }

    private static void generarPlanEstudio(int horasDiarias) {
        String[] materias = {"Matemáticas", "Ciencias", "Literatura", "Historia", "Idiomas"};
        int horasPorMateria = horasDiarias / materias.length;

        System.out.println("Plan de estudio semanal:");
        for (String materia : materias) {
            System.out.println(materia + ": " + horasPorMateria + " horas");
        }
    }
}
