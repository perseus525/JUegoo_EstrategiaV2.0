/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.juego_estrategia;

import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

/**
 *
 * @author marce
 */
public class InventoryWindow extends javax.swing.JFrame{
    
    JFrame frame = new JFrame();  
        
    JPanel jPanel1 = (JPanel) frame.getContentPane();
    
     public InventoryWindow(ArrayList <ObjetoEquipable> inventory, Luchador fighter){
     
     
            jPanel1.setLayout(null);

     
            JLabel item = new JLabel("Item name: " + inventory.get(0).getNameO() );
            jPanel1.add(item);
            Dimension itemSize = item.getPreferredSize();
            item.setBounds(0, 0, itemSize.width, itemSize.height);
            
           
            JLabel rank = new JLabel( "Item Rank: " + inventory.get(0).getRankO() );
            jPanel1.add(rank);
            Dimension rankSize = rank.getPreferredSize();
            item.setBounds(10, 0, rankSize.width, rankSize.height);


            JLabel stat = new JLabel( "Affected stat: " + inventory.get(0).getStat() );
            
            JLabel boost = new JLabel( "Total statboost: " + inventory.get(0).getValueO() * inventory.get(0).getRankO() );
           
            
            
            JButton b0 = new javax.swing.JButton("Equip");
            Dimension b0Size = b0.getPreferredSize();
            b0.setBounds (100, 0, b0Size.width, b0Size.height);
            jPanel1.add(b0);
            b0.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Luchador.equipFighterWithItem(fighter, inventory.get(0));
                    inventory.remove(0);
                    frame.dispose(); 
                }
            });
            
            
            if (inventory.size()> 1 ){
            JButton b1 = new javax.swing.JButton("Equip");
            Dimension b1Size = b1.getPreferredSize();
            b1.setBounds (100, 30, b1Size.width, b1Size.height);
            jPanel1.add(b1);
            b1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Luchador.equipFighterWithItem(fighter, inventory.get(1));
                    inventory.remove(1);
                    frame.dispose(); 
                }
            });
            
            }
            
            if (inventory.size()> 2 ){
            JButton b2 = new javax.swing.JButton("Equip");
            Dimension b2Size = b2.getPreferredSize();
            b2.setBounds (100, 60, b2Size.width, b2Size.height);
            jPanel1.add(b2);
            b2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Luchador.equipFighterWithItem(fighter, inventory.get(2));
                    inventory.remove(2);
                    frame.dispose(); 
                }
            });
            }
            
            if (inventory.size()> 3 ){
            JButton b3 = new javax.swing.JButton("Equip");
            Dimension b3Size = b3.getPreferredSize();
            b3.setBounds (100, 90, b3Size.width, b3Size.height);
            jPanel1.add(b3);
            b3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Luchador.equipFighterWithItem(fighter, inventory.get(3));
                    inventory.remove(3);
                    frame.dispose(); 
                }
            });
            }
            
            if (inventory.size()> 4 ){
            JButton b4 = new javax.swing.JButton("Equip");
            Dimension b4Size = b4.getPreferredSize();
            b4.setBounds (100, 120, b4Size.width, b4Size.height);
            jPanel1.add(b4);
            b4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Luchador.equipFighterWithItem(fighter, inventory.get(4));
                    inventory.remove(4);
                    frame.dispose(); 
                }
            });
            }
            
            if (inventory.size()> 5 ){
            JButton b5 = new javax.swing.JButton("Equip");
            Dimension b5Size = b5.getPreferredSize();
            b5.setBounds (100, 150, b5Size.width, b5Size.height);
            jPanel1.add(b5);
            b5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Luchador.equipFighterWithItem(fighter, inventory.get(5));
                    inventory.remove(5);
                    frame.dispose(); 
                }
            });
            }
            
            if (inventory.size()> 6 ){
            JButton b6 = new javax.swing.JButton("Equip");
            Dimension b6Size = b6.getPreferredSize();
            b6.setBounds (100, 180, b6Size.width, b6Size.height);
            jPanel1.add(b6);
            b6.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Luchador.equipFighterWithItem(fighter, inventory.get(6));
                    inventory.remove(6);
                    frame.dispose(); 
                }
            });
            }
            
            if (inventory.size()> 7 ){
            JButton  b7 = new javax.swing.JButton("Equip");
            Dimension b7Size = b7.getPreferredSize();
            b7.setBounds (100, 210, b7Size.width, b7Size.height);
            jPanel1.add(b7);
            b7.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Luchador.equipFighterWithItem(fighter, inventory.get(7));
                    inventory.remove(7);
                    frame.dispose(); 
                }
            });
            }
            
            if (inventory.size()> 8 ){
            JButton b8 = new javax.swing.JButton("Equip");
            Dimension b8Size = b8.getPreferredSize();
            b8.setBounds (100, 240, b8Size.width, b8Size.height);
            jPanel1.add(b8);
            b8.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Luchador.equipFighterWithItem(fighter, inventory.get(8));
                    inventory.remove(8);
                    frame.dispose(); 
                }
            });
            }
            
            if (inventory.size()> 9 ){
            JButton b9 = new javax.swing.JButton("Equip");
            Dimension b9Size = b9.getPreferredSize();
            b9.setBounds (100, 270, b9Size.width, b9Size.height);
            jPanel1.add(b9);
            b9.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Luchador.equipFighterWithItem(fighter, inventory.get(9));
                    inventory.remove(9);
                    frame.dispose(); 
                }
            });
            }
        frame.setSize(375, 200);
        frame.setVisible(true);
     }
    
}
