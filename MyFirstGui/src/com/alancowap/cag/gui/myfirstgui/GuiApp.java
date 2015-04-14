/** 
 * Simple GUI to demo text fields, buttons, and event handlers
 * 
 * 
 *	 
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies none
 *  
 *  
 */ 

package com.alancowap.cag.gui.myfirstgui;

import java.awt.EventQueue;
import java.awt.MenuItem;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class GuiApp extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnReverse;
	private JTextField textField_2;
	private String msg;
	private JMenu menu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiApp frame = new GuiApp();
					frame.setTitle("My First Gui");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GuiApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setLayout(null); //we can put components where we want them, but resizing can be an issue with no layout!
		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.setToolTipText("Enter text to reverse or transfer here");
		textField.setBounds(10, 32, 225, 74);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
			}
		});
		btnClear.setBounds(245, 33, 89, 23);
		contentPane.add(btnClear);
		
		btnReverse = new JButton("Reverse");
		btnReverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Add code to reverse textfield
				String str = textField.getText();
				StringBuilder sb = new StringBuilder(str);
				sb.reverse();
				textField.setText(sb.toString());
			}
		});
		btnReverse.setBounds(245, 67, 89, 23);
		contentPane.add(btnReverse);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("reversed or transferred text will appear hear");
		textField_2.setBounds(10, 152, 225, 79);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnTransfer = new JButton("Transfer");
		btnTransfer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField_2.setText(textField.getText());
			}
		});
		btnTransfer.setBounds(76, 117, 89, 23);
		contentPane.add(btnTransfer);
		
		JButton btnHide = new JButton("Hide");
		btnHide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				hideText();
			}
		});
		btnHide.setBounds(245, 101, 89, 23);
		contentPane.add(btnHide);
		
		menu = new JMenu("New menu");
		menu.setBounds(0, 0, 107, 22);
		menu.add(new JMenuItem("Menu 1"));
		menu.add(new JMenuItem("Menu 2"));
		contentPane.add(menu);
	}
	
	private void hideText(){
		//TODO add code to un/hide text
	}
	
	
}
