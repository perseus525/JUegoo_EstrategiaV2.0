/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.juego_estrategia;

import java.util.ArrayList;
import javax.swing.JFrame;
// import java.util.Scanner;
// import static juego_estrategia_prototype.Fight.Turn;

/**
 *
 * @author marclo
 */
public class Juego_estrategia_prototype {

public static void main(String[] args) throws Exception{
               
        //incialización de la "variable" "checker" que se usa para revisar cauntas veces el usuario ha introducido un comando no válido
        ArrayList<String> checker= new ArrayList<String>();
        
        //inicialización del inventario para objetos no equipados (disponible en la armeria para uso)
        ArrayList <ObjetoEquipable> inventory = new ArrayList <ObjetoEquipable>();

        //inicialización del Array que contendrá a todos los Luchadores
        ArrayList <Luchador> list = new ArrayList <Luchador>(); 
        
        //inicialización del Array que contendrá a los Luchadores miembros del grupo o team "Party"
        ArrayList <Luchador> party = new ArrayList <Luchador>();
        
        //creación del primer Luchador de la lista
        ListaLuchadores.crearLuchador(list, inventory);

        new MainGUI(checker , list, inventory, party);   
        } 
}
