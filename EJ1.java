import java.util.Scanner;
public class EJ1 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese su fecha de nacimiento (DD/MM/AAAA): ");
            String fecha = scanner.nextLine();
            String[] partes = fecha.split("/");

            int dia = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]);

            String signo = obtenerSigno(mes, dia);
            String horoscopo = obtenerHoroscopo(signo);

            System.out.println("Su signo del zodiaco es: " + signo);
            System.out.println("Horóscopo: " + horoscopo);

            scanner.close();
        }

        private static String obtenerSigno(int mes, int dia) {
            if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) return "Acuario";
            if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) return "Piscis";
            if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) return "Aries";
            if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) return "Tauro";
            if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) return "Géminis";
            if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) return "Cáncer";
            if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) return "Leo";
            if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) return "Virgo";
            if ((mes == 9 && dia >= 22) || (mes == 10 && dia <= 22)) return "Libra";
            if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) return "Escorpio";
            if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) return "Sagitario";
            if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) return "Capricornio";
            return "Fecha no válida";
        }

        private static String obtenerHoroscopo(String signo) {
            switch (signo) {
                case "Acuario":
                    return "Hoy es un buen día para innovar.";
                case "Piscis":
                    return "Confía en tu intuición hoy.";
                case "Aries":
                    return "Un nuevo comienzo está a la vista.";
                case "Tauro":
                    return "La paciencia te traerá recompensas.";
                case "Géminis":
                    return "La comunicación es clave hoy.";
                case "Cáncer":
                    return "Disfruta de los momentos en familia.";
                case "Leo":
                    return "Deja que tu creatividad brille.";
                case "Virgo":
                    return "Organiza tus prioridades.";
                case "Libra":
                    return "Busca el equilibrio en tu vida.";
                case "Escorpio":
                    return "Tu pasión será tu guía.";
                case "Sagitario":
                    return "Explora nuevas oportunidades.";
                case "Capricornio":
                    return "La disciplina te llevará lejos.";
                default:
                    return "No hay horóscopo disponible.";
            }
        }
}
