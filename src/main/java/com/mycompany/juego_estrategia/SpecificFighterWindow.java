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
public class SpecificFighterWindow extends javax.swing.JFrame{
    
        JFrame frame = new JFrame();  
        
        JPanel jPanel1 = (JPanel) frame.getContentPane();
    
    public SpecificFighterWindow( ArrayList <Luchador> list,  ArrayList <ObjetoEquipable> inventory ){
        
            jPanel1.setLayout(null);

            JButton b0 = new javax.swing.JButton(list.get(0).getName());
            Dimension b0Size = b0.getPreferredSize();
            b0.setBounds(0, 0, b0Size.width, b0Size.height);
            jPanel1.add(b0);
            b0.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Luchador.mostrarLuchadorCompleto( list.get(0), 1, inventory);
                    frame.dispose(); 
                }
            });
            
            
            if (list.size()> 1 ){
            JButton b1 = new javax.swing.JButton(list.get(1).getName());
            Dimension b1Size = b1.getPreferredSize();
            b1.setBounds(0, 30, b1Size.width, b1Size.height);
            jPanel1.add(b1);
            b1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Luchador.mostrarLuchadorCompleto( list.get(1), 2, inventory);
                    frame.dispose(); 
                }
            });
            
            }
            
            if (list.size()> 2 ){
            JButton b2 = new javax.swing.JButton(list.get(2).getName());
            Dimension b2Size = b2.getPreferredSize();
            b2.setBounds(0, 60, b2Size.width, b2Size.height);
            jPanel1.add(b2);
            b2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Luchador.mostrarLuchadorCompleto( list.get(2), 3, inventory);
                    frame.dispose(); 
                }
            });
            }
            
            if (list.size()> 3 ){
            JButton b3 = new javax.swing.JButton(list.get(3).getName());
            Dimension b3Size = b3.getPreferredSize();
            b3.setBounds(0, 90, b3Size.width, b3Size.height);
            jPanel1.add(b3);
            b3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Luchador.mostrarLuchadorCompleto( list.get(3), 4, inventory);
                    frame.dispose(); 
                }
            });
            }
            
            if (list.size()> 4 ){
            JButton b4 = new javax.swing.JButton(list.get(4).getName());
            Dimension b4Size = b4.getPreferredSize();
            b4.setBounds(0, 120, b4Size.width, b4Size.height);
            jPanel1.add(b4);
            b4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Luchador.mostrarLuchadorCompleto( list.get(4), 5, inventory);
                    frame.dispose(); 
                }
            });
            }
            
            if (list.size()> 5 ){
            JButton b5 = new javax.swing.JButton(list.get(5).getName());
            Dimension b5Size = b5.getPreferredSize();
            b5.setBounds(0, 150, b5Size.width, b5Size.height);
            jPanel1.add(b5);
            b5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Luchador.mostrarLuchadorCompleto( list.get(5), 6, inventory);
                    frame.dispose(); 
                }
            });
            }
            
            if (list.size()> 6 ){
            JButton b6 = new javax.swing.JButton(list.get(6).getName());
            Dimension b6Size = b6.getPreferredSize();
            b6.setBounds(0, 180, b6Size.width, b6Size.height);
            jPanel1.add(b6);
            b6.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Luchador.mostrarLuchadorCompleto( list.get(6), 7, inventory);
                    frame.dispose(); 
                }
            });
            }
            
            if (list.size()> 7 ){
            JButton  b7 = new javax.swing.JButton(list.get(7).getName());
            Dimension b7Size = b7.getPreferredSize();
            b7.setBounds(0, 210, b7Size.width, b7Size.height);
            jPanel1.add(b7);
            b7.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Luchador.mostrarLuchadorCompleto( list.get(7), 8, inventory);
                    frame.dispose(); 
                }
            });
            }
            
            if (list.size()> 8 ){
            JButton b8 = new javax.swing.JButton(list.get(8).getName());
            Dimension b8Size = b8.getPreferredSize();
            b8.setBounds(0, 240, b8Size.width, b8Size.height);
            jPanel1.add(b8);
            b8.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Luchador.mostrarLuchadorCompleto( list.get(8), 9, inventory);
                    frame.dispose(); 
                }
            });
            }
            
            if (list.size()> 9 ){
            JButton b9 = new javax.swing.JButton(list.get(9).getName());
            Dimension b9Size = b9.getPreferredSize();
            b9.setBounds(0, 270, b9Size.width, b9Size.height);
            jPanel1.add(b9);
            b9.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Luchador.mostrarLuchadorCompleto( list.get(9), 10, inventory);
                    frame.dispose(); 
                }
            });
            }
            
            if (list.size()> 10 ){
            JButton b10 = new javax.swing.JButton(list.get(10).getName());
            Dimension b10Size = b10.getPreferredSize();
            b10.setBounds(0, 300, b10Size.width, b10Size.height);
            jPanel1.add(b10);
            b10.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Luchador.mostrarLuchadorCompleto( list.get(10), 11, inventory);
                    frame.dispose(); 
                }
            });
            }
            
            if (list.size()> 11 ){
            JButton b11 = new javax.swing.JButton(list.get(11).getName());
            Dimension b11Size = b11.getPreferredSize();
            b11.setBounds(0, 330, b11Size.width, b11Size.height);
            jPanel1.add(b11);
            b11.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Luchador.mostrarLuchadorCompleto( list.get(11), 12, inventory);
                    frame.dispose(); 
                }
            });
            }
            
            if (list.size()> 12 ){
            JButton b12 = new javax.swing.JButton(list.get(12).getName());
            Dimension b12Size = b12.getPreferredSize();
            b12.setBounds(0, 360, b12Size.width, b12Size.height);
            jPanel1.add(b12);
            b12.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Luchador.mostrarLuchadorCompleto( list.get(12), 13, inventory);
                    frame.dispose(); 
                }
            });
            }
            
            if (list.size()> 13 ){
            JButton b13 = new javax.swing.JButton(list.get(13).getName());
            Dimension b13Size = b13.getPreferredSize();
            b13.setBounds(0, 390, b13Size.width, b13Size.height);
            jPanel1.add(b13);
            b13.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Luchador.mostrarLuchadorCompleto( list.get(13), 14, inventory);
                    frame.dispose(); 
                }
            });
            }
            
            if (list.size()> 14 ){
            JButton b14 = new javax.swing.JButton(list.get(14).getName());
            Dimension b14Size = b14.getPreferredSize();
            b14.setBounds(0, 420, b14Size.width, b14Size.height);
            jPanel1.add(b14);
            b14.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Luchador.mostrarLuchadorCompleto( list.get(14), 15, inventory);
                    frame.dispose(); 
                }
            });
            }
            
            if (list.size()> 15 ){
            JButton b15 = new javax.swing.JButton(list.get(15).getName());
            Dimension b15Size = b15.getPreferredSize();
            b15.setBounds(0, 450, b15Size.width, b15Size.height);
            jPanel1.add(b15);
            b15.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Luchador.mostrarLuchadorCompleto( list.get(15), 16, inventory);
                    frame.dispose(); 
                }
            });
            }
            
            if (list.size()> 16 ){
            JButton b16 = new javax.swing.JButton(list.get(16).getName());
            Dimension b16Size = b16.getPreferredSize();
            b16.setBounds(0, 480, b16Size.width, b16Size.height);
            jPanel1.add(b16);
            b16.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Luchador.mostrarLuchadorCompleto( list.get(16), 17, inventory);
                    frame.dispose(); 
                }
            });
            }
            
            if (list.size()> 17 ){
            JButton b17 = new javax.swing.JButton(list.get(17).getName());
            Dimension b17Size = b17.getPreferredSize();
            b17.setBounds(0, 510, b17Size.width, b17Size.height);
            jPanel1.add(b17);
            b17.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Luchador.mostrarLuchadorCompleto( list.get(17), 18, inventory);
                    frame.dispose(); 
                }
            });
            }
            
            if (list.size()> 18 ){
            JButton b18 = new javax.swing.JButton(list.get(18).getName());
            Dimension b18Size = b18.getPreferredSize();
            b18.setBounds(0, 540, b18Size.width, b18Size.height);
            jPanel1.add(b18);
            b18.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Luchador.mostrarLuchadorCompleto( list.get(18), 19, inventory);
                    frame.dispose(); 
                }
            });
            }
            
            if (list.size()> 19 ){
            JButton b19 = new javax.swing.JButton(list.get(19).getName());
            Dimension b19Size = b19.getPreferredSize();
            b19.setBounds(0, 570, b19Size.width, b19Size.height);
            jPanel1.add(b19);
            b19.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Luchador.mostrarLuchadorCompleto( list.get(19), 20, inventory);
                    frame.dispose(); 
                }
            });
            }
            
            if (list.size()> 20 ){
            JButton b20 = new javax.swing.JButton(list.get(20).getName());
            Dimension b20Size = b20.getPreferredSize();
            b20.setBounds(0, 600, b20Size.width, b20Size.height);
            jPanel1.add(b20);
            b20.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Luchador.mostrarLuchadorCompleto( list.get(20), 21, inventory);
                    frame.dispose(); 
                }
            });
            }
            
            if (list.size()> 21 ){
            JButton b21 = new javax.swing.JButton(list.get(21).getName());
            Dimension b21Size = b21.getPreferredSize();
            b21.setBounds(0, 630, b21Size.width, b21Size.height);
            jPanel1.add(b21);
            b21.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Luchador.mostrarLuchadorCompleto( list.get(21), 22, inventory);
                    frame.dispose(); 
                }
            });
            }
            
            if (list.size()> 22 ){
            JButton b22 = new javax.swing.JButton(list.get(22).getName());
            Dimension b22Size = b22.getPreferredSize();
            b22.setBounds(0, 660, b22Size.width, b22Size.height);
            jPanel1.add(b22);
            b22.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Luchador.mostrarLuchadorCompleto( list.get(22), 23, inventory);
                    frame.dispose(); 
                }
            });
            }
            
            if (list.size()> 23 ){
            JButton b23 = new javax.swing.JButton(list.get(23).getName());
            Dimension b23Size = b23.getPreferredSize();
            b23.setBounds(0, 690, b23Size.width, b23Size.height);
            jPanel1.add(b23);
            b23.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Luchador.mostrarLuchadorCompleto( list.get(23), 24, inventory);
                    frame.dispose(); 
                }
            });
            }
            
            if (list.size()> 24 ){
            JButton b24 = new javax.swing.JButton(list.get(24).getName());
            Dimension b24Size = b24.getPreferredSize();
            b24.setBounds(0, 720, b24Size.width, b24Size.height);
            jPanel1.add(b24);
            b24.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Luchador.mostrarLuchadorCompleto( list.get(24), 25, inventory);
                    frame.dispose(); 
                }
            });
            }

             
        
        frame.setSize(100, 800);
        frame.setVisible(true);
    } 
}
