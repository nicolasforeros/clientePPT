/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.autonoma.interfaces;

/**
 *
 * @author nikof
 */
public interface InterfazJuego {
    
    public static final int PIEDRA=0; 
    public static final int PAPEL=1; 
    public static final int TIJERA=2;
    
    public void empezarJuego(String nombreRival);
    
    public void rivalOK();
    
    public void terminarJuego(String nombreGanador, int jugadaRival);
    
    public void cerrarPartida();
    
}
