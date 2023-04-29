/*
Ejercicio Nivel 2, Problema 1: ¡Piedra, Papel, Tijera!
OIA 2017
*/

package com.mycompany.ejerciciondos;

import java.util.Scanner;

public class PPT {

    public static void main(String[] args) {
        String jugadas;
        Scanner sc = new Scanner(System.in);
        String linea;
        boolean existencia;
        Juego j2 = new Juego();
        
        System.out.print("Jugada de Ana: ");
        linea = sc.nextLine();
        jugadas = linea;
        existencia = j2.comprobarExistencia(jugadas);
        
        while(existencia == false){
            System.out.println("La jugada ingresada no es valida.");
            System.out.print("Jugada de Ana: ");
            linea = sc.nextLine();
            jugadas = linea;
            existencia = j2.comprobarExistencia(jugadas);
        }
        
        System.out.print("Jugada de Bartolo: ");
        linea = sc.nextLine();
        existencia = j2.comprobarExistencia(linea);
        
         while(existencia == false){
            System.out.println("La jugada ingresada no es valida.");
            System.out.print("Jugada de Bartolo: ");
            linea = sc.nextLine();
            existencia = j2.comprobarExistencia(linea);
        }
         
        jugadas = jugadas.concat(" ");
        jugadas = jugadas.concat(linea);
        Juego j = new Juego(jugadas);
        
        System.out.print("Ganador: " + j.obtenerResultado());
                
    }
}
