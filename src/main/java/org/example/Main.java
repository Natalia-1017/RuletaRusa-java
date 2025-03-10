package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Jugador> jugadores = new ArrayList<>();
        jugadores.add(new Jugador("Camila Cortés"));
        jugadores.add(new Jugador("Andrea Cristancho"));
        jugadores.add(new Jugador("Heyder Suba"));
        jugadores.add(new Jugador("Edwin Gonzalez"));
        jugadores.add(new Jugador("Natalia Gómez"));
        jugadores.add(new Jugador("Alejandro Yepes"));

        RondasJuego juego = new RondasJuego(jugadores);

        boolean salir = false;
        while (!salir) {
            System.out.println("Menú:");
            System.out.println("1. Iniciar juego de la ruleta rusa");
            System.out.println("2. Configurar rondas máximas");
            System.out.println("3. Salir del juego");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    juego.iniciar();
                    break;
                case 2:
                    System.out.print("Ingrese el número máximo de rondas: ");
                    int rondasMaximas = scanner.nextInt();
                    scanner.nextLine();
                    juego.setRondasMaximas(rondasMaximas);
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente, por favor.");
            }
        }

        scanner.close();
    }
}
