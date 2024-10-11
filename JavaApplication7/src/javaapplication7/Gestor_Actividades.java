/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author Chris Solares
 */

import java.util.ArrayList;
import java.util.Scanner;
public class Gestor_Actividades {
    
    
      
    // Listatareas
    private static ArrayList<String> ListaActividades = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            // Mostrar el menú
            MenuOp();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea
            switch (opcion) {
                case 1:
                   AgregarActividad();
                    break;
                case 2:
                    EliminarActividad();
                    break;
                case 3:
                    ModificarActividad();
                    break;
                case 4:
                    MostrarActividad();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);
    }
    
    
    
    
    
    private static void MenuOp() {
        System.out.println("\n--- GESTOR DE TAREAS ---");
        System.out.println("1. Agregar Una Actividad");
        System.out.println("2. Eliminar Una Actividad");
        System.out.println("3. Modificar Una Actividad");
        System.out.println("4. Mostrar Una Actividad");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opcion(ingrese el valor de la opccion): ");
    }
    private static void AgregarActividad() {
            System.out.print("Ingrese la Activiad: ");
        String aactividad = scanner.nextLine();
         System.out.print("Ingrese la importancia de la misma en una escala del 1 al 5 siendo el 1 la mas importante :");
        String Importanciatarea = scanner.nextLine();
       ListaActividades.add( aactividad  + " Prioridad: " + Importanciatarea) ;
        System.out.println("Actividad Nueva Agregada Exitosamente.");
    }
    
    
    
    
    private static void EliminarActividad() {
        if (ListaActividades.isEmpty()) {
            System.out.println("No hay reguistro de alguna actividad.");
        } else {
            MostrarActividad(); 
            System.out.print("Ingrese el número de la actividad a eliminar: ");
            int indice = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea
            if (indice > 0 && indice <= ListaActividades.size()) {
                ListaActividades.remove(indice - 1);
                System.out.println("La Actividad Fue Eliminada Exitosamente.");
            } else {
                System.out.println("No se encontro ninguna actividad con esta ubicacion.");
            }
        }
    }
    
    
    private static void ModificarActividad() {
        if (ListaActividades.isEmpty()) {
            System.out.println("No hay reguistro de alguna actividad.");
        } else {
            MostrarActividad();
            System.out.print("Ingrese el número de la actividad a modificar: ");
            int indice = scanner.nextInt();
            scanner.nextLine(); 
            if (indice > 0 && indice <= ListaActividades.size()) {
                System.out.print("Ingrese la descripción de la activiadad: ");
                String nuevaactividad = scanner.nextLine();
                System.out.print("Ingrese la importancia de la misma en una escala del uno al 5 siendo el 1 la mas importante :");
                String importanciaaactividad = scanner.nextLine();
                ListaActividades.set(indice - 1, nuevaactividad + " Prioridad: " + importanciaaactividad);
                System.out.println("La Actividad Fue Modificada Exitosamente.");
            } else {
                System.out.println("No Se Encontro La Ubicacion De Esta Actividad.");
            }
        }
    }

    
    private static void MostrarActividad() {
        if (ListaActividades.isEmpty()) {
            System.out.println("Aun no se ingreso ninguna actividad.");
        } else {
            System.out.println("\n--- LISTA DE Actividades ---");
            for (int i = 0; i < ListaActividades.size(); i++) {
                System.out.println((i + 1) + ". " + ListaActividades.get(i));
            }
        }
    }

}
