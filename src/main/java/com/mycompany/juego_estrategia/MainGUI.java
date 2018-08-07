/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.juego_estrategia;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author marclo
 */
public class MainGUI extends javax.swing.JFrame {

    public MainGUI(ArrayList <String> checker, ArrayList <Luchador> list, ArrayList <ObjetoEquipable> inventory, ArrayList <Luchador> party) {
        
        JFrame mainFrame = new JFrame();  
        
        JPanel jPanel1 = (JPanel) mainFrame.getContentPane();

        jPanel1.setLayout(null);
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Main GUI");
        setSize(700,700);
       
        //JLabel textLabel1 = new JLabel("I'm a label in the window",SwingConstants.CENTER);
        //setPreferredSize(new Dimension (300,100));
        //getContentPane().add(textLabel, BorderLayout.CENTER);
        
        //JPanel jPanel1 = new javax.swing.JPanel();
        JButton bCheckFighters = new javax.swing.JButton("<html> Check <br /> Fighters  </html>");
        jPanel1.add(bCheckFighters);
        Dimension CheckFighters = bCheckFighters.getPreferredSize();
        bCheckFighters.setBounds(10, 10, CheckFighters.width, CheckFighters.height);
        
        JButton bCheckInventory = new javax.swing.JButton("<html> Check<br /> Inventory </html>");
        jPanel1.add(bCheckInventory);
        Dimension CheckInventory = bCheckInventory.getPreferredSize();
        bCheckInventory.setBounds(120, 10, CheckInventory.width, CheckInventory.height);
        
        JButton bCreateFighter = new javax.swing.JButton("<html> Create <br /> Fighter </html>");
        jPanel1.add(bCreateFighter);
        Dimension CreateFighter = bCreateFighter.getPreferredSize();
        bCreateFighter.setBounds(230, 10, CreateFighter.width, CreateFighter.height);
        
        JButton bDismissFighter = new javax.swing.JButton("<html> Dismiss a <br /> Fighter </html>");
        jPanel1.add(bDismissFighter);
        Dimension DismissFighter = bDismissFighter.getPreferredSize();
        bDismissFighter.setBounds(340, 10, DismissFighter.width, DismissFighter.height);
        
        JButton bFight = new javax.swing.JButton("FIGHT!!!!!!!");
        jPanel1.add(bFight);
        Dimension Fight = bFight.getPreferredSize();
        bFight.setBounds(450, 10, Fight.width, Fight.height);
        
        JButton bLeave = new javax.swing.JButton("Wuss out");
        jPanel1.add(bLeave);
        Dimension Leave = bLeave.getPreferredSize();
        bLeave.setBounds(560, 10, Leave.width, Leave.height);
  
        
        
        JTextField tNumero01 = new javax.swing.JTextField("");
        JTextField tNumero02 = new javax.swing.JTextField("");
        //jPanel3 = new javax.swing.JPanel();
        //jLabel3 = new javax.swing.JLabel();
        //JTextField tResultado = new javax.swing.JTextField("Resultado");
        //jPanel4 = new javax.swing.JPanel();


        
        
        jPanel1.add(tNumero01);
        jPanel1.add(tNumero02);
  
        this.getContentPane().add(jPanel1);
        
        setVisible(true);
        
        
        bCheckFighters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    checkFighters(checker, list,inventory);
                } catch (Exception ex) {
                    Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        bCheckInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkinventory( checker,inventory);
            }
        });
         
        bCreateFighter.addActionListener(new java.awt.event.ActionListener()  {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    createFighter(list, inventory);
                } catch (Exception ex) {
                    Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
          
        bDismissFighter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dismissFighter( list, inventory, checker);
            }
        });
        
        bFight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fight(inventory, list, party, checker);
            }
        });
        
        bLeave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.exit(0);
            }
        });

    }
  
    protected void checkFighters(ArrayList <String> checker, ArrayList <Luchador> list, ArrayList <ObjetoEquipable> inventory) throws Exception{                                         
        // TODO add your handling code here:
        ListaLuchadores.mostrarListaAsk( list,inventory,checker);
        ListaLuchadores.checkData(list);
    }
    
    protected void checkinventory(ArrayList <String> checker, ArrayList <ObjetoEquipable> inventory) {                                         
        // TODO add your handling code here:
        Inventario.verInventarioAsk(inventory,checker);
    }
    
    protected void createFighter( ArrayList <Luchador> list,  ArrayList <ObjetoEquipable> inventory) throws Exception {                                         
        // TODO add your handling code here:
        ListaLuchadores.crearLuchador (list, inventory);
    }
    
    protected void dismissFighter( ArrayList <Luchador> list,ArrayList <ObjetoEquipable> inventory,ArrayList <String> checker) {                                         
        // TODO add your handling code here:
        ListaLuchadores.eliminarLuchadorAsk(list, inventory, checker);
        if (list.size()<1){
            System.exit(0);
            }
    }
    
    protected void fight( ArrayList <ObjetoEquipable> inventory, ArrayList <Luchador> list, ArrayList <Luchador> party, ArrayList <String> checker) {                                         
        // TODO add your handling code here:                    
        Fight.huntAsk(inventory, list, party,checker);
        
        if (list.size()<1){
            
            System.exit(0);
        }
    }
}
