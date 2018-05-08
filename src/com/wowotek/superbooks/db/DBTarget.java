package com.wowotek.superbooks.db;

import java.sql.*;

import com.wowotek.superbooks.db.targetclass.*;

public class DBTarget
{
	private boolean stated = false;
	private PreparedStatement statement;
	private Connection c;
	
	DBTarget(Connection c)
	{
		this.c = c;
	}
	
	public PreparedStatement getStatement()
	{
		if (stated)
		{
			return this.statement;
		}
		else
		{
			return null;
		}
	}
	
	public void statePemasukan(Pemasukan pemasukan) throws SQLException
	{
		if(stated)
		{
			throw new SQLException("SQL Sudah Ditetapkan !");
		}
		else
		{
    		Pemasukan p = pemasukan;
    		this.statement = this.c.prepareStatement("insert into Pemasukan(Transaksi, Sumber, Jumlah) Values(?, ?, ?)");
    		this.statement.setString(1, p.TRANSAKSI);
    		this.statement.setString(2, p.SUMBER);
    		this.statement.setInt(3, p.JUMLAH);
		}
	}
	
	public void statePengeluaran(Pengeluaran pengeluaran) throws SQLException
	{
		if (stated)
		{
			throw new SQLException("SQL Sudah Ditetapkan !");
		}
		else
		{
			Pengeluaran p = pengeluaran;
    		this.statement = this.c.prepareStatement("insert into Pengeluaran(Transaksi, Jumlah) Values(?, ?)");
    		this.statement.setString(1, p.TRANSAKSI);
    		this.statement.setInt(2, p.JUMLAH);
		}
	}
}
