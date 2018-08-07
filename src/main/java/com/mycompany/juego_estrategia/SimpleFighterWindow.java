/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.juego_estrategia;

import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

/**
 *
 * @author marclo
 */
public class SimpleFighterWindow extends javax.swing.JFrame {
    
    JFrame frame = new JFrame();  
        
    JPanel jPanel1 = (JPanel) frame.getContentPane();
    
    public SimpleFighterWindow(Luchador fighter,int numero, ArrayList <ObjetoEquipable> inventory){
        
        jPanel1.setLayout(null);
        
        JLabel nameLabel = new JLabel("Name: " + fighter.getName());
        jPanel1.add(nameLabel);
        Dimension nameSize = nameLabel.getPreferredSize();
        nameLabel.setBounds(0, 0, nameSize.width, nameSize.height);
        //Label.setBounds(x, y, size.width, size.height);
        
        JLabel typeLabel = new JLabel("Type: " + fighter.getType());
        jPanel1.add(typeLabel);
        Dimension typeSize = typeLabel.getPreferredSize();
        typeLabel.setBounds(0, 15, typeSize.width, typeSize.height);
        
        JLabel rankLabel = new JLabel("Rank: " + fighter.getRank());
        jPanel1.add(rankLabel);
        Dimension rankSize = rankLabel.getPreferredSize();
        rankLabel.setBounds(0, 30, rankSize.width, rankSize.height);
        
        JButton bEquip = new JButton("<html> Equip <br /> Item  </html>");
        jPanel1.add(bEquip);
        Dimension equipSize = bEquip.getPreferredSize();
        bEquip.setBounds(80,20, equipSize.width, equipSize.height);
        bEquip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new InventoryWindow ( inventory, fighter);
                frame.dispose();
            }
        });
        
        
        frame.setSize(375, 200);
        frame.setVisible(true);
        frame.setTitle("Fighter number " + numero);
    }
    
}
