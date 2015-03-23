package com.alancowap.cag.gui.myfirstgui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiApp extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnReverse;
	private JTextField textField_2;

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
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.setBounds(33, 57, 202, 49);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
			}
		});
		btnClear.setBounds(245, 57, 89, 23);
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
		btnReverse.setBounds(245, 91, 89, 23);
		contentPane.add(btnReverse);
		
		textField_2 = new JTextField();
		textField_2.setBounds(31, 117, 204, 38);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnTransfer = new JButton("Transfer");
		btnTransfer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField_2.setText(textField.getText());
			}
		});
		btnTransfer.setBounds(245, 125, 89, 23);
		contentPane.add(btnTransfer);
	}
}
