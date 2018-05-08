package com.wowotek.superbooks.db;

import com.mysql.jdbc.PreparedStatement;
import java.sql.*;

public class DBControl
{
	private Connection c;
	
	public DBControl(Connection c)
	{
		this.c = c;
	}
	
	public boolean addData(DBTarget target)
	{
		try
		{
			PreparedStatement ps = (PreparedStatement) target.getStatement();
			c.prepareStatement(sql)
			
			if(ps.executeUpdate() > 0)
			{
				ps.close();
				return true;
			} else
			{
				throw new SQLException("Menambahkan UserCredentials Gagal !");
			}
		} catch(SQLException ex)
		{
			return false;
		}
	}
}
