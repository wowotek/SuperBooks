package com.wowotek.superbooks.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;

public class CreateAccount_UserCredentials extends JDialog
{
	private final JPanel contentPanel = new JPanel();
	private JTextField FieldNama;
	private JTextField FieldKTP;

	private JButton btnNext;
	private JButton btnCancel;
	private JTextField txtGmailcom;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	
	public static void main(String[] args)
	{
		try
		{
			CreateAccount_UserCredentials dialog = new CreateAccount_UserCredentials();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public CreateAccount_UserCredentials()
	{
		setBounds(100, 100, 477, 272);
		setBackground(new Color(27, 188, 155));
		setResizable(false);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 477, 272);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setBackground(new Color(27, 188, 155));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 477, 93);
		contentPanel.add(panel);
		{
			JLabel label = new JLabel("");
			panel.add(label);
			panel.setBackground(new Color(1, 50, 67));
			label.setIcon(
					new ImageIcon(CreateAccount_UserData.class.getResource("/com/wowotek/superbooks/gui/img/LogoTok.png"))
			);
		}
		{
			JLabel lblFormulirDataPengguna = new JLabel("Formulir Privasi Pengguna");
			panel.add(lblFormulirDataPengguna);
			lblFormulirDataPengguna.setForeground(Color.WHITE);
			lblFormulirDataPengguna.setFont(new Font("Noto Sans CJK TC Light", Font.BOLD | Font.ITALIC, 22));
		}

		JLabel lblUsername = new JLabel("Nama Akun");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setBounds(10, 107, 80, 15);
		
		FieldNama = new JTextField();
		FieldNama.setColumns(10);
		FieldNama.setForeground(Color.GRAY);
		FieldNama.setBounds(154, 105, 309, 19);
		FieldNama.setFont(new Font("Dialog", Font.ITALIC, 12));
		FieldNama.setText("erlanggaibr");
		
		FieldKTP = new JTextField();
		FieldKTP.setColumns(10);
		FieldKTP.setForeground(Color.GRAY);
		FieldKTP.setBounds(154, 134, 182, 19);
		FieldKTP.setFont(new Font("Dialog", Font.ITALIC, 12));
		FieldKTP.setText("contoh_email12");

		JLabel lblNama = new JLabel("Alamat Surel");
		lblNama.setForeground(Color.WHITE);
		lblNama.setBounds(10, 136, 106, 15);
		
		JLabel lblNoTelefon_1 = new JLabel("Password");
		lblNoTelefon_1.setForeground(Color.WHITE);
		lblNoTelefon_1.setBounds(10, 167, 97, 15);
		
		JLabel lblNoTelefon = new JLabel("Ulangi Password");
		lblNoTelefon.setForeground(Color.WHITE);
		lblNoTelefon.setBounds(10, 196, 128, 15);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setBounds(252, 223, 120, 35);

		btnNext = new JButton("Selanjutnya");
		btnNext.setBounds(120, 223, 120, 35);
		
		contentPanel.add(lblUsername);
		contentPanel.add(lblNama);
		contentPanel.add(lblNoTelefon_1);
		contentPanel.add(lblNoTelefon);
		
		contentPanel.add(FieldNama);
		contentPanel.add(FieldKTP);
		contentPanel.add(btnCancel);
		contentPanel.add(btnNext);
		
		txtGmailcom = new JTextField();
		txtGmailcom.setText("gmail.com");
		txtGmailcom.setForeground(Color.GRAY);
		txtGmailcom.setFont(new Font("Dialog", Font.ITALIC, 12));
		txtGmailcom.setColumns(10);
		txtGmailcom.setBounds(357, 134, 106, 19);
		contentPanel.add(txtGmailcom);
		
		JLabel label = new JLabel("@");
		label.setBounds(341, 136, 12, 15);
		contentPanel.add(label);
		label.setForeground(Color.WHITE);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(154, 165, 309, 19);
		contentPanel.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(154, 194, 309, 19);
		contentPanel.add(passwordField_1);
	}
}
