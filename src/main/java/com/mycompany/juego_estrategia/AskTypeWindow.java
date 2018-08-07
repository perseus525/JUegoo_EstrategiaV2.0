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
public class AskTypeWindow extends javax.swing.JFrame{
    
    public AskTypeWindow(ArrayList <Luchador> list,  ArrayList <ObjetoEquipable> inventory){

        JFrame frame = new JFrame();  
        
        JPanel jPanel1 = (JPanel) frame.getContentPane();

        jPanel1.setLayout(null);
        
        JButton bFire = new javax.swing.JButton("Fire");
        jPanel1.add(bFire);
        Dimension FireSize = bFire.getPreferredSize();
        bFire.setBounds(140, 150, FireSize.width, FireSize.height);
        bFire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaLuchadores. mostrarTypeLuchador (list, 1, inventory);
                frame.dispose(); 
            }
        });
        
        JButton bWater = new javax.swing.JButton("Water");
        jPanel1.add(bWater);
        Dimension WaterSize = bWater.getPreferredSize();
        bWater.setBounds(210, 150, WaterSize.width, WaterSize.height);
        bWater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaLuchadores. mostrarTypeLuchador (list, 2, inventory);
                frame.dispose(); 
            }
        });
        
        JButton bGrass = new javax.swing.JButton("Grass");
        jPanel1.add(bGrass);
        Dimension GrassSize = bGrass.getPreferredSize();
        bGrass.setBounds(170, 190, GrassSize.width, GrassSize.height);
        bGrass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaLuchadores. mostrarTypeLuchador (list, 3, inventory);
                frame.dispose(); 
            }
        });
        
        JLabel label = new JLabel("Choose which Type of Fighters you want to see.");
        jPanel1.add(label);
        Dimension labelSize = label.getPreferredSize();
        label.setBounds(10, 10, labelSize.width,labelSize.height);
        
        frame.setTitle("Choose Type");
        frame.setSize(400, 400);
        frame.setVisible(true);
    }   
}
