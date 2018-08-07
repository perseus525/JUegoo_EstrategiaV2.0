/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.juego_estrategia;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author marclo
 */
public class Fight {
    
    //metodo que lanza el dado 1
    private static int crearDado1 (){
    
        int dado1 = ThreadLocalRandom.current().nextInt(1, 8 + 1);
        
         return dado1;       
    }
    
    //metodo que lanza el dado 2
    private static int crearDado2 (){
    
        int dado2 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
        
         return dado2;       
    }
    
    //metodo que establece la condicion de los dados
    public static int condicionDado(){
         
        int dado1 = crearDado1();
        
        int dado2 = crearDado2();
        
        int condicion = dado1 - dado2;

        return condicion;
    }
 
    //método para pelear contra un monstruo (actualmente en desarrollo)
    public static void huntAsk(ArrayList <ObjetoEquipable> inventory, ArrayList <Luchador> list, ArrayList <Luchador> party, ArrayList <String> checker){
        
       Monstruo monster = new Monstruo();
        
       Monstruo.mostrarMonstruo(monster, inventory,list, party, checker);
       
       //new FightAskWindow(monster, inventory, list, party, checker);
    }
    
    public static void hunt(Monstruo monster, ArrayList <ObjetoEquipable> inventory, ArrayList <Luchador> list, ArrayList <Luchador> party, ArrayList <String> checker){

        //Party.makePartyAsk(party, list, checker);

        int dmgModifier = condicionDado();
     
        ArrayList <Combatiente> fightList = creatFightList(party ,monster);
        
        sortFightList(fightList);
                    
        int monsterID = findMonster(fightList);

        while (fightList.get(monsterID).getHP() >= 1){

            boolean continu = turn ( fightList, dmgModifier, monsterID);

            if (fightList.get(monsterID).getHP() < 1){ 
                
                droppedItems(monster, inventory);
            
                System.out.println("You won. Congratulations on a succesful hunt.");
            }
 
            if ( continu == false){ 
                            
                monster.setHP(0);
                        
                System.out.println("You LOST?!?!?!?!?!?!?!"); 
                        
                System.out.println("");
            
                System.out.println("You're either pathetic or a cheater. Get out of here");
            
                System.out.println("");
            }   
        }
        Party.returnToList(party,list, checker);   
    }
    
    //metodo que "crea" la "FightList"
     private static ArrayList <Combatiente> creatFightList(ArrayList <Luchador> party, Combatiente monster){
    
        ArrayList <Combatiente> fightList = new ArrayList <Combatiente>();
    
        for (int i = 0; i < party.size(); i++){
        
            fightList.add(party.get(i));
        }
        
        fightList.add(monster);
    
        return fightList;
    }
    
    //metodo para ordenar la lista de comabatientes
    private static void sortFightList(ArrayList <Combatiente> fightList){
        
        fightList.sort(Comparator.comparingInt(Combatiente::getSPD));
    }
    
    //metodo para encontrar al Monstruo en la lista de combatiente
    private static int findMonster(ArrayList <Combatiente> fightList){
    
        int monsterID=0;
        
        for (int i =0; i < fightList.size(); i++){
        
            if (fightList.get(i) instanceof Monstruo) {
                
                monsterID=i;
            }    
        }
        return monsterID;
    }
    
    //metodo que dicta un turno del combate
    public static boolean turn(ArrayList <Combatiente> fightList,  int dmgModifier, int monsterID){

        for (int i =0; i < fightList.size(); i++){
        
            System.out.println(fightList.get(i).getHP());
        }
        
        System.out.println("new turn");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
        
        boolean continu = true;
 
        if(fightList.get(monsterID).getHP() >= 1){
            
            for (int i = 0; i < fightList.size(); i++){
                
                if (fightList.get(i) instanceof Luchador){
                    
                    if(Party.checkHP(fightList.get(i))){
                        
                        fighterAttacks(fightList.get(i), fightList.get(monsterID), dmgModifier);
                    }
                }
                
                if (fightList.get(i) instanceof Monstruo){
                    
                    if(Party.checkHP(fightList.get(i))){

                        monsterAttacks(fightList, fightList.get(monsterID), dmgModifier, monsterID);
                    }
                }   
                
                if (fightList.get(fightList.size()-1) instanceof Luchador){

                        continu = Party.checkHP(fightList.get(fightList.size()-1));
                }
                else{
                
                    if(fightList.get(fightList.size()-2).getHP() < 1){
                    
                        continu = Party.checkHP(fightList.get(fightList.size()-2));
                    }
                }
            }
        }     
        return continu;
    }

    //metodo para que el Mosntruo ataque a la Party
    public static void monsterAttacks(ArrayList <Combatiente> fightList, Combatiente monster, int dmgBoost, int monsterID){

        double daño = 0;

        int target=0;
        
        if (target==monsterID){
                
                target = target + 1;
        }
   
        while (fightList.get(target).getHP() < 1){
        
            target=target+1; 
            //might be redundant
            if (target==monsterID){
                
                target = target + 1;
                            //might be redundant
                while (fightList.get(target).getHP() < 1){
                    target=target+1;
                }
            }
        }
        
       
        
        double typeBoost = checkFaction(monster. getType(), fightList. get(target). getType());
         
        if (dmgBoost >= 0){
            
        daño = ( ( monster.getATK() )* typeBoost -  fightList. get(target). getDEF() );
        }
        
         if (dmgBoost < 0){
            
        daño = ( ( monster.getATK() )* typeBoost -  fightList. get(target). getDEF() )*(-dmgBoost);
        }
         
         if (daño < 0){
         
         daño = 0;
         }

        double newHP = fightList. get(target). getHP() - daño;
        
        fightList. get(target). setHP(newHP);       
    }
    
    //metodo para que Luchador ataque al Mosntruo
    public static void fighterAttacks(Combatiente fighter, Combatiente monster,double dmgBoost){
    
        double daño = 0;
        
        double typeBoost = checkFaction(fighter.getType(), monster.getType());
        
        if(dmgBoost > 0 ) {
            daño = ((fighter.getATK()*typeBoost) - monster.getDEF())*dmgBoost;
        }
        
        if(dmgBoost <= 0) {
            daño = ((fighter.getATK()*typeBoost) - monster.getDEF());
        }
        
        if (daño < 0){
         
         daño = 0;
         
         }
        double newHP = monster.getHP() - daño;
 
        
        monster.setHP(newHP);
    }
    
    //metodo que revisa las facciones del atacante y del defenseor
    public static double checkFaction(String type1, String type2){
    
        double typeBoost = 1;
        
        switch(type1){
        
            case "Fire": 
                
                switch(type2){                    
                    
                    case "Water": typeBoost = 0.75;
                    break;
               
                    case "Grass": typeBoost = 1.5;
                    break;}
            break;
               
            case "Water": 
                switch(type2){                    
                    
                    case "Grass": typeBoost = 0.75;
                    break;
               
                    case "Fire": typeBoost = 1.5;
                    break;
                }
            break;
               
            case "Grass": 
                switch(type2){                    
                    
                    case "Fire": typeBoost = 0.75;
                    break;
               
                    case "Water": typeBoost = 1.5;
                    break;
                }
            break;
        }
        
        return typeBoost;
    }
    
    //metodo para obtener los objetos que tenía el monstruo antes de morir
    public static void droppedItems(Monstruo monster, ArrayList <ObjetoEquipable> inventory){
    //creación de los nuevos objetos
        ObjetoEquipable item1 = monster.getItemDrop1();
        ObjetoEquipable item2 = monster.getItemDrop2();
        ObjetoEquipable item3 = monster.getItemDrop3();
         
        ///aqui se revisa el tamaño del inventario, y se agregan los nuevos, de haber menos de 10 items
        if (inventory.size() < 10){   
            chanceDrop1(inventory,item1);}
         
        if (inventory.size() < 10){
            chanceDrop2(inventory,item2);}
         
        if (inventory.size() < 10){
            chanceDrop3(inventory,item3);}
    }
    
    //metodos para determinar si el mosntruo da o no los items al morir
    private static void chanceDrop1(ArrayList <ObjetoEquipable> inventory, ObjetoEquipable item){
        
    int randomNum = ThreadLocalRandom.current().nextInt(1, 100 + 1);
          
        if(randomNum <= 60){
        inventory.add(item);}  
    }
    
    private static void chanceDrop2(ArrayList <ObjetoEquipable> inventory, ObjetoEquipable item){
        
    int randomNum = ThreadLocalRandom.current().nextInt(1, 100 + 1);
          
         if(randomNum <= 30){
        inventory.add(item);}  
    }
     
    private static void chanceDrop3(ArrayList <ObjetoEquipable> inventory, ObjetoEquipable item){
        
    int randomNum = ThreadLocalRandom.current().nextInt(1, 100 + 1);
          
         if(randomNum <= 10){
        inventory.add(item);}  
    }   
}
