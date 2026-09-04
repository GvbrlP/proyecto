import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);



        System.out.println("ingres nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("ingrese carrera: ");
        String carrera = scanner.nextLine();

        System.out.println("ingrese edad: ");
        int edad = scanner.nextInt();



        Estudiante estudiante = new Estudiante (nombre, carrera, edad);

        if (edad >= 18){
            System.out.println("Accesi autorizado.");
        } else {
            System.out.println("acceso restringido.");
        }

        
        estudiante.mostrarInformacion();




    }
}