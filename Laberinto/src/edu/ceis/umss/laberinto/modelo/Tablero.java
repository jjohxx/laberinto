package edu.ceis.umss.laberinto.modelo;

/**
 * @author Anonimous
 */
public class Tablero {

    private Celda[][] celdas;

    public Tablero(int tamanio) {
        celdas = new Celda[tamanio][tamanio];
        inicializarTablero();
    }

    public Celda[][] getCeldas() {
        return celdas;
    }

    public void setCelda(int fila, int columna, Object object) {
        celdas[fila][columna].agregarObjeto(object);
    }

    public Celda getCelda(int fila, int columna) {
        return celdas[fila][columna];
    }

    private void inicializarTablero() {
        for (int i = 0; i < celdas.length; i++) {
            for (int j = 0; j < celdas.length; j++) {
                celdas[i][j] = new Celda(i, j);
            }
        }
    }

    public void mostrar() {
        String none = " ";
        for (int i = 0; i < celdas.length; i++) {
            for (int j = 0; j < celdas.length; j++) {
                if (null != celdas[i][j].getEstado()) switch (celdas[i][j].getEstado()) {
                    case JUGADOR:
                        none = "P";
                        break;
                    case OBSTACULO:
                        none = "O";
                        break;
                    case VACIO:
                        none = "-";
                        break;
                    default:
                        break;
                }
                System.out.printf("%5s ", none);
            }
            System.out.println();
        }
    }
}
