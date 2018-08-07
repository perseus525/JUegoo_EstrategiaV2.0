/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.juego_estrategia;
import java.util.concurrent.ThreadLocalRandom;


/**
 *
 * @author marclo
 */
public class ObjetoEquipable {

   //inicialización de los atributos de la clase pbjetoEquipable
    private String nameItem;
    
    private  int rankItem;
    
    private int value;
    
    private String stat;
    
    //constructor de la clase "objetoEquiable"
    ObjetoEquipable(){
        
            nameItem = "Empty";
            
            value = 0;
            
            rankItem = 0;
            
            stat = "None";
        }
    
    //getter y setters para esta clase
    public String getNameO(){
            return nameItem;}    
    
    public  int getRankO(){
            return rankItem;} 
    
    public int getValueO(){
            return value;} 
    
    public String getStat(){
            return stat;} 
    
    public String setNameO(String name){

            return  nameItem = name;} 
    
    public int setRankO(int rank){
        
            return  rankItem = rank;} 
    
    public int setValueO(int n){
            
            return value = n;} 
    
    public String setStat(String statName){
            
            return stat = statName;}
    
    
    //método para crear un objetoEquipable "vacio". La idea de este método es ser usado para completar la creación de un Luchador.
    public static ObjetoEquipable createItemZero(){
    
        //aqui se crea el objeto equipable "Empty", el cual no posee estadísticas.
        
        //este metodo es usado sólo durante la creación de un nuevo Luchador
        ObjetoEquipable item0 = new ObjetoEquipable();
    
        item0.nameItem = "Empty";
        
        item0.rankItem = 0;
        
        item0.stat = "None";
        
        item0.value = 0;
        
        return item0;
    }
    
    //método para mostrar un objetoEquipable
    public static void mostrarItem(ObjetoEquipable item){
          
        //este método  muestra el nombre y estadísticas del objeto seleccionado
        String Empty = "Empty";
        
        if(item. nameItem. equals( Empty )){
            
          System.out.println(item.nameItem);
        }
        
        else{
            
           System.out.println("Item Name: " + item.nameItem);
           
           System.out.println("Item Rank: " + item.rankItem);
           
           System.out.println("Improved Stat: " + item.stat);
           
           System.out.println("Stat improvement: +" + item.value * item.rankItem);
           
           System.out.println("");
        }  
      }
    
    //método para crear objetos originalmente usada cuando moría un monstruo, actualmente no tiene uso
    public static ObjetoEquipable createItem(){
        
        ObjetoEquipable Item = new ObjetoEquipable();
        
        Item.nameItem = darItemName();
        
        Item.rankItem = darItemRank();
        
        Item.stat = darItemStat(Item.nameItem);
        
        int itemValue = darItemValue() * Item.rankItem;
        
        Item.value = itemValue;
        
        return Item;
    }
    
    //metodo que le asigna un nombre al objeto de manera aleatoiria
    public static String darItemName(){
    
        String itemName = new String();
    
        int randomNum = ThreadLocalRandom.current().nextInt(1, 4 + 1);
           
        int chooseItemName = randomNum;
        
        switch(chooseItemName){
        
            case 1: itemName = "Armor";
            break;
            
            case 2: itemName = "Sword";
            break;
            
            case 3: itemName = "Shield";
            break;
            
            case 4: itemName = "Boots";
            break;
        }
        
        return itemName;
    }
    
    //metodo que le asigna un "RANK" al objetoEquipable, basado un sistema de probalidades, dado el último pache, ya  no tiene uso
    private static int darItemRank(){
    
       int itemRank = 1;
       
       int [] rankList = {20, 40, 60, 75, 85, 90, 94, 97, 99};
           
       int randomNum = ThreadLocalRandom.current().nextInt(1, 100 + 1);
           
       for(int i =0; i < rankList.length; i++){
           
            if (randomNum > rankList [i]){
               
                itemRank = itemRank + 1;
            }
        }  

       return itemRank;
    }
    
    //metodo que le asigna una estadística al objetoEquipable basado en su nombre
    public static String darItemStat(String itemName){
        
        String itemStat = "None";
        
        switch (itemName) {
            
            case "Armor": itemStat = "HP";
                break;
                
            case "Sword": itemStat = "ATK";
                break;
                
            case "Shield": itemStat = "DEF";
                break;
                
            case "Boots": itemStat = "SPD";
                break;
                
            default:
                break;
        }
    
    return itemStat;
    }
    
    //metodo que le da un "valor" de manera aleatoria a un objetoEquipable("valor" es cuanto afecta a la estadistica correspondiente)
    public static int darItemValue(){
    
        int itemValue = ThreadLocalRandom.current().nextInt(1, 9 + 1);    
    
    return itemValue;
    }
}