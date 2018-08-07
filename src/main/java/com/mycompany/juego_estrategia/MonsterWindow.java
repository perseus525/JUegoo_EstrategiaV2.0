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
public class MonsterWindow extends javax.swing.JFrame{
    
    public MonsterWindow(Monstruo monster, ArrayList <ObjetoEquipable> inventory, ArrayList <Luchador> list, ArrayList <Luchador> party, ArrayList <String> checker){

        JFrame frameM = new JFrame();  
        
        JPanel jPanel1 = (JPanel) frameM.getContentPane();

        jPanel1.setLayout(null);
        
        
        JLabel nameLabel = new JLabel("Name: " + monster.getName());
        jPanel1.add(nameLabel);
        Dimension nameSize = nameLabel.getPreferredSize();
        nameLabel.setBounds(0, 0, nameSize.width, nameSize.height);
        //Label.setBounds(x, y, size.width, size.height);
        
        JLabel typeLabel = new JLabel("Type: " + monster.getType());
        jPanel1.add(typeLabel);
        Dimension typeSize = typeLabel.getPreferredSize();
        typeLabel.setBounds(0, 15, typeSize.width, typeSize.height);
        
        JLabel hpLabel = new JLabel("HP: " + monster.getHP());
        jPanel1.add(hpLabel);
        Dimension hpSize = hpLabel.getPreferredSize();
        hpLabel.setBounds(0, 30, hpSize.width, hpSize.height);
        
        JLabel atkLabel = new JLabel("ATK: " + monster.getATK());
        jPanel1.add(atkLabel);
        Dimension atkSize = atkLabel.getPreferredSize();
        atkLabel.setBounds(0, 45, atkSize.width, atkSize.height);
        
        JLabel defLabel = new JLabel("DEF: " + monster.getDEF());
        jPanel1.add(defLabel);
        Dimension defSize = defLabel.getPreferredSize();
        defLabel.setBounds(0, 60, defSize.width, defSize.height);
        
        JLabel spdLabel = new JLabel("SPD: " + monster.getSPD());
        jPanel1.add(spdLabel);
        Dimension spdSize = spdLabel.getPreferredSize();
        spdLabel.setBounds(0, 75, spdSize.width, spdSize.height);

        JLabel itemNameLabel = new JLabel("Item drop 1: " + monster.item.getNameO());
        jPanel1.add(itemNameLabel);
        Dimension itemNameSize = itemNameLabel.getPreferredSize();
        itemNameLabel.setBounds(0, 90, itemNameSize.width, itemNameSize.height);
        
        JLabel item2NameLabel = new JLabel("Item drop 2: " + monster.itemDrop2.getNameO());
        jPanel1.add(item2NameLabel);
        Dimension item2NameSize = item2NameLabel.getPreferredSize();
        item2NameLabel.setBounds(0, 105, item2NameSize.width, item2NameSize.height);
        
        JLabel item3NameLabel = new JLabel("Item drop 3: " + monster.itemDrop3.getNameO());
        jPanel1.add(item3NameLabel);
        Dimension item3NameSize = item3NameLabel.getPreferredSize();
        item3NameLabel.setBounds(0, 120, item3NameSize.width, item3NameSize.height);
        
        JLabel question = new JLabel("Do you wish to fight this monster?");
        jPanel1.add(question);
        Dimension questionSize = question.getPreferredSize();
        question.setBounds(100, 300, questionSize.width, questionSize.height);

        
        JButton bYes = new javax.swing.JButton("CHAAAAAAAARGE!!");
        jPanel1.add(bYes);
        Dimension bYesSize = bYes.getPreferredSize();
        bYes.setBounds(50, 350, bYesSize.width, bYesSize.height);
        
        bYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Party.makePartyAsk( party, list, checker, monster, inventory);
 
                frameM.dispose();
            }
        });
        
        
        
        JButton bNo = new javax.swing.JButton("No. I'm a Coward.");
        jPanel1.add(bNo);
        Dimension bNoSize = bNo.getPreferredSize();
        bNo.setBounds(200, 350, bNoSize.width, bNoSize.height);
        
        bNo.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frameM.dispose();
            }
        });

        frameM.setSize(400, 500);
        frameM.setVisible(true);
        frameM.setTitle("Your opponent");
    }   
}
