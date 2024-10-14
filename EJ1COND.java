import java.util.Scanner;
public class EJ1COND {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("¿Cuál es tu género de película favorito? (acción, comedia, drama, ciencia ficción): ");
            String genero = scanner.nextLine().toLowerCase();

            String recomendacion = obtenerRecomendacion(genero);
            System.out.println("Te recomendamos la película: " + recomendacion);

            scanner.close();
        }

        private static String obtenerRecomendacion(String genero) {
            switch (genero) {
                case "acción":
                    return "Mad Max: Fury Road";
                case "comedia":
                    return "Superbad";
                case "drama":
                    return "The Shawshank Redemption";
                case "ciencia ficción":
                    return "Inception";
                default:
                    return "No tenemos recomendaciones para ese género.";
            }
        }

}
