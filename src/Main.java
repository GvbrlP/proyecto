import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        Estudiante estudiante = new Estudiante("ana","infromatica",20);

        estudiante.mostrarInformacion();


        System.out.println("ingres nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("ingrese carrera: ");
        String carrera = scanner.nextLine();

        System.out.println("ingrese edad: ");
        int edad = scanner.nextInt();





    }
}