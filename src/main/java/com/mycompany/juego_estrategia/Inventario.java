/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.juego_estrategia;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author marclo
 */
public class Inventario {
    
    //método que le pregunta al usario si desea o no filtrar sus "Items" por "Rank"
    public static void verInventarioAsk( ArrayList < ObjetoEquipable > inventory, ArrayList <String> checker){
    
         if(inventory.size() > 0){
             
            new  ShowInventoryAsk ( inventory );
         }
         else {
            
            JFrame frame = new JFrame();  
        
            JPanel jPanel1 = (JPanel) frame.getContentPane();
    
            jPanel1.setLayout(null);
        
            JLabel label = new JLabel("You have no Items.");
            jPanel1.add(label);
            Dimension labelSize = label.getPreferredSize();
            label.setBounds(75, 25, labelSize.width, labelSize.height);
            //Label.setBounds(x, y, size.width, size.height);
        
            frame.setSize(300, 100);
            frame.setVisible(true);
            frame.setTitle("Message");
         }
    }
    
    //método que lee la repsuesta del usuario e invoca al método necesario para mostrar el invetario con o sin filtros
    private static void respuestaVerInventario( ArrayList < ObjetoEquipable > inventory, ArrayList <String> checker){ 
        
        int numero;
                    
        Scanner scan = new Scanner(System.in);
     
        numero = scan.nextInt();
        
        switch (numero) {
            
                case 1: verInventarioCompleto ( inventory );
                break;
                
                case 2: askRankInventario(inventory);
                break;
                
                default: System.out.println("THAT'S NOT HOW THIS WORKS!!!!!");
                
                Menu.checkError(checker);
                break;
        } 
    }
    
    //método que le pregunta al usuaior que "Rank" de "Items" desea ver
    protected static void askRankInventario(ArrayList < ObjetoEquipable > inventory){

        System.out.println("");
        
        System.out.println("Which Item Rank would you like to see?(input number)");
        
        int rank;
                    
        Scanner scan = new Scanner(System.in);
     
        rank = scan.nextInt();

        mostrarRankInventario(inventory, rank);
    }
    
    //método para mostarr todos los objetos de un "Rank" específico en el inventario
    private static void mostrarRankInventario( ArrayList <ObjetoEquipable> inventory, int rank){

        System.out.println("");
        
        System.out.println("Inventory start.");
        
        System.out.println("");
        
        //contador para mostrar la lista de objetosEquipables con "Rank" = rank
        int j=1;
        
        for(int i = 0; i< inventory.size(); i++){
                
            if(inventory.get(i).getRankO() == rank){
                    
            System.out.print(j + ") ");
                   
            j++;
                
            ObjetoEquipable.mostrarItem(inventory.get(i));
            }
        }
            
        if (j == 1){
        
            System.out.println("");
            
            System.out.println("You have no Rank " + rank + " Items.");

            System.out.println("What are you waiting for?? GO KILL MONSTERS!!!!!!");
            
            System.out.println("");
        }
        
        System.out.println("");
        
        System.out.println("Inventory end"); 

        System.out.println("");         
    }
    
    //método para mostrar todo el inventario
    public static void verInventarioCompleto(ArrayList <ObjetoEquipable> inventory){
        
        //este método muestra todos los objetos que el usuario posee en su inventario      

        System.out.println();
        
        System.out.println("Inventory start.");
        
        System.out.println();
        
        for(int i = 0; i< inventory.size(); i++){
            
            System.out.print(i+1 + ")");
                   
            ObjetoEquipable.mostrarItem(inventory.get(i));
        }
            
        System.out.println("");
        
        System.out.println("Inventory end"); 

        System.out.println("");       
     }  
    
    //metodo que pregunta si sobre eliminar objetos
    public static void deleteItemAsk(ArrayList <ObjetoEquipable> inventory){
        
        System.out.println("Which Item do you wish to destroy? (input number)");
        
        int itemNum;     
        
        Scanner scan = new Scanner(System.in);
     
        itemNum = scan.nextInt();
        
        if (itemNum < inventory.size()){
        
        deleteItemFromInventory(inventory, itemNum-1);    
        }
        else{
            
            System.out.println("That's not an option.");
            
        }
    }
    
    //metodo para borrar el obejto equipado de la lista del inventario
    private static void deleteItemFromInventory(ArrayList <ObjetoEquipable> inventory, int itemNum){
    
        inventory.remove(itemNum);
    }    
}
