package com.techlab.test;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.techlab.model.AsynchronousPrinter;
import com.techlab.model.Home;
import com.techlab.model.Synchronous;

public class FrameWindow{
	private JFrame frame=new JFrame();
	private JButton home,sync,async;
	
	public FrameWindow() {
		home=new JButton("Home");
		home.setBounds(50, 50, 20, 20);
		home.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
            	Home home=new Home();
            	home.test();
       
            }
		});
		sync=new JButton("Print Sync");
		sync.setBounds(100, 50, 20, 20);
		sync.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Synchronous sync=new Synchronous();
				sync.test();
			}
			
		});
		async=new JButton("Print Async");
		async.setBounds(150,50,20,20);
		async.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				AsynchronousPrinter async=new AsynchronousPrinter();
				Thread t = new Thread(async);
				t.start();
			}
			
		});
		frame.add(home);
		frame.add(sync);
		frame.add(async);
		frame.setLayout(new FlowLayout());
		frame.setSize(700,700);
		frame.setTitle("Asynchronous programming app");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
