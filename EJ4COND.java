import java.util.Scanner;
public class EJ4COND {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();
        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        double imc = calcularIMC(peso, altura);
        String recomendacion = obtenerRecomendacionIMC(imc);

        System.out.printf("Su IMC es: %.2f\n", imc);
        System.out.println("Recomendación: " + recomendacion);

        scanner.close();
    }

    private static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    private static String obtenerRecomendacionIMC(double imc) {
        if (imc < 18.5) {
            return "Bajo peso, considere consultar a un nutricionista.";
        } else if (imc < 24.9) {
            return "Peso normal, mantenga un estilo de vida saludable.";
        } else if (imc < 29.9) {
            return "Sobrepeso, considere hacer cambios en su dieta.";
        } else {
            return "Obesidad, se recomienda consultar a un profesional de la salud.";
        }
    }
}
