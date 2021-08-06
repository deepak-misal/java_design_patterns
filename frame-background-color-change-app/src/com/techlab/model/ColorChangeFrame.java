package com.techlab.model;

import java.awt.Color;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class ColorChangeFrame extends JFrame {
	private JButton red,blue;
	
	
	public ColorChangeFrame() {
	
	    red = new JButton("red");
	    add(red);
	    red.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
            	if (ae.getSource() == red)
        		{
        	      getContentPane().setBackground(Color.RED);
        	    }
        	    
            }
        });
	    
	    blue = new JButton("blue");
	    add(blue);
	    blue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
            	if (ae.getSource() == blue)
        		{
        	      getContentPane().setBackground(Color.BLUE);
        	    }
        	    
            }
        });
	    
	    setLayout(new FlowLayout());
	    setSize(700,700);
	    setTitle("Bit Life - Java program Buttons Clicked");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setVisible(true);
	}


}
