package com.wowotek.superbooks.db;

import java.sql.*;
import java.util.ArrayList;

import com.wowotek.superbooks.db.targetclass.*;

public class DBControl
{
	private Connection c;

	DBControl(Connection c)
	{
		this.c = c;
	}

	public void AddPemasukan(Pemasukan pemasukan) throws SQLException
	{
		PreparedStatement ps = this.c
				.prepareStatement("insert into Pemasukan(Transaksi, Sumber, Jumlah) Values(?, ?, ?)");
		ps.setString(1, pemasukan.TRANSAKSI);
		ps.setString(2, pemasukan.SUMBER);
		ps.setInt(3, pemasukan.JUMLAH);
		
		if(ps.executeUpdate() > 0)
		{
			ps.close();
		} else
		{
			throw new SQLException("Menambahkan Pemasukan Gagal !");
		}
	}

	public void AddPengeluaran(Pengeluaran pengeluaran) throws SQLException
	{
		PreparedStatement ps = this.c.prepareStatement("insert into Pengeluaran(Transaksi, Jumlah) Values(?, ?)");
		ps.setString(1, pengeluaran.TRANSAKSI);
		ps.setInt(2, pengeluaran.JUMLAH);
		
		if(ps.executeUpdate() > 0)
		{
			ps.close();
		} else
		{
			throw new SQLException("Menambahkan Pengeluaran Gagal !");
		}
	}

	public void RemovePemasukan(int IDPemasukan) throws SQLException
	{
		PreparedStatement ps = this.c.prepareStatement("DELETE FROM Pemasukan WHERE ID_Pemasukan=?");
		ps.setInt(1, IDPemasukan);
		
		if(ps.executeUpdate() > 0)
		{
			ps.close();
		} else
		{
			throw new SQLException("Menghapus Pemasukan Gagal !");
		}
	}

	public void RemovePengeluaran(int IDPengeluaran) throws SQLException
	{
		PreparedStatement ps = this.c.prepareStatement("DELETE FROM Pengeluaran WHERE ID_Pengeluaran=?");
		ps.setInt(1, IDPengeluaran);
		
		if(ps.executeUpdate() > 0)
		{
			ps.close();
		} else
		{
			throw new SQLException("Menghapus Pengeluaran Gagal !");
		}
	}

	public void EditPemasukan(Pemasukan pms) throws SQLException
	{
		PreparedStatement ps = this.c
				.prepareStatement("UPDATE Pemasukan SET Transaksi=?, Sumber=?, Jumlah=? WHERE ID_Pemasukan=?");
		ps.setString(1, pms.TRANSAKSI);
		ps.setString(2, pms.SUMBER);
		ps.setInt(3, pms.JUMLAH);
		ps.setInt(4, pms.ID_PEMASUKAN);

		if(ps.executeUpdate() > 0)
		{
			ps.close();
		} else
		{
			throw new SQLException("Merubah Pemasukan Gagal !");
		}
	}

	public void EditPengeluaran(Pengeluaran pemasukan) throws SQLException
	{

		PreparedStatement ps = this.c
				.prepareStatement("UPDATE Pemasukan SET Transaksi=?, Jumlah=? WHERE ID_Pengeluaran=?");
		ps.setString(1, pemasukan.TRANSAKSI);
		ps.setInt(2, pemasukan.JUMLAH);
		ps.setInt(3, pemasukan.ID_PENGELUARAN);
		
		if(ps.executeUpdate() > 0)
		{
			ps.close();
		} else
		{
			throw new SQLException("Merubah Pengeluaran Gagal !");
		}
	}

	public ArrayList<Pemasukan> getAllPemasukan() throws SQLException
	{
		ArrayList<Pemasukan> allPemasukan = new ArrayList<>();
		PreparedStatement ps;
		ResultSet rs;

		ps = c.prepareStatement("SELECT * FROM Pemasukan");
		rs = ps.executeQuery();

		while(rs.next())
		{
			allPemasukan.add(new Pemasukan(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
		}

		rs.close();
		ps.close();

		return allPemasukan;
	}

	public ArrayList<Pengeluaran> getAllPengeluaran() throws SQLException
	{
		ArrayList<Pengeluaran> allPengeluaran = new ArrayList<>();
		PreparedStatement ps;
		ResultSet rs;

		ps = c.prepareStatement("SELECT * FROM Pengeluaran");
		rs = ps.executeQuery();

		while(rs.next())
		{
			allPengeluaran.add(new Pengeluaran(rs.getInt(1), rs.getString(2), rs.getInt(3)));
		}

		rs.close();
		ps.close();

		return allPengeluaran;
	}
}
