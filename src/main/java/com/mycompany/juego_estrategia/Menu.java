/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.juego_estrategia;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marclo
 */
public class Menu {
    
//método para mostrar el menú por pantalla
public static void menu(ArrayList <String> checker, ArrayList <Luchador> list, ArrayList <ObjetoEquipable> inventory, ArrayList <Luchador> party){
         
    System.out.println();
     
    System.out.println();
        
    //si "list" no posee Luchadores, el juego termina
    if (list.size() > 0){
    
        if(checker.size() < 4){
        
            System.out.println("Welcome to Monster Slayer. You have " + list.size() + " Fighter(s).");
     
            System.out.println("You have made " + checker.size() + " mistakes. Be careful");
     
            System.out.println("What is your command?(input number)");
     
            System.out.println("1) Check Fighters.");
     
            System.out.println("2) Check Inventory.");
     
            System.out.println("3) Create Fighter.");
            
            System.out.println("4) Dismiss a Fighter.");
            
            System.out.println("5) FIGHT!!!!!!!");
     
            System.out.println("6) Wuss out(leave).");
     
            System.out.println();
     
            System.out.println();
     
            try {
                //invocación a "respuesta menu" para que el usuario interactué con el juego
                respuestaMenu(checker, list, inventory, party);
            } catch (Exception ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
        else{
    
            System.out.println("THAT'S IT. I'M OUT.");
        
            System.out.println();
                        
            System.out.println();
        
            System.out.println("You pissed off a battle game and made it close itself.");
        
            System.out.println();
                        
            System.out.println("Are you proud of that?"); 
        }
    }
    else {
        
        System.out.println("You got EVRYONE KILLED.");
        
        System.out.println("");
        
        System.out.println("Get. The FUCK. OUT!!!!");
    }
}
     
//método que permite la interacción con el usuario al leer su input y llamar al método correspondiente
private static void respuestaMenu(ArrayList <String> checker, ArrayList <Luchador> list, ArrayList <ObjetoEquipable> inventory, ArrayList <Luchador> party) throws Exception{
    
        //variable usada para leer el comando del usuario
            int numero;
                    
            Scanner scan = new Scanner(System.in);
     
            numero = scan.nextInt();

            //invocación al método correspondiente al comand ingresado por el usuario
            //tódos los comandos terminan invocando nuevamente al método "menu",excepto el comando 6 (Wuss out) 
            switch (numero) {
            
                case 1: ListaLuchadores.mostrarListaAsk(list, inventory, checker);
            
                    menu(checker, list, inventory, party);
                break;
                
                case 2: Inventario.verInventarioAsk(inventory,checker);
            
                    menu(checker, list, inventory, party);
                break;
                
                case 3: ListaLuchadores.crearLuchador (list, inventory);
                
                    menu(checker, list, inventory, party);
                break;
                
                case 4: ListaLuchadores.eliminarLuchadorAsk(list, inventory, checker);
                
                    menu(checker, list, inventory, party);
                break;
                
                case 5: Fight.huntAsk(inventory, list, party,checker);
            
                    menu(checker, list, inventory, party);
                break;
                
                case 6: System.out.println("You COWARD. Come back when you find your courage.");
                break;
                
                
               //aquí se registra cada vez que el usuario intenta usar un comando que no existe en el juego
                //usar demasiados conmandos invalidos cierra el jeugo y despliega un mensaje iformando al usuario
                //la variable "checker" es la que es usada para llevar la cuenta de cuantos coamndos errados se han usado
                default:   
                    
                    checkError(checker);
                
                    menu(checker, list, inventory, party);
                    break;
            }
        }

//metodo que revisa cuantos errores se ha cometido, despleiga un mensaje acorde y luego incrementa el tamaña de la lista "checker"
public static void checkError(ArrayList <String> checker){
    
    //este metodo esta pensado para ser invocado por todos los metodos que lean alguna variable ingresada por el usuario
    //"checkError" revisa cuantos errores se han cometido y despliega un mensaje acorde
        
                    switch (checker.size()) {
                        
                        case 0:
                            
                        System.out.println(); 
                        
                        System.out.println();
                            
                        System.out.println("How about you stick to the AVAILABLE comamands?");
                        
                        System.out.println();
                        
                        System.out.println();
                        break;
                        
                        case 1:
                        
                        System.out.println();
                        
                        System.out.println();
                        
                        System.out.println("I'm warning you.");
                        
                        System.out.println();
                        
                        System.out.println();
                        break;
                      
                        case 2:
                        
                        System.out.println();
                        
                        System.out.println();
                        
                        System.out.println("Last chance wise guy.");
                        
                        System.out.println();
                        
                        System.out.println();
                        break;
                        
                        default:
                        break;
            }
             //aqui se "aumenta" la cantidad de errores cometidos, esto es porque se asume que el metodo fue invocado cuando se cometio un error 
            checker.add("Error");
    }
}
