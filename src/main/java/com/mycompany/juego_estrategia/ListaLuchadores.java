/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.juego_estrategia;

import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author marclo
 */
public class ListaLuchadores {
    
    //método para preguntar con qué filtros se desea ver la lista de Luchadores
    public static void mostrarListaAsk(ArrayList <Luchador> list, ArrayList <ObjetoEquipable> inventory, ArrayList <String> checker){
        
        //este método pregunta al usuario que filtros desea aplicar a la lista de Luchadores y luego invoca a un metodo que interpreta la respuesta del usuario
        
        //de no tener Luchadores, el método despliega un mensaje indicándoselo al usuario y regresa al menu
        
        if (list.isEmpty()){
        
            System.out.println("You have no fighters.");
        }
        
        else{
            
            new ShowWindowAsk(list, inventory, checker);
        }     
    } 
    
    //metodo para mostrar la lista completa de Luchadores con sus estadistica "simples"
    public static void mostrarListaLuchadorSimple(ArrayList <Luchador> list,  ArrayList <ObjetoEquipable> inventory){
        
                for(int i = 0; i< list.size(); i++){
                   
                   Luchador.mostrarLuchadorSimple(list.get(i), i+1, inventory);
                }
    }
 
    //metodo para mostrar a todos los Luchadores con todos sus estadisticas
    public static void mostrarTodoLuchador(ArrayList <Luchador> list,  ArrayList <ObjetoEquipable> inventory){

                for(int i = 0; i< list.size(); i++){
                    
                   Luchador.mostrarLuchadorCompleto(list.get(i),i+1, inventory);
                } 
    }
    
    //metodo para ver las estadísiticas de un Luchador especifico
    public static void mostrarUnLuchador(ArrayList <Luchador> list, ArrayList <String> checker,  ArrayList <ObjetoEquipable> inventory){
    
        //aqui se le muetsra al usuario lso nombres de los Luchadores que tiene y se le pregunta cual desea revisar
        System.out.println("Input the number of the Fighter you wish to evaluate.");
          
        for (int i = 0; i < list.size(); i++){

            System.out.println(i + 1 + ") " + list. get (i).getName());
           
        }
           
        int nameAsk;
     
        Scanner scan = new Scanner(System.in);
     
        nameAsk = scan.nextInt();
        
        Luchador.mostrarLuchadorCompleto(list.get(nameAsk - 1), nameAsk, inventory);
    }
    
    //metodo que le pregunta al usuario que "RANK" de Luchadores desea ver e invoca al metodo necesario para mostrar dlos Luchadores pedidos
    public static void mostrarRankLuchadorAsk(ArrayList <Luchador> list,  ArrayList <ObjetoEquipable> inventory){
       
        new AskRankWindow(list, inventory);
    }
    
    //metodo que mostrar los Luchadors de un "RANK" especifico
    public static void mostrarRankLuchador(ArrayList <Luchador> list, int RankAsk,  ArrayList <ObjetoEquipable> inventory){

        for(int i = 0; i< list.size(); i++){
                   
            if(list.get(i).getRank() == RankAsk ){

                Luchador.mostrarLuchadorCompleto(list.get(i), i+1, inventory);
            }  
        }
    }
    
    //metodo que le pregunta al usuario que Tipo/elemento de Luchadores desea ver e invoca al metodo necesario para mostrarlos
    public static void mostrarTypeLuchadorAsk(ArrayList <Luchador> list,  ArrayList <ObjetoEquipable> inventory){
      
        new AskTypeWindow(list, inventory);
    }
    
    //metodo que muestra a todos los luchadores de un Tipo/elemento especifico
    public static void mostrarTypeLuchador(ArrayList <Luchador> list , int TypeAsk,  ArrayList <ObjetoEquipable> inventory){

        String CheckType = "";
        
        //aqui se revisa cual fue el Tipo/Elemento pedido por el usuario
        switch (TypeAsk){
               
               case 1: CheckType = "Fire";
               break;
               
               case 2: CheckType = "Water";
               break;
               
               case 3: CheckType = "Grass";
               break;
        }
        
        //aqui se muetsra todos los Luchadores del Tipo/Elemetnos pedido
        for(int i = 0; i< list.size(); i++){
                   
            if(list.get(i).getType() .equals( CheckType )){

                Luchador.mostrarLuchadorCompleto(list.get(i), i+1, inventory);
            }  
        }    
    }  
    
    //método para preguntar si se desea eliminar un luchador
    public static void eliminarLuchadorAsk(ArrayList <Luchador> list, ArrayList <ObjetoEquipable> inventory, ArrayList <String> checker){
            
        ListaLuchadores.mostrarListaLuchadorSimple(list, inventory);

        System.out.println("Which coward are you exiling?(Input number)");
        
        int numero;
        
        Scanner scan = new Scanner(System.in);
        
        numero = scan.nextInt();
            
        eliminarLuchador(list, (numero - 1), checker);          
}
        
    //metodo para eliminar al luchador
    public static void eliminarLuchador(ArrayList <Luchador> list, int fighterID, ArrayList <String> checker){
 
        if (fighterID + 1 <= list.size()){
            
            list.remove(fighterID);
        }
        else{ System.out.println("");
            
            System.out.println("You don't have THAT many recruits.");
            
            Menu.checkError(checker);
        }
    }
    
    //método para crear un luchador de manera aleatoria 
    public static void crearLuchador(ArrayList <Luchador> list,  ArrayList <ObjetoEquipable> inventory) throws Exception{
        
        //este método crea un nuevo Luchador y muestra sus estadísticas por pantalla
        
        //aqui se revisa cuantos Luchadores se tiene, de tenerse menos de 25 se crea uno nuevo
        if (list.size() < 25){
  
            list.add(new Luchador());  
            

            if(list.size() > 1){
             
                //invocacion el metodo que revisa los nombres repetidos
                checkName(list, (list.get( (list.size () - 1) ). getName()));

            }
         
          //invocacion al metodo que muestra a un Luchador con todas sus estadisticas

            new NewFighterWindow(list.get(list.size()-1), list.size(), inventory);  
            
            saveData(list);
            
            //checkData(list);
        }
    
        else{
            
        System.out.println("You cannot have any more fighters."); 
        }
     }

    //método para revisar los nombres de los luchadroes y así evitar la repetición de nombres
    public static void checkName(ArrayList <Luchador> list, String Name){
        
        //este método revisa el nombre del último Luchador creado y lo compara con todos los nombres de los Luchadores creados anteriormente
        //si el nombre del Luchador nuevo ya está en uso, invoca al método "darName", asigna un nuevo nombre y luego lo compara con los nombres de
        //los luchadores creados hasta que al nuevo Luchador se le asigne un nombre que no esté en uso
        
        int i = list.size() - 2;
       
        while ( i >= 0){
                       
            if(list.get(i).getName() .equals( Name )){
                    
                    list.get(list.size()-1).setName(Luchador.darNameLuchador());
                    
                    Name = list. get (list.size()-1).getName();
                    
                    i = list.size() - 1;
            }
            i--;
        }       
    }  
    
     public static void saveData(ArrayList <Luchador> list) throws Exception{
    
    
            RandomAccessFile arch = new RandomAccessFile("testing3.txt","rw"); 
		
            // se escribe en el archivo las estadisticas de todos los Luchadores

            for (int i = 0; i < list.size(); i++){
		arch.writeBytes("\n"+ list.get(i).getName());
                
                arch.writeBytes("\n"+ list.get(i).getType());
                
                arch.writeBytes("\n"+ String.valueOf(list.get( i ).getRank ()));
                
                arch.writeBytes("\n"+ String.valueOf(list.get( i ).getHP ()) );
     
                arch.writeBytes( "\n"+ String.valueOf(list.get( i ).getATK ())  );
                
                arch.writeBytes("\n"+ String.valueOf(list.get( i ).getDEF ()) );
  
                arch.writeBytes("\n"+ String.valueOf(list.get( i ).getSPD ()));
                
            }
		//luego cierra el archivo para liberar recursos.
		arch.close();
       
    }
    public static void checkData(ArrayList <Luchador> list) throws Exception{

                RandomAccessFile arch = new RandomAccessFile("testing3.txt","r"); 
                //para leer el archivo
		int cont =0;
		String Leer;
		// mientras no llegue a fin de archivo
		// la cadena Leer alamcena el contenido 
		// de una línea del archivo
		while((Leer=arch.readLine())!=null)	{
		 cont++;	
		 System.out.println("Linea "+cont+" : " +Leer);
		}
		
		//luego cierra el archivo para liberar recursos.
		arch.close();              
    }
}