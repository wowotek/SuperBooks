package com.wowotek.superbooks.gui;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JSeparator;

public class LoginDialog extends JDialog
{
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JButton btnLogin;
	private JButton btnAkunBaru;
	private JButton btnCancel;
	
	public LoginDialog()
	{
		initComponents();
		Actions();
	}
	
	private void Actions()
	{
		usernameField.addActionListener(new AbstractAction()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				passwordField.requestFocusInWindow();
			}
		});
		
		passwordField.addActionListener(new AbstractAction()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				btnLogin.doClick(250);
				LogIn();
			}
		});
		
		btnAkunBaru.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				CreateNewAccount();
			}
			
		});
	}
	
	private void CreateNewAccount()
	{
		
	}
	
	private void initComponents()
	{
		setResizable(false);
		getContentPane().setBackground(new Color(1, 50, 67));
		setBounds(100, 100, 396, 302);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(27, 188, 155));
		panel.setBounds(0, 107, 396, 195);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(12, 14, 80, 15);
		panel.add(lblNewLabel);

		usernameField = new JTextField();
		usernameField.setBounds(110, 12, 274, 19);
		panel.add(usernameField);
		usernameField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(12, 41, 80, 15);
		panel.add(lblNewLabel_1);

		passwordField = new JPasswordField();
		passwordField.setBounds(110, 39, 274, 19);
		panel.add(passwordField);
		
		btnLogin = new JButton("Login");
		btnLogin.setBounds(64, 74, 117, 25);
		panel.add(btnLogin);

		btnCancel = new JButton("Cancel");
		btnCancel.setBounds(207, 74, 117, 25);
		panel.add(btnCancel);

		JSeparator separator = new JSeparator();
		separator.setBounds(12, 105, 372, 10);
		panel.add(separator);

		JLabel lblNewLabel_2 = new JLabel("Buat Akun Baru");
		lblNewLabel_2.setBounds(12, 122, 117, 15);
		panel.add(lblNewLabel_2);

		btnAkunBaru = new JButton("Akun Baru");
		btnAkunBaru.setBounds(147, 117, 237, 25);
		panel.add(btnAkunBaru);

		JLabel lblTidakBisaLogin = new JLabel("Tidak Bisa Login ?");
		lblTidakBisaLogin.setBounds(12, 159, 126, 15);
		panel.add(lblTidakBisaLogin);

		JButton btnLupaPassword = new JButton("Lupa Password");
		btnLupaPassword.setBounds(147, 154, 237, 25);
		panel.add(btnLupaPassword);

		JLabel label = new JLabel("SuperBooks Login");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Noto Sans CJK TC Light", Font.BOLD | Font.ITALIC, 22));
		label.setBounds(150, 37, 188, 30);
		getContentPane().add(label);

		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(LoginDialog.class.getResource("/com/wowotek/superbooks/gui/img/LogoTok.png")));
		label_1.setBounds(70, 12, 78, 83);
		getContentPane().add(label_1);
	}

	private void LogIn()
	{
		System.out.println("Enter Pressed");
	}
}
