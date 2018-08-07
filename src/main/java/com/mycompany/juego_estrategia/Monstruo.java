/*
 * To change this license header, choose License Headers in Project PropertieEquipable.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.juego_estrategia;


import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author marclo
 */
public class Monstruo extends Combatiente{

        protected ObjetoEquipable itemDrop2;
        
        protected ObjetoEquipable itemDrop3;
        
        Monstruo(){
            
            this.name = darNameMonstruo();

            this.hp = darHpMonstruo();
            
            this.atk = darAtkMonstruo();

            this.item = createItemDrop1();
            
            this.itemDrop2 = createItemDrop2();
            
            this.itemDrop3 = createItemDrop3();
        }

        public double setHPM( double n){
            return hp = n;} 

        public ObjetoEquipable setItemDrop1(){
            
            ObjetoEquipable itemDrop = createItemDrop1();
            
            return item = itemDrop;} 
        
        public ObjetoEquipable setItemDrop2(){
             
            ObjetoEquipable item2 = createItemDrop2();
            
            return itemDrop2 = item2;} 

        public ObjetoEquipable setItemDrop3(){
            
            ObjetoEquipable item3 = createItemDrop3();
            
            return itemDrop3 = item3;} 
        
        public ObjetoEquipable getItemDrop1(){
          
            return item;} 
        
        public ObjetoEquipable getItemDrop2(){
 
            return itemDrop2;} 

        public ObjetoEquipable getItemDrop3(){
            
            return itemDrop3;}    
    
     
    //método para darle un nombre a un mosntruo
    private static String darNameMonstruo(){
    
        //este método selciona uno de los nombres disponibles de manera aleatoria y  se lo asigna al nuevo Luchador 
        
        String nameList[] ={"Asmodeus", "Chimera", "Cthulhu", "Ymir", "Medusa", "Lilith", "Goblin King", "Manticore", "Dracula", "Orochi", "Bill Cipher"};
        
        int randomNum = ThreadLocalRandom.current().nextInt(0, (nameList.length));

        String name = nameList[randomNum];
        
        return name;
        }
    
   
    //método para asignarle la HP a un Monstruo de manera aleatoria
    private static int darHpMonstruo(){
    
        int randomNum = ThreadLocalRandom.current().nextInt(3500, 4000 + 1);
           
        int HP = randomNum;
           
    return HP;
    }
    
    //método para asignar el ATK de un Monstruo de manera aleatoria
    private static int darAtkMonstruo(){
    
           int randomNum = ThreadLocalRandom.current().nextInt(1000, 1500 + 1);
                
           int ATK = randomNum;
           
    return ATK;
    }
     
    //este método muestra todas las estadíticas de un Monstruo
    public static void mostrarMonstruo(Monstruo monster, ArrayList <ObjetoEquipable> inventory, ArrayList <Luchador> list, ArrayList <Luchador> party, ArrayList <String> checker){
    
        new MonsterWindow(monster, inventory,list, party, checker);
    }
    
    //métodos que crean los objetos que "Dropea" un monstruo
    private static ObjetoEquipable createItemDrop1(){
    
        ObjetoEquipable Item = new ObjetoEquipable();
        
        Item.setNameO(ObjetoEquipable.darItemName());
        
        Item.setRankO(1);
        
        Item.setStat(ObjetoEquipable.darItemStat(Item.getNameO()));
        
        Item.setValueO(ObjetoEquipable.darItemValue());
     
        return Item;      
    }
    
    private static ObjetoEquipable createItemDrop2(){
    
        ObjetoEquipable Item = new ObjetoEquipable();
        
        Item.setNameO(ObjetoEquipable.darItemName());
        
        Item.setRankO(3);
        
        Item.setStat(ObjetoEquipable.darItemStat(Item.getNameO()));
        
        Item.setValueO(ObjetoEquipable.darItemValue()*3);
     
        return Item;      
    }
     
    private static ObjetoEquipable createItemDrop3(){
    
        ObjetoEquipable Item = new ObjetoEquipable();
        
        Item.setNameO(ObjetoEquipable.darItemName());
        
        Item.setRankO(5);
        
        Item.setStat(ObjetoEquipable.darItemStat(Item.getNameO()));
        
        Item.setValueO(ObjetoEquipable.darItemValue()*5);
     
        return Item;      
    }
}