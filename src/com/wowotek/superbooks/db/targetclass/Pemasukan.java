package com.wowotek.superbooks.db.targetclass;

public class Pemasukan
{
	public int ID_PEMASUKAN;
	public String TRANSAKSI = null;
	public String SUMBER = null;
	public int JUMLAH;
	
	public Pemasukan(int id, String transaksi, String sumber, int jumlah)
	{
		this.ID_PEMASUKAN = id;
		this.TRANSAKSI = transaksi;
		this.SUMBER = sumber;
		this.JUMLAH = jumlah;
	}
	
	public Pemasukan(String transaksi, String sumber, int jumlah)
	{
		this.TRANSAKSI = transaksi;
		this.SUMBER = sumber;
		this.JUMLAH = jumlah;
	}
}
