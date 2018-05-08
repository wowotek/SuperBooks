package com.wowotek.superbooks.gui;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;

public class LoginDialog extends JDialog {

	/**
	 * 
	 */
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			LoginDialog dialog = new LoginDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public LoginDialog() {
		initComponents();
	}
	
	private void initComponents()
	{
		getContentPane().setBackground(new Color(1, 50, 67));
		setBounds(100, 100, 396, 225);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(27, 188, 155));
		panel.setBounds(0, 116, 396, 109);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(12, 14, 80, 15);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(124, 12, 250, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(12, 41, 80, 15);
		panel.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.addActionListener(
				new AbstractAction() {
					@Override
					public void actionPerformed(ActionEvent e)
					{
						LoggedIn();
					}
				}
				);
		passwordField.setBounds(124, 43, 250, 19);
		panel.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(64, 74, 117, 25);
		panel.add(btnLogin);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(207, 74, 117, 25);
		panel.add(btnCancel);
		
		JLabel label = new JLabel("SuperBooks Login");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Noto Sans CJK TC Light", Font.BOLD | Font.ITALIC, 22));
		label.setBounds(145, 37, 188, 30);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(LoginDialog.class.getResource("/com/wowotek/superbooks/gui/img/LogoTok.png")));
		label_1.setBounds(65, 12, 78, 83);
		getContentPane().add(label_1);
	}
	
	public void LoggedIn()
	{
		System.out.println("Enter Pressed");
	}
}
