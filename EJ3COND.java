import java.util.Scanner;
public class EJ3COND {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuál es tu género de libro favorito? (fantasía, misterio, romance, ciencia ficción): ");
        String genero = scanner.nextLine().toLowerCase();

        String recomendacion = obtenerRecomendacion(genero);
        System.out.println("Te recomendamos el libro: " + recomendacion);

        scanner.close();
    }

    private static String obtenerRecomendacion(String genero) {
        switch (genero) {
            case "fantasía":
                return "Harry Potter y la piedra filosofal - J.K. Rowling";
            case "misterio":
                return "El código Da Vinci - Dan Brown";
            case "romance":
                return "Orgullo y prejuicio - Jane Austen";
            case "ciencia ficción":
                return "Dune - Frank Herbert";
            default:
                return "No tenemos recomendaciones para ese género.";
        }
    }
}
