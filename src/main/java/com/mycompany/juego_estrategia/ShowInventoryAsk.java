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

/**
 *
 * @author marce
 */
public class ShowInventoryAsk extends javax.swing.JFrame{
    
     public ShowInventoryAsk(ArrayList <ObjetoEquipable> inventory){
     
        JFrame frame = new JFrame();  
        
        JPanel jPanel1 = (JPanel) frame.getContentPane();

        jPanel1.setLayout(null);
        
        JButton bAllSimple = new javax.swing.JButton("<html> All of <br />  Them </html>");
        jPanel1.add(bAllSimple);
        Dimension AllSimple = bAllSimple.getPreferredSize();
        bAllSimple.setBounds(10, 10, AllSimple.width, AllSimple.height);
        bAllSimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inventario.verInventarioCompleto (inventory);
                frame.dispose(); 
            }
        });
        
        JButton bSpecificRank = new javax.swing.JButton("<html> A Specific <br />  Rank </html>");
        jPanel1.add(bSpecificRank);
        Dimension SpecificRankSize = bSpecificRank.getPreferredSize();
        bSpecificRank.setBounds(100, 10, SpecificRankSize.width, SpecificRankSize.height);
        bSpecificRank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inventario.askRankInventario (inventory);
                frame.dispose(); 
            }
        }); 
     
        frame.setSize( 200, 225 );
        frame.setVisible(true);
     }
}
