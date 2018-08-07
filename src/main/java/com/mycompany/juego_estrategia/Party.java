/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.juego_estrategia;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author marclo
 */
public class Party {
    
    
    //metodo que pregunta que tipo de party se queire, random o selccionada
    public static void makePartyAsk(ArrayList <Luchador> party, ArrayList <Luchador> list, ArrayList <String> checker, Monstruo monster, ArrayList <ObjetoEquipable> inventory){

        int partySize;
        
        if (list.size() < 6){
            
            partySize = list.size();
        }
        else{
            partySize = 6;
        }
        
        new RandomPartyAsk(party, list, partySize,checker, monster, inventory);
    }

    //metodo para crear una "Party"
    public static void makeParty(ArrayList <Luchador> party, ArrayList <Luchador> list, int numero, int partySize, ArrayList <String> checker, Monstruo monster, ArrayList <ObjetoEquipable> inventory){
 
        int i = 0;

            switch (numero) {
                
                case 1: 
                    while (i < partySize){
                        
                        addPartyRandom( party, list);
                    
                        if ( (i > 0) & (party.size() > 0)){
                
                            boolean nameCheck = checkNameParty( party);
                
                            if(nameCheck == true){
                
                            ListaLuchadores.eliminarLuchador(party, party.size()-1, checker); 
                
                            i--;
                            }   
                        }
                    i++;
                    }
                    applyItemEffects(party);   
                break;
                
                case 2: 
                    
                    while (i < list.size()){
                        
                        new AddToPartyWindow(list.get(i), i + 1, party, partySize, monster, inventory, list, checker);
                        
                        i++;
                    }     
                break;
            }        
    }
   
    //metodo que altera los stats de los Luchadores en base sus ObjetosEquipables
    private static void applyItemEffects(ArrayList <Luchador> party){
    
        for (int i = 0; i < party.size() - 1; i++){
            
            party.get(i).setHP(Luchador.confirmFighterHP(party.get(i)));
  
            party.get(i).setATK(Luchador.confirmFighterATK(party.get(i)));
            
            party.get(i).setDEF(Luchador.confirmFighterDEF(party.get(i)));
            
            party.get(i).setSPD(Luchador.confirmFighterSPD(party.get(i)));  
        }
    }
    
    //metodo para crear una party "random"
    protected static void addPartyRandom(ArrayList <Luchador> party, ArrayList <Luchador> list){
        
         int randomNum = ThreadLocalRandom.current().nextInt(1, list.size() + 1);
        
         moveToParty( list.get(randomNum - 1 ), party);       
    }
    
    //metodo para mover los Luhadores desde el "LIstado" hacia la "Party"
    protected static void moveToParty (Luchador fighter, ArrayList <Luchador> party) {

        Luchador copia = fighter;
        
        party.add(copia); 
    }
    
    //variante del método "checkName" que asegura que no se repitan miembros en la Party
    private static boolean checkNameParty(ArrayList <Luchador> party){
         
        boolean a = false;

        int i = party.size() - 2;
        
        int j = party.size() - 1;
        
        while ( i >= 0){
                        
            if(party.get(i).getName() .equals ( party.get(j).getName() )){
                
                a = true;
            }
            i--;
        }  
        return a;
    }

    //metodo que revisa si un Luchador esta vivo en la party
    public static boolean checkHP(Combatiente fighter){
        
        boolean alive = true;
        
        if (fighter.getHP() < 1){
        
            alive = false;
        }
        return alive;
    }
     
    //metodo que revisa si un Luchador ha sobrevivido al combate
    public static void returnToList(ArrayList <Luchador> party,ArrayList <Luchador> list, ArrayList <String> checker){        
        
        for (int i = 0; i < party.size(); i++){
            
            if(checkHP(party.get(i)) == false ){
                
               deadFighter(party.get(i).getName(), list, checker);} 
        }  
        
        party.clear();
    }
    
    //metodo que elimina de la lsita a los Luchadores muertos en combate
    private static void deadFighter(String name, ArrayList <Luchador> list, ArrayList <String> checker){
        
        for(int i =0; i < list.size(); i++){
        
            if(name .equals (list.get(i).getName()) ){
        
                ListaLuchadores.eliminarLuchador(list, i, checker);
            }
        }    
    }
}