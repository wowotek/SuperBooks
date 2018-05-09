package com.wowotek.superbooks.db.targetclass;

public class Pengeluaran
{
	public int ID_PENGELUARAN;
	public String TRANSAKSI = null;
	public int JUMLAH;
	
	public Pengeluaran(int id, String transaksi, int jumlah)
	{
		this.ID_PENGELUARAN = id;
		this.TRANSAKSI = transaksi;
		this.JUMLAH = jumlah;
	}
	
	public Pengeluaran(String transaksi, int jumlah)
	{
		this.TRANSAKSI = transaksi;
		this.JUMLAH = jumlah;
	}
}
