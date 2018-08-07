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
public class AskRankWindow extends javax.swing.JFrame{
    
    public AskRankWindow( ArrayList <Luchador> list,  ArrayList <ObjetoEquipable> inventory ){
        
         JFrame frame = new JFrame();  
        
        JPanel jPanel1 = (JPanel) frame.getContentPane();

        jPanel1.setLayout(null);
        
        JButton b1 = new javax.swing.JButton("RANK 1");
        jPanel1.add(b1);
        Dimension b1Size = b1.getPreferredSize();
        b1.setBounds(0, 0, b1Size.width, b1Size.height);
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaLuchadores. mostrarRankLuchador (list, 1, inventory);
                frame.dispose(); 
            }
        });
        
        JButton b2 = new javax.swing.JButton("RANK 2");
        jPanel1.add(b2);
        Dimension b2Size = b2.getPreferredSize();
        b2.setBounds(0, 30, b2Size.width, b2Size.height);
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaLuchadores. mostrarRankLuchador (list, 2, inventory);   
                frame.dispose(); 
            }
        });
        
        JButton b3 = new javax.swing.JButton("RANK 3");
        jPanel1.add(b3);
        Dimension b3Size = b3.getPreferredSize();
        b3.setBounds(0, 60, b3Size.width, b3Size.height);
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaLuchadores.mostrarRankLuchador (list, 3, inventory);   
                frame.dispose(); 
            }
        });
        JButton b4 = new javax.swing.JButton("RANK 4");
        jPanel1.add(b4);
        Dimension b4Size = b4.getPreferredSize();
        b4.setBounds(0, 90, b4Size.width, b4Size.height);
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaLuchadores. mostrarRankLuchador (list, 4, inventory);
                frame.dispose(); 
            }
        });
        
        JButton b5 = new javax.swing.JButton("RANK 5");
        jPanel1.add(b5);
        Dimension b5Size = b5.getPreferredSize();
        b5.setBounds(0, 120, b5Size.width, b5Size.height);
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaLuchadores. mostrarRankLuchador (list, 5, inventory);
                frame.dispose(); 
            }
        });
        
        
        frame.setSize(400, 200);
        frame.setVisible(true);
        frame.setTitle("Choose a RANK ");
        
    }
    
    
}
