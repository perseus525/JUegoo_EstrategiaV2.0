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

/**
 *
 * @author marce
 */
public class AddToPartyWindow extends FullFighterWindow{
    
    public AddToPartyWindow( Luchador fighter, int numero, ArrayList <Luchador> party, int partySize,Monstruo monster, ArrayList <ObjetoEquipable> inventory, ArrayList <Luchador> list, ArrayList <String> checker){
    
        super(fighter, numero, inventory);

        jPanel1.setLayout(null);

        JButton bAdd = new javax.swing.JButton("Add to Party");
        jPanel1.add(bAdd);
        Dimension bAddSize = bAdd.getPreferredSize();
        bAdd.setBounds(50, 150, bAddSize.width, bAddSize.height);
        
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                Party.moveToParty (fighter, party);
                
                if (party.size() == partySize){
                    
                    Fight.hunt(monster, inventory, list, party, checker); 
                }
                
                frame.dispose();  
            }
        });

        frame.setSize(375, 250);
        frame.setVisible(true);
        frame.setTitle("Fighter number " + numero);
    }
    
}
