package edu.ceis.umss.laberinto.controlador;

import edu.ceis.umss.laberinto.modelo.Direccion;
import edu.ceis.umss.laberinto.modelo.Juego;
import edu.ceis.umss.laberinto.modelo.Jugador;

import java.util.Scanner;
/**
 * 
 *  @author Anonimous
 */
public class Main {

    public static void main(String[] args) {
        Jugador jugador = new Jugador(12, "None");
        Juego juego = new Juego(jugador);

        Scanner lector = new Scanner(System.in);
        while (true) {
        String direccion = lector.nextLine();
            if(direccion.equals("q")) {
                break;
            }
            switch (direccion) {
                case "w":
                    jugador.mover(Direccion.ARRIBA);
                    juego.getTablero().mostrar();
                    break;
                case "s":
                    jugador.mover(Direccion.ABAJO);
                    juego.getTablero().mostrar();
                    break;
                case "a":
                    jugador.mover(Direccion.IZQUIERDA);
                    juego.getTablero().mostrar();
                    break;
                case "d":
                    jugador.mover(Direccion.DERECHA);
                    juego.getTablero().mostrar();
                    break;
                default:
                    juego.getTablero().mostrar();
                    break;
            }
        }
    }
}
