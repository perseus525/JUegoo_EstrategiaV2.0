/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.juego_estrategia;

/**
 *
 * @author marclo
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package juego_estrategia_prototype;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 *
 * @author marclo
 */
public class NewFighterWindow extends SimpleFighterWindow {

    public NewFighterWindow(Luchador fighter, int numero, ArrayList <ObjetoEquipable> inventory){
        
        super(fighter, numero, inventory);

        jPanel1.setLayout(null);

        JLabel hpLabel = new JLabel("HP: " + fighter.getHP());
        jPanel1.add(hpLabel);
        Dimension hpSize = hpLabel.getPreferredSize();
        hpLabel.setBounds(0, 45, hpSize.width, hpSize.height);
            
        JLabel atkLabel = new JLabel("ATK: " + fighter.getATK());
        jPanel1.add(atkLabel);
        Dimension atkSize = atkLabel.getPreferredSize();
        atkLabel.setBounds(0, 60, atkSize.width, atkSize.height);
        
        JLabel defLabel = new JLabel("DEF: " + fighter.getDEF());
        jPanel1.add(defLabel);
        Dimension defSize = defLabel.getPreferredSize();
        defLabel.setBounds(0, 75, defSize.width, defSize.height);
        
        JLabel spdLabel = new JLabel("SPD: " + fighter.getSPD());
        jPanel1.add(spdLabel);
        Dimension spdSize = spdLabel.getPreferredSize();
        spdLabel.setBounds(0, 90, spdSize.width, spdSize.height);

        frame.setSize(350, 200);
        frame.setTitle("Your new Fighter");
    }
}
