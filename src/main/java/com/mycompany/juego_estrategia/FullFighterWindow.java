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

/**
 *
 * @author marclo
 */
public class FullFighterWindow extends NewFighterWindow {
    
    
    //Herencia fallida, pregunta al profe
    
    public FullFighterWindow(Luchador fighter, int numero,  ArrayList <ObjetoEquipable> inventory){
        
        super(fighter, numero, inventory);

        jPanel1.setLayout(null);
        
        JLabel itemNameLabel = new JLabel("Item: " + fighter.item.getNameO());
        jPanel1.add(itemNameLabel);
        Dimension itemNameSize = itemNameLabel.getPreferredSize();
        itemNameLabel.setBounds(0, 105, itemNameSize.width, itemNameSize.height);
        
        JLabel itemStatLabel = new JLabel("Stat: " + fighter.item.getStat());
        jPanel1.add(itemStatLabel);
        Dimension itemStatSize = itemStatLabel.getPreferredSize();
        itemStatLabel.setBounds(0, 120, itemStatSize.width, itemStatSize.height);
        
        JLabel itemValueLabel = new JLabel("Item Value: " + fighter.item.getValueO());
        jPanel1.add(itemValueLabel);
        Dimension itemValueSize = itemValueLabel.getPreferredSize();
        itemValueLabel.setBounds(0, 135, itemValueSize.width, itemValueSize.height);
        
        JLabel itemRankLabel = new JLabel("Item Rank: " + fighter.item.getRankO());
        jPanel1.add(itemRankLabel);
        Dimension itemRankSize = itemRankLabel.getPreferredSize();
        itemRankLabel.setBounds(0, 150, itemRankSize.width, itemRankSize.height);
        
        frame.setSize(375, 200);
        frame.setVisible(true);
        frame.setTitle("Fighter number " + numero);
    }   
}
