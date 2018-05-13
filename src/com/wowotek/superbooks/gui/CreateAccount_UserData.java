package com.wowotek.superbooks.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.wowotek.superbooks.Util;
import com.wowotek.superbooks.db.users.UserData;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.SpringLayout;

import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class CreateAccount_UserData extends JDialog
{

	private final JPanel contentPanel = new JPanel();
	private JTextField FieldNama;
	private JTextField FieldKTP;
	private JTextField FieldTelefon1;
	private JTextField FieldAlamat;
	private JTextField FieldTelefon2;
	private JTextField FieldPekerjaan;
	private JTextField FieldTempatLahir;

	private JButton btnNext;
	private JButton btnCancel;
	
	private JComboBox<String> comboTanggal;
	private JComboBox<String> comboBulan;
	private JComboBox<String> comboTahun;

	public static void main(String[] args)
	{
		try
		{
			CreateAccount_UserData dialog = new CreateAccount_UserData();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public CreateAccount_UserData()
	{
		setBounds(100, 100, 477, 416);
		setBackground(new Color(27, 188, 155));
		setResizable(false);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 477, 418);
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
			JLabel lblFormulirDataPengguna = new JLabel("Formulir Data Pengguna");
			panel.add(lblFormulirDataPengguna);
			lblFormulirDataPengguna.setForeground(Color.WHITE);
			lblFormulirDataPengguna.setFont(new Font("Noto Sans CJK TC Light", Font.BOLD | Font.ITALIC, 22));
		}

		JLabel lblNama_1 = new JLabel("Nama");
		lblNama_1.setForeground(Color.WHITE);
		lblNama_1.setBounds(10, 107, 80, 15);
		
		FieldNama = new JTextField();
		FieldNama.setColumns(10);
		FieldNama.setForeground(Color.GRAY);
		FieldNama.setBounds(129, 105, 334, 19);
		FieldNama.setFont(new Font("Dialog", Font.ITALIC, 12));
		FieldNama.setText("Calvin Anggara Ibrahim");
		
		FieldKTP = new JTextField();
		FieldKTP.setColumns(10);
		FieldKTP.setForeground(Color.GRAY);
		FieldKTP.setBounds(129, 132, 334, 19);
		FieldKTP.setFont(new Font("Dialog", Font.ITALIC, 12));
		FieldKTP.setText("1234567890654123");
		
		FieldTempatLahir = new JTextField();
		FieldTempatLahir.setColumns(10);
		FieldTempatLahir.setForeground(Color.GRAY);
		FieldTempatLahir.setBounds(194, 190, 271, 19);
		FieldTempatLahir.setFont(new Font("Dialog", Font.ITALIC, 12));
		FieldTempatLahir.setText("Parung, Bogor");
		
		FieldTelefon1 = new JTextField();
		FieldTelefon1.setColumns(10);
		FieldTelefon1.setForeground(Color.GRAY);
		FieldTelefon1.setBounds(129, 252, 334, 19);
		FieldTelefon1.setFont(new Font("Dialog", Font.ITALIC, 12));
		FieldTelefon1.setText("0818xxxxxxx");
		
		FieldTelefon2 = new JTextField();
		FieldTelefon2.setBounds(129, 281, 334, 19);
		FieldTelefon2.setColumns(10);
		FieldTelefon2.setForeground(Color.GRAY);
		FieldTelefon2.setFont(new Font("Dialog", Font.ITALIC, 12));
		FieldTelefon2.setText("0251xxxxxxx");
		
		FieldPekerjaan = new JTextField();
		FieldPekerjaan.setBounds(129, 310, 334, 19);
		FieldPekerjaan.setColumns(10);
		FieldPekerjaan.setForeground(Color.GRAY);
		FieldPekerjaan.setFont(new Font("Dialog", Font.ITALIC, 12));
		FieldPekerjaan.setText("Mahasiswa");
		
		FieldAlamat = new JTextField();
		FieldAlamat.setBounds(129, 340, 334, 19);
		FieldAlamat.setColumns(10);
		FieldAlamat.setForeground(Color.GRAY);
		FieldAlamat.setFont(new Font("Dialog", Font.ITALIC, 12));
		FieldAlamat.setText("JL.Kedongdong No.13, Kab. Bigus, Halmahera");

		JLabel lblNama = new JLabel("No ID (KTP/SIM)");
		lblNama.setForeground(Color.WHITE);
		lblNama.setBounds(10, 136, 106, 15);
		
		JLabel lblNoTelefon_1 = new JLabel("No Telefon 1");
		lblNoTelefon_1.setForeground(Color.WHITE);
		lblNoTelefon_1.setBounds(10, 256, 97, 15);
		
		JLabel lblTempatTanggalLahir = new JLabel("Tempat Lahir");
		lblTempatTanggalLahir.setForeground(Color.WHITE);
		lblTempatTanggalLahir.setBounds(75, 192, 101, 15);
		
		JLabel lblNoTelefon = new JLabel("No Telefon 2");
		lblNoTelefon.setForeground(Color.WHITE);
		lblNoTelefon.setBounds(10, 285, 97, 15);

		JLabel lblPekerjaan = new JLabel("Pekerjaan");
		lblPekerjaan.setForeground(Color.WHITE);
		lblPekerjaan.setBounds(10, 314, 80, 15);

		JLabel lblAlamatKantor = new JLabel("Alamat Kantor");
		lblAlamatKantor.setForeground(Color.WHITE);
		lblAlamatKantor.setBounds(10, 344, 101, 15);

		comboTanggal = new JComboBox<String>();
		comboTanggal.setBounds(194, 216, 44, 24);
		
		comboBulan = new JComboBox<String>();
		comboBulan.setBounds(250, 216, 123, 24);

		comboTahun = new JComboBox<String>();
		comboTahun.setBounds(385, 216, 80, 24);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setBounds(250, 371, 120, 35);

		btnNext = new JButton("Selanjutnya");
		btnNext.setBounds(118, 371, 120, 35);
		
		JLabel lblTanggalLahir = new JLabel("Tanggal Lahir");
		lblTanggalLahir.setForeground(Color.WHITE);
		lblTanggalLahir.setBounds(75, 221, 101, 15);
		
		JLabel lblTempatTanggalLahir_1 = new JLabel("Tempat, Tanggal Lahir :");
		lblTempatTanggalLahir_1.setForeground(Color.WHITE);
		lblTempatTanggalLahir_1.setBounds(10, 163, 174, 15);
		
		contentPanel.add(lblNama_1);
		contentPanel.add(lblNama);
		contentPanel.add(lblNoTelefon_1);
		contentPanel.add(lblTempatTanggalLahir);
		contentPanel.add(lblNoTelefon);
		contentPanel.add(lblPekerjaan);
		contentPanel.add(lblAlamatKantor);
		contentPanel.add(lblTanggalLahir);
		contentPanel.add(lblTempatTanggalLahir_1);
		
		contentPanel.add(FieldNama);
		contentPanel.add(FieldKTP);
		contentPanel.add(FieldTelefon1);
		contentPanel.add(FieldTelefon2);
		contentPanel.add(FieldPekerjaan);
		contentPanel.add(FieldAlamat);
		contentPanel.add(FieldTempatLahir);
		
		contentPanel.add(comboTanggal);
		contentPanel.add(comboBulan);
		contentPanel.add(comboTahun);
		contentPanel.add(btnCancel);
		contentPanel.add(btnNext);
	}
}
