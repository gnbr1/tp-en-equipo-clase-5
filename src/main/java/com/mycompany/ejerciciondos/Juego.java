
package com.mycompany.ejerciciondos;

public class Juego {
    private String jugadas;
    
    public Juego(){
        
    }
    
    public Juego(String jugadas){
        this.jugadas = jugadas;
    }
    
    public String formatearNombre(String a){
        String primeraLetra = a.substring(0, 1).toUpperCase();
        String restoNombre = a.substring(1).toLowerCase();
        String nombreFormateado = primeraLetra + restoNombre;
        
        return nombreFormateado;
    }
    
    public boolean comprobarExistencia(String a){
        String[] movimientosPosibles = {"Piedra", "Papel", "Tijera"};
        boolean existencia = false;
        a = formatearNombre(a);
        int i = 0;
        
        while(existencia == false && i < movimientosPosibles.length){
            if(movimientosPosibles[i].equals(a))
                existencia = true;
            i++;
        }
        
        return existencia;
    }
    
    public String[] separarMovimientos(){
        String[] movimientos = this.jugadas.split(" ");
        
        return movimientos;
    }
    
    public String determinarGanador(String[] movimientos){
        if (("Piedra".equals(movimientos[0]) && "Tijera".equals(movimientos[1])) || ("Papel".equals(movimientos[0]) && "Piedra".equals(movimientos[1])) || "Tijera".equals(movimientos[0]) && "Papel".equals(movimientos[1]))
            return "Ana";
        else
            return "Bartolo";
    }

    public String obtenerResultado(){
        String[] movimientos = new String[2];
        movimientos = separarMovimientos();
        
        if(movimientos[0].equals(movimientos[1])) return "Empate";
        else return determinarGanador(movimientos);
    }
}
