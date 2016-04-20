/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _3enrayagrande;

/**
 *
 * @author cristianroman
 */
public class Ficha {
    
    private int x;
    private int y;
    private char jugador;
    public static final char JUGADOR_1 = 'x'; 
    public static final char JUGADOR_2 = 'o'; 
    public static final char VACIA = ' '; 


    public Ficha() {
        x=0;
        y=0;
        jugador=JUGADOR_1;
    }

    public Ficha(int x, int y, char jugador) {
        this.x = x;
        this.y = y;
        this.jugador = jugador;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char getJugador() {
        return jugador;
    }

    public void setJugador(char jugador) {
        this.jugador = jugador;
    }
    
    
    
}
