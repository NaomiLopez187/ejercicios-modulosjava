package GestionTareas;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            TareaPendiente tarea1 = new TareaPendiente("Hacer tarea de matemáticas", "Alta");
            System.out.println("Descripción: " + tarea1.getDescripcion());
            tarea1.marcarComoCompletada();
            System.out.println("Prioridad: " + tarea1.getPrioridad());
            System.out.println("Completada: " + tarea1.getCompletada());
            System.out.println("¿Es urgente? " + tarea1.esUrgente());
        }
    }

