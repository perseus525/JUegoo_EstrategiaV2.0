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
public class Luchador extends Combatiente{
   
        private int rank;
       
        //constructor de la clase Combatiente
        Luchador(){
            
            this.name = darNameLuchador();
            
            this.rank = darRankLuchador();

            this.hp = darHpLuchador() * rank;
            
            this.atk = darAtkLuchador() * rank;
        
            this.def = def * rank;
        
            this.spd = spd * rank;
        }
        
        public int getRank(){
            return this.rank;} 
    
    //método para asignarle un nombre a un Combatiente
    public static String darNameLuchador(){

        //este método selciona uno de los nombres disponibles de manera aleatoria y  se lo asigna al nuevo Combatiente 
        
        String nameList[] ={"Jack", "Jill", "Peter", "Ayla", "Kirtash","Lucy", "Mordecai", "Leliana", "David", "Lethaline", "Arthur", "Leticia",
                            "Marcus", "Morgana", "Frederick", "Krysta", "Kaiser", "Echo", "Zack", "Susan", "Hector", "Chain", "Soul", "Memphis", 
                            "Leroy", "Hana", "Kentaro", "Misaki", "Wilfred", "Kohakuren", "Greil", "Astrid", "Tormod", "Daphne"};
        
        int randomNum = ThreadLocalRandom.current().nextInt(0, (nameList.length));

        String nombre = nameList[randomNum];

        return nombre;
    }
    
    //método para asignar la HP de un Combatiente de manera aleatoria
    private static int darHpLuchador(){        
           
           int randomNum = ThreadLocalRandom.current().nextInt(200, 500 + 1);
           
           int HP = randomNum;
           
    return HP;
    }
    
    //método para asignar el ATK de un Combatiente de manera aleatoria
    private static int darAtkLuchador(){
    
           int randomNum = ThreadLocalRandom.current().nextInt(20, 70 + 1);
                
           int ATK = randomNum;
           
    return ATK;
    }
  
    //método para asignar las estrellas de un Combatiente basado un sistema de probabilidad
    private static int darRankLuchador(){
         
        //aqui se inicializa el "RANK" en "1", si el numero aleatorio no cumple con alguno de los "ifs", se mantiene en "1"
        
           int [] rankList = {40, 70, 85, 95};
           
           int randomNum = ThreadLocalRandom.current().nextInt(1, 100 + 1);
           
           int rank = 1;
           
           for(int i =0; i < rankList.length; i++){
           
               if (randomNum > rankList [i]){
               
                   rank = rank + 1;
               
               }
           }  
           
    return rank;
    }
    
    //este método muestra todas las estadíticas de un Combatiente
    public static void mostrarLuchadorCompleto(Luchador fighter, int numero,  ArrayList <ObjetoEquipable> inventory) {

        new FullFighterWindow(fighter, numero, inventory);
   }
    
    //los siguientes calcula los valores de los atributos de los Luchadores después de aplicados los efectos de los ObjetosEquipables
    public static double confirmFighterHP(Luchador fighter){
            
        double fhp = 0;
        
        if (fighter.item.getNameO().equals("Armor")) {

            //case "Boots": spd = (fighter.spd + fighter.item.getValueO() * fighter.item.getRankO());
                //break;
                
            fhp = (fighter.hp + fighter.item.getValueO() * fighter.item.getRankO());   
        }
        else{
        
            fhp = fighter.hp;
        }
        
        return fhp;
    }
    
    public static int confirmFighterATK(Luchador fighter){
            
        int fatk = 0;
        
        if (fighter.item.getNameO().equals("Sword")) {

            //case "Boots": spd = (fighter.spd + fighter.item.getValueO() * fighter.item.getRankO());
                //break;
                
            fatk = (fighter.atk + fighter.item.getValueO() * fighter.item.getRankO());   
        }
        else{
        
            fatk = fighter.atk;
        }
        
        return fatk;
    }
     
    public static int confirmFighterDEF(Luchador fighter){
            
        int fdef = 0;
        
        if (fighter.item.getNameO().equals("Shield")) {

            //case "Boots": spd = (fighter.spd + fighter.item.getValueO() * fighter.item.getRankO());
                //break;
                
            fdef = (fighter.def + fighter.item.getValueO() * fighter.item.getRankO());   
        }
        else{
        
            fdef = fighter.def;
        }
        
        return fdef;
    }
    
    public static int confirmFighterSPD(Luchador fighter){
            
        int fspd = 0;
        
        if (fighter.item.getNameO().equals("Boots")) {

            //case "Boots": spd = (fighter.spd + fighter.item.getValueO() * fighter.item.getRankO());
                //break;
                
            fspd = (fighter.spd + fighter.item.getValueO() * fighter.item.getRankO());   
        }
        else{
        
            fspd = fighter.spd;
        }
        
        return fspd;
    }

    //metodo para mostrar al Combatiente "simplificado"
    public static void mostrarLuchadorSimple(Luchador fighter, int numero, ArrayList <ObjetoEquipable> inventory) {
          
            new SimpleFighterWindow(fighter, numero, inventory);
   }
       
   //método para preguntarle al usuario si desea equipar un objeto a un Combatiente, de no tener objetos, se le informa al Usuario
    public static void equipItemsAsk(ArrayList <Luchador> list, ArrayList <ObjetoEquipable> inventory, ArrayList <String> checker){
       
        System.out.println("");

        if( inventory.size() > 0){
        
        System.out.println("Do you wish to equip items? (WARNING: This action CANNOT be undone.)(Input number)");

        System.out.println("1) Yes.");
  
        System.out.println("2) No.");
        
        System.out.println("3) I'd rather destroy one.");
        
        System.out.println("");
        
        int numero;
     
        Scanner scan = new Scanner(System.in);
     
        numero = scan.nextInt();
        
        respuestaEquipItemsAsk(numero, list, inventory, checker);
    }
         else{
                System.out.println("You have no items. How about you go out there and KILL something?");
         }
      }
    
    //metodo que interpreta la respuesta del usuario e invoca al metodo necesario para cumplirla
    private static void respuestaEquipItemsAsk(int numero, ArrayList <Luchador> list, ArrayList <ObjetoEquipable> inventory, ArrayList <String> checker){
    
         switch(numero){
    
        case 1: System.out.println("");
                 
                equipItemsChoose(list, inventory);
            break;
    
        case 2: System.out.println("OK, let's just leave them there, gathering dust.");

                System.out.println("");
            break;
    
        case 3: System.out.println("Are you sure about that?");    

                System.out.println("");
                
                System.out.println("1) Yes");

                System.out.println("2) No");
                
                int itemAsk;
     
                Scanner scan = new Scanner(System.in);
                
                itemAsk = scan.nextInt();
                
                switch(itemAsk){
    
                    case 1: System.out.println("");
                            
                        Inventario.deleteItemAsk(inventory);

                        System.out.println("");
                        break;
                        
                    case 2: System.out.println("");
                    
                        System.out.println("That's what I thought.");
                        
                        System.out.println("");
                        break;
                        
                    default:
                        System.out.println("Command not recognized.");
                        
                        Menu.checkError(checker);
                        break;
                }
            break;

        default:System.out.println("Command not recognized.");
        
        Menu.checkError(checker);
        break;
        }
    }
      
    //metodo quele pregunta al Usuario "que?" objeto desea equipar a "cual?" Combatiente y luego invoca a los metodos necesarios para equipar y borrar el objeto del inverntario
    private static void equipItemsChoose(ArrayList <Luchador> list, ArrayList <ObjetoEquipable> inventory){
    
        System.out.print("Which Fighter do you wish to equip with an Item?(Input number)");
        
        System.out.println("");
        
        ListaLuchadores.mostrarListaLuchadorSimple(list, inventory);
        
        int fighterNum;
        
        Scanner scan1 = new Scanner(System.in);
                
        fighterNum = scan1.nextInt(); 
        
        System.out.println("Which Item do you wish to equip?");
        
        System.out.println("");
        
        Inventario.verInventarioCompleto(inventory);
        
        int itemNum;
        
        Scanner scan2 = new Scanner(System.in);
        
        itemNum = scan2.nextInt();
        
        //equipFighterWithItem(list.get(fighterNum - 1), inventory);
        
        Inventario.deleteItemAsk(inventory);
    }
    
    //metodo para equipar al Combatiente con el objeto seleccionado
    protected static void equipFighterWithItem(Combatiente fighter,  ObjetoEquipable objetoEquipar){
    
        fighter.item = objetoEquipar;   
    }
}