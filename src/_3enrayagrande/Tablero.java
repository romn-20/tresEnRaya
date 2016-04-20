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
public class Tablero {
    
    private char[][] carton;
    private int size;

    public Tablero(int size) {
        carton = new char [size][size];
        inicializar();
    }
    
    private void inicializar(){
        for (int i = 0; i < carton.length; i++) {
            for (int j = 0; j < carton.length; j++) {
                carton[i][j] = ' ';
            }
        }
    }
    
    
    public void addFicha(Ficha ficha){
        if(ficha.getJugador() != Ficha.JUGADOR_1 && ficha.getJugador() != Ficha.JUGADOR_2){
            System.out.println("Solo se permiten las fichas x y o");
        }
        if(carton[ficha.getY()][ficha.getX()] == Ficha.VACIA){
            carton[ficha.getY()][ficha.getX()] = ficha.getJugador();//mirar si está disponible para poner una ficha
        }else{
            System.out.println("Ese lugar ya está ocupado");
        }       
    }
    
    
    public boolean ganador(){
        
        boolean ganador = false;
        
        
        ////////// filas//////////
        int contadorX, contadorO;
        
        for(int i=0; i<carton.length; i++){
            
            contadorX= 0;
            contadorO= 0;
            
            for(int j =0; j<carton.length; j++){
                
                if(carton[i][j]==Ficha.JUGADOR_1){
                    contadorO=0;
                    contadorX++;
                    
                    if(contadorX==3){
                        ganador=true;
                        System.out.println("Ha ganado jugador 1");
                        break;
                    }
                    
                }else if(carton[i][j]==Ficha.JUGADOR_2){
                    contadorX=0;
                    contadorO++;
                    
                    if(contadorO==3){
                        ganador=true;
                        System.out.println("Ha ganado jugador 2");
                        break;
                    }
                    
                }else{
                    contadorX= 0;
                    contadorO= 0;
                }
            }
        }      
        ////////// columnas //////////
        for(int j=0; j<carton.length; j++){
            
            contadorX= 0;
            contadorO= 0;
            
            for(int i =0; i<carton.length; i++){
                
                if(carton[i][j]==Ficha.JUGADOR_1){
                    
                    contadorO=0;
                    contadorX++;
                    
                    if(contadorX==3){
                        ganador=true;
                        System.out.println("Ha ganado jugador 1");
                        break;
                    }
                    
                }else if(carton[i][j]==Ficha.JUGADOR_2){
                    
                    contadorX=0;
                    contadorO++;
                    
                    if(contadorO==3){
                        ganador=true;
                        System.out.println("Ha ganado jugador 2");
                        break;
                    }
                    
                }else{
                    contadorX= 0;
                    contadorO= 0;
                }
            }
        } 
        
        
        /////////// diagonal derecha /////////////
        
        for(int i=0; i< carton.length -1; i++){
            
            contadorX= 0;
            contadorO= 0;
            
            for(int j =0; j< carton.length; j++){
                
                int x = i + j ;
                if(x < 0 || x > carton.length-1){
                    
                }
                else{
                    if(carton[j][x]==Ficha.JUGADOR_1){
                        contadorO=0;
                        contadorX++;

                        if(contadorX==3){
                            ganador=true;
                            System.out.println("Ha ganado jugador 1");
                            break;
                        }

                    }else if(carton[j][x]==Ficha.JUGADOR_2){
                        contadorX=0;
                        contadorO++;

                        if(contadorO==3){
                            ganador=true;
                            System.out.println("Ha ganado jugador 2");
                            break;
                        }

                    }else{
                        contadorX= 0;
                        contadorO= 0;
                    }
                }
            }
        } 
        
        
        ///////////diagonal izquierda/////////////
        int tope = carton.length;
        for(int i=carton.length-1; i < 0; i--){
            
            
            contadorX= 0;
            contadorO= 0;
            
            //for(int j =0; j< carton.length-1; j++){
                
                int x = tope + i;
                
                if(x < 0 || x > carton.length-1){
                    
                }
                
                else{
                    if(carton[i][tope]==Ficha.JUGADOR_1){
                        contadorO=0;
                        contadorX++;

                        if(contadorX==3){
                            ganador=true;
                            System.out.println("Ha ganado jugador 1");
                            break;
                        }

                    }else if(carton[i][tope]==Ficha.JUGADOR_2){
                        contadorX=0;
                        contadorO++;

                        if(contadorO==3){
                            ganador=true;
                            System.out.println("Ha ganado jugador 2");
                            break;
                        }

                    }else{
                        contadorX= 0;
                        contadorO= 0;
                    }
                }
                tope++;
            //}
        }
        
        
        return ganador; 
    }
    
    
    @Override
    public String toString() {
        StringBuffer stg= new StringBuffer();
        for (int i = 0; i < carton.length; i++) {
            for (int j = 0; j < carton[i].length; j++) {
                if(j==0){
                    stg.append(" ");
                    stg.append(carton[i][j]);
                }else{
                    stg.append(" | ");
                    stg.append(carton[i][j]); 
                }
               
            }
            
            stg.append("\n");
        }
        return stg.toString();
    }

    private void Exception(String solo_se_permiten_las_fichas_x_y_o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
