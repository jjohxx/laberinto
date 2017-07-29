package edu.ceis.umss.laberinto.modelo;

/**
 * @author Anonymous
 */
public class Jugador {

    private int id;
    private String nickname;
    private Celda celda;

    public Jugador(int id, String nickname) {
        this.id = id;
        this.nickname = nickname;
    }

    public void setCelda(Celda celda) {
        this.celda = celda;
    }

}
