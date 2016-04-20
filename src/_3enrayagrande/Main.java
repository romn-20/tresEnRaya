/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _3enrayagrande;

import java.util.Scanner;

/**
 *
 * @author cristianroman
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    static Scanner sc ;
    
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        Ficha ficha;
        int x,y;
        x = y = 0;
        int turno = 1;
        char jugador;
        
        sc = new Scanner(System.in);
        Tablero t = new Tablero(6);
        System.out.println(t);
        
        do{           
            
            jugador = (turno%2==0?Ficha.JUGADOR_2:Ficha.JUGADOR_1);
            
            System.out.println("Turno del jugador "+(jugador==Ficha.JUGADOR_1?"jugador 1":"jugador 2"));
            System.out.println("Introduzca la coordenas de la ficha: ");

            System.out.println("Coordenada x: ");
            x = sc.nextInt();
            System.out.println("Coordenada y: ");
            y = sc.nextInt() ;   
            ficha = new Ficha(x,y,jugador);
            t.addFicha(ficha);

            System.out.println(t);

            turno++;
            
        }while(!t.ganador());
    }
    
}
