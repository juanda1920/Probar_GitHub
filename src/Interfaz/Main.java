package Interfaz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Menu\n");
            System.out.println("1. Agregar Persona\n");
            System.out.println("2. Mostrar Personas\n");
            System.out.println("3. Salir\n");
            System.out.println("Seleccione una opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Agregar Persona");
                    // Lógica para agregar persona
                    break;
                case 2:
                    System.out.println("Mostrar Personas");
                    // Lógica para mostrar personas
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }
        }while (opcion != 3);
    }
}
