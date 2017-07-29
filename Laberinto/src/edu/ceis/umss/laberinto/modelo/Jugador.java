package edu.ceis.umss.laberinto.modelo;

/**
 * @author Anonimous
 */
public class Jugador {

    private int id;
    private String nickname;
    private Celda celda;
    private Tablero tablero;

    public Jugador(int id, String nickname) {
        this.id = id;
        this.nickname = nickname;
    }

    public void mover(Direccion direccion) {
        switch (direccion) {
            case ABAJO:
                if (estaVacio(celda.getFila() + 1, celda.getColumna())) {
                    tablero.getCelda(celda.getFila(), celda.getColumna()).setEstado(Estado.VACIO);
                    tablero.getCelda(celda.getFila() + 1, celda.getColumna()).setEstado(Estado.JUGADOR);
                    tablero.setCelda(celda.getFila() + 1, celda.getColumna(), this);
                }
                break;
            case ARRIBA:
                if (estaVacio(celda.getFila() - 1, celda.getColumna())) {
                    tablero.getCelda(celda.getFila(), celda.getColumna()).setEstado(Estado.VACIO);
                    tablero.getCelda(celda.getFila() - 1, celda.getColumna()).setEstado(Estado.JUGADOR);
                    tablero.setCelda(celda.getFila() - 1, celda.getColumna(), this);
                }
                break;
            case DERECHA:
                if (estaVacio(celda.getFila(), celda.getColumna() + 1)) {
                    tablero.getCelda(celda.getFila(), celda.getColumna()).setEstado(Estado.VACIO);
                    tablero.getCelda(celda.getFila(), celda.getColumna() + 1).setEstado(Estado.JUGADOR);
                    tablero.setCelda(celda.getFila(), celda.getColumna() + 1, this);
                }
                break;
            case IZQUIERDA:
                if (estaVacio(celda.getFila(), celda.getColumna() - 1)) {
                    tablero.getCelda(celda.getFila(), celda.getColumna()).setEstado(Estado.VACIO);
                    tablero.getCelda(celda.getFila(), celda.getColumna() - 1).setEstado(Estado.JUGADOR);
                    tablero.setCelda(celda.getFila(), celda.getColumna() - 1, this);
                }
                break;
        }
    }

    private boolean estaVacio(int x, int y) {
        if (x < tablero.getCeldas().length
                && y < tablero.getCeldas().length
                && y >= 0 && x >= 0) {
            if (tablero.getCeldas()[x][y].getEstado() == Estado.VACIO) {
                return true;
            }
        }
        return false;
    }

    public void setCelda(Celda celda) {
        this.celda = celda;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }
}
