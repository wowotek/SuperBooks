package com.wowotek.superbooks.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.wowotek.superbooks.db.users.*;

public class DBUserControl
{
	private Connection c;
	
	public DBUserControl(Connection c)
	{
		this.c = c;
	}
	
	public void AddUserData(UserData ud) throws SQLException
	{
		PreparedStatement ps = this.c
				.prepareStatement("insert into UserData("
						+ "Nama,"
						+ "LegalID,"
						+ "TTL,"
						+ "Phone1,"
						+ "Phone2,"
						+ "Work,"
						+ "WorkPlace,"
						+ "RegID"
						+ ") Values(?, ?, ?, ?, ?, ?, ?, ?)");
		ps.setString(1, ud.NAMA);
		ps.setString(2, ud.LEGAL_ID);
		ps.setString(3, ud.TTL);
		ps.setString(4, ud.PHONE1);
		ps.setString(5, ud.PHONE2);
		ps.setString(6, ud.WORK);
		ps.setString(7, ud.WORKPLACE);
		ps.setString(8, ud.RegID);
		

		if(ps.executeUpdate() > 0)
		{
			ps.close();
		} else
		{
			throw new SQLException("Menambahkan UserData Gagal !");
		}
	}
	
	public void RemoveUserData(String NoTelefon1) throws SQLException
	{
		PreparedStatement ps = this.c.prepareStatement("DELETE FROM UserData WHERE Phone1=?");
		ps.setString(1, NoTelefon1);

		if(ps.executeUpdate() > 0)
		{
			ps.close();
		} else
		{
			throw new SQLException("Menghapus UserData Gagal !");
		}
	}


	public void EditUserData(UserData ud, String NoTelefon1) throws SQLException
	{

		PreparedStatement ps = this.c
				.prepareStatement("UPDATE UserData SET "
						+ "Phone1=?,"
						+ "Phone2=?,"
						+ "Work=?,"
						+ "WorkPlace=? WHERE Phone1=?");
		
		ps.setString(1, ud.PHONE1);
		ps.setString(2, ud.PHONE2);
		ps.setString(3, ud.WORK);
		ps.setString(4, ud.WORKPLACE);
		ps.setString(5, NoTelefon1);

		if(ps.executeUpdate() > 0)
		{
			ps.close();
		} else
		{
			throw new SQLException("Merubah Pengeluaran Gagal !");
		}
	}

	public ArrayList<UserData> getAllUserData() throws SQLException
	{
		ArrayList<UserData> allUserData = new ArrayList<>();
		PreparedStatement ps;
		ResultSet rs;

		ps = c.prepareStatement("SELECT * FROM UserData");
		rs = ps.executeQuery();

		while(rs.next())
		{
			allUserData.add(new UserData
			(
				rs.getString(1), rs.getString(2), 
				rs.getString(3), rs.getString(4), 
				rs.getString(5), rs.getString(6),
				rs.getString(7), rs.getString(8)
			));
		}

		rs.close();
		ps.close();

		return allUserData;
	}
	
	// Below This Line is Control For User Credentials
	
	public void AddUserCredentials(UserCredentials uc) throws SQLException
	{
		PreparedStatement ps = this.c
				.prepareStatement("insert into UserCredentials(Username, Password, Email, RegID) Values(?, ?, ?, ?)");
		ps.setString(1, uc.Username);
		ps.setString(1, uc.Password);
		ps.setString(1, uc.Email);
		ps.setString(1, uc.RegID);
		
		if(ps.executeUpdate() > 0)
		{
			ps.close();
		} else
		{
			throw new SQLException("Menambahkan UserCredentials Gagal !");
		}
	}
	
	public void RemoveUserCredentials(String Username) throws SQLException
	{
		PreparedStatement ps = this.c.prepareStatement("DELETE FROM UserCredentials WHERE Username=?");
		ps.setString(1, Username);

		if(ps.executeUpdate() > 0)
		{
			ps.close();
		} else
		{
			throw new SQLException("Menghapus UserCredentials Gagal !");
		}
	}


	public void EditUserCredentials(UserCredentials uc) throws SQLException
	{

		PreparedStatement ps = this.c
				.prepareStatement("UPDATE UserCredentials SET "
						+ "Password=?,"
						+ "Email=? WHERE Username=?");
		
		ps.setString(1, uc.Password);
		ps.setString(1, uc.Email);
		ps.setString(1, uc.Username);
		
		if(ps.executeUpdate() > 0)
		{
			ps.close();
		} else
		{
			throw new SQLException("Merubah Pengeluaran Gagal !");
		}
	}

	public ArrayList<UserCredentials> getAllUserCredentials() throws SQLException
	{
		ArrayList<UserCredentials> allUserCredentials = new ArrayList<>();
		PreparedStatement ps;
		ResultSet rs;

		ps = c.prepareStatement("SELECT * FROM UserCredentials");
		rs = ps.executeQuery();

		while(rs.next())
		{
			allUserCredentials.add(new UserCredentials
			(
				rs.getString(1),
				rs.getString(2),
				rs.getString(3),
				rs.getString(4)
			));
		}

		rs.close();
		ps.close();

		return allUserCredentials;
	}
}
