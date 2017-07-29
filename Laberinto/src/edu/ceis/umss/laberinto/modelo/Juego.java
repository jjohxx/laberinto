package edu.ceis.umss.laberinto.modelo;

/**
 *  @author Anonimous
 */
public class Juego {

    private Tablero tablero;
    private Jugador jugador;
    public Juego(Jugador jugador) {
        this.jugador = jugador;
        tablero = new Tablero(6);
        generarTablero(tablero);
        jugador.setTablero(tablero);
    }

     private void generarTablero(Tablero tablero){

        tablero.setCelda(0, 0, jugador);
//        tablero.setCelda(0, 1, new Obstaculo());
//        tablero.setCelda(0, 2, new Obstaculo());
        tablero.setCelda(0, 3, new Obstaculo());
//        tablero.setCelda(0, 4, new Obstaculo());
//        tablero.setCelda(0, 5, new Obstaculo());

        tablero.setCelda(1, 0, new Obstaculo());
        tablero.setCelda(1, 1, new Obstaculo());
//        tablero.setCelda(1, 2, new Obstaculo());
//        tablero.setCelda(1, 3, new Obstaculo());
//        tablero.setCelda(1, 4, new Obstaculo());
        tablero.setCelda(1, 5, new Obstaculo());

//         tablero.setCelda(2, 0, jugador);
//         tablero.setCelda(2, 1, new Obstaculo());
//         tablero.setCelda(2, 2, new Obstaculo());
         tablero.setCelda(2, 3, new Obstaculo());
//         tablero.setCelda(2, 4, new Obstaculo());
         tablero.setCelda(2, 5, new Obstaculo());

         tablero.setCelda(3, 0, new Obstaculo());
         tablero.setCelda(3, 1, new Obstaculo());
         tablero.setCelda(3, 2, new Obstaculo());
         tablero.setCelda(3, 3, new Obstaculo());
//         tablero.setCelda(3, 4, new Obstaculo());
         tablero.setCelda(3, 5, new Obstaculo());

//         tablero.setCelda(4, 0, new Obstaculo());
//         tablero.setCelda(4, 1, new Obstaculo());
//         tablero.setCelda(4, 2, new Obstaculo());
//         tablero.setCelda(4, 3, new Obstaculo());
//         tablero.setCelda(4, 4, new Obstaculo());
         tablero.setCelda(4, 5, new Obstaculo());

//         tablero.setCelda(5, 0, jugador);
         tablero.setCelda(5, 1, new Obstaculo());
//         tablero.setCelda(5, 2, new Obstaculo());
         tablero.setCelda(5, 3, new Obstaculo());
//         tablero.setCelda(5, 4, new Obstaculo());
//         tablero.getCelda(5, 5).setEstado(Estado.META);
    }

    public Tablero getTablero() {
        return tablero;
    }
}
