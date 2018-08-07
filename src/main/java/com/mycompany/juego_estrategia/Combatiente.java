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
abstract class Combatiente {
    
        protected  String name;
        
        protected  String type;
        
        protected  double hp;
        
        protected  int atk;
        
        protected  int def;
        
        protected  int spd;
        
        protected ObjetoEquipable item;
        
         Combatiente(){
            
            this.name = "name";
            
            this.hp = 0;
            
            this.atk = 0;
        
            this.def = darDEF();
        
            this.spd = darSPD();
        
            this.type = darType();
            
            this.item = ObjetoEquipable.createItemZero();
         }
         
    public String getName(){
            return this.name;} 
    
    public String setName(String newName){
       this.name = newName;
            return this.name;} 
    
    public String getType(){
            return type;} 
    
    public int getATK(){
            return atk;} 
    
    public double setATK(int n){
            return atk = n;}
    
    public int getDEF(){
            return def;} 
    
    public double setDEF(int n){
            return def = n;}
    
    public double getHP(){
            return hp;} 
    
    public double setHP(double n){
            return hp = n;} 
    
     public int getSPD(){
            return spd;} 
     
    public double setSPD(int n){
            return spd = n;} 
    
    //método para asignar la DEF de un Combatiente de manera aleatoria
     private static int darDEF(){
    
          int randomNum = ThreadLocalRandom.current().nextInt(5, 25 + 1);
                
          int DEF = randomNum;
           
    return DEF;
    }
     
    //método para asignar la SPD de un Combatiente o Monstruo de manera aleatoria
    private static int darSPD(){
    
           int randomNum = ThreadLocalRandom.current().nextInt(10, 100 + 1);
                
           int SPD = randomNum;
           
    return SPD;
    }
    
    //método para asignar una Facción/Tipo/Elemento a un Combatiente de manera aleatoria
    private static String darType(){
       
       String[] typeList = { "Fire", "Water", "Grass"};
       
       int randomNum = ThreadLocalRandom.current().nextInt(0, typeList.length);
        
        String type = typeList[randomNum];

    return type;
    }   
}      