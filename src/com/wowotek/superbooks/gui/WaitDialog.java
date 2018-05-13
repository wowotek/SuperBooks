package com.wowotek.superbooks.gui;

import java.awt.BorderLayout;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

public class WaitDialog extends JDialog
{
	private final JPanel contentPanel = new JPanel();
	private final JLabel lblSilahkanMenunggu;

	public WaitDialog()
	{
		this.setModal(false);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 382, 107);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 382, 107);
		contentPanel.setBackground(new Color(1, 50, 67));
		
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		lblSilahkanMenunggu = new JLabel("Silahkan Menunggu........");
		lblSilahkanMenunggu.setForeground(Color.WHITE);
		lblSilahkanMenunggu.setFont(new Font("Noto Sans CJK TC Light", Font.BOLD | Font.ITALIC, 22));
		lblSilahkanMenunggu.setBounds(103, 37, 255, 30);
		contentPanel.add(lblSilahkanMenunggu);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(WaitDialog.class.getResource("/com/wowotek/superbooks/gui/img/LogoTok.png")));
		label_1.setBounds(12, 12, 78, 83);
		contentPanel.add(label_1);
	}
	
	public void doWait()
	{

		this.setVisible(true);
	}
	
	private StringBuilder sb = new StringBuilder();
	private char[] WaitString = "Silahkan Menunggu........".toCharArray();
	private int currentAlph = 0;
	public void tick()
	{
		if(WaitString[currentAlph] == ' ')
		{
			currentAlph++;
		}
		sb.append(WaitString[currentAlph]);
		this.lblSilahkanMenunggu.setText(sb.toString());
		currentAlph++;
		if (currentAlph >= WaitString.length-1)
		{
			sb = new StringBuilder();
			currentAlph = 0;
		}
		System.out.println(sb.toString());
	}
}
