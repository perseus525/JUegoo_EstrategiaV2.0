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
 * @author marclo
 */
public class ShowWindowAsk extends javax.swing.JFrame{
    
     public ShowWindowAsk(ArrayList <Luchador> list, ArrayList <ObjetoEquipable> inventory, ArrayList <String> checker){
        
        JFrame frame = new JFrame();  
        
        JPanel jPanel1 = (JPanel) frame.getContentPane();

        jPanel1.setLayout(null);
        
        JButton bAllSimple = new javax.swing.JButton("<html> All of <br /> <html> Them <br /> (Simple) </html>");
        jPanel1.add(bAllSimple);
        Dimension AllSimple = bAllSimple.getPreferredSize();
        bAllSimple.setBounds(10, 10, AllSimple.width, AllSimple.height);
        bAllSimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaLuchadores.mostrarListaLuchadorSimple (list, inventory);
                frame.dispose(); 
            }
        });
        
        
        JButton bAllStats = new javax.swing.JButton("<html> All of <br /> <html> Them <br /> (Complete) </html>");
        jPanel1.add(bAllStats);
        Dimension AllStats = bAllStats.getPreferredSize();
        bAllStats.setBounds(120, 10, AllStats.width, AllStats.height);
        bAllStats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaLuchadores.mostrarTodoLuchador (list, inventory);
                frame.dispose();
            }
        });
        
        
        JButton bOne = new javax.swing.JButton("<html> A specific <br /> Fighter </html>");
        jPanel1.add(bOne);
        Dimension One = bOne.getPreferredSize();
        bOne.setBounds(10, 100, One.width, One.height);
        bOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //ListaLuchadores.mostrarUnLuchador(list,checker);
                frame.dispose();
                new SpecificFighterWindow( list, inventory );
            }
        });
        
        
        JButton bRank = new javax.swing.JButton("<html> A specific <br /> Rank </html>");
        jPanel1.add(bRank);
        Dimension Rank = bRank.getPreferredSize();
        bRank.setBounds(120, 100, Rank.width, Rank.height);
        bRank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaLuchadores.mostrarRankLuchadorAsk(list, inventory);
                frame.dispose();
            }
        });
        
        
        JButton bType = new javax.swing.JButton("<html> A specific <br /> Type </html>e");
        jPanel1.add(bType);
        Dimension Type = bType.getPreferredSize();
        bType.setBounds(230, 100, Type.width, Type.height);
        bType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaLuchadores.mostrarTypeLuchadorAsk(list, inventory);
                frame.dispose();
            }
        });   

        frame.setSize(375, 250);
        frame.setVisible(true);
    }
}
