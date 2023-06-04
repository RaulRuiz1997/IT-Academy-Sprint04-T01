package org.example;

import org.example.exercici1.Undo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Undo undo = Undo.getUndo();

        String opcio = "0";
        Scanner lector = new Scanner(System.in);

        while (!opcio.equals("4")) {

            System.out.println("Introdueix una opció:");
            System.out.println("1. Afegir comanda");
            System.out.println("2. Eliminar comanda");
            System.out.println("3. Llistar últimes comandes");
            System.out.println("4. Sortir");

            opcio = lector.nextLine();

            switch (opcio) {

                case "1":
                    System.out.println("Introdueix una comanda: ");
                    undo.afegirComanda(lector.nextLine());
                    break;

                case "2":

                    System.out.println(undo.llistarUltimesComandes());

                    if (undo.getTamanyArrayComandes() != 0) {

                        System.out.println("Selecciona la posició de la comanda a eliminar (La primera es el 0, la segona el 1 y la tercera el 2)");

                        if (undo.eliminarComanda(Integer.parseInt(lector.nextLine()))) {
                            System.out.println("Comanda eliminada\n");
                        } else {
                            System.out.println("Comanda no eliminada\n");
                        }

                    }

                    break;

                case "3":
                    System.out.println(undo.llistarUltimesComandes());
                    break;

                case "4":
                    System.out.println("Sortint de la aplicació");
                    break;

                default:
                    System.out.println("¡Introdueix una opció correcta!\n");

            }

        }

    }

}