/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase_graficacion;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author USUARIO
 */
public class ShowColors2 extends JFrame{
    private JButton changeColorButton;
    private Color color = Color.LIGHT_GRAY;
    private Container container;
    
    public ShowColors2(){
        super("Using JColorChooser");
        container =getContentPane();
        container.setLayout(new FlowLayout());
        
        changeColorButton= new JButton("Change color");
        changeColorButton.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent event){
               color=JColorChooser.showDialog(ShowColors2.this, "Choose a color",color);
               if(color==null){
                   color=Color.LIGHT_GRAY;
               }
               container.setBackground(color);
           }
        });
        container.add(changeColorButton);
        setSize(400,130);
        setVisible(true);
    }
    
}


