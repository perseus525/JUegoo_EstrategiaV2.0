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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author marce
 */
public class RandomPartyAsk extends javax.swing.JFrame{
    
    JFrame frame = new JFrame();  
        
    JPanel jPanel1 = (JPanel) frame.getContentPane();
    
    public RandomPartyAsk(ArrayList <Luchador> party, ArrayList <Luchador> list, int partySize, ArrayList <String> checker, Monstruo monster, ArrayList <ObjetoEquipable> inventory){

        jPanel1.setLayout(null);
  
        JButton bRandom = new javax.swing.JButton("Random Party");
        frame.add(bRandom);
        Dimension Random = bRandom.getPreferredSize();
        bRandom.setBounds(120, 10, Random.width, Random.height);  
        
        JButton bCustom= new javax.swing.JButton("Custom Party");
        frame.add(bCustom);
        Dimension Custom = bCustom.getPreferredSize();
        bCustom.setBounds(120, 40, Custom.width, Custom.height);
    
        bRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Party.makeParty( party, list, 1, partySize, checker, monster, inventory);
                Fight.hunt(monster, inventory, list, party, checker);
                frame.dispose();
            }
        });
        
        bCustom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Party.makeParty( party, list, 2, partySize, checker, monster, inventory);
                frame.dispose();
            }
        });
        
        frame.setVisible(true);
        frame.setTitle("Wanna have a random party?");
        frame.setSize(375,200);
    }
}
