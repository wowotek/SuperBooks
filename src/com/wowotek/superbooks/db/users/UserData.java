package com.wowotek.superbooks.db.users;

public class UserData
{
	public String NAMA;
	public String LEGAL_ID;
	public String TTL;
	public String PHONE1;
	public String PHONE2 = null;
	public String WORK;
	public String WORKPLACE;
	public String RegID;
	
	public UserData(
			String Nama, String Legal_ID, 
			String TTL, String Phone1, 
			String Phone2, String Work, String WorkPlace, String RegID)
	{
		this.NAMA = Nama;
		this.LEGAL_ID = Legal_ID;
		this.TTL = TTL;
		this.PHONE1 = Phone1;
		this.PHONE2 = Phone2;
		this.WORK = Work;
		this.WORKPLACE = WorkPlace; 
		this.RegID = RegID;
	}
	
	public UserData(String Nama, String Legal_ID, String TTL, String Phone1, String Phone2, String Work, String WorkPlace)
	{
		this.NAMA = Nama;
		this.LEGAL_ID = Legal_ID;
		this.TTL = TTL;
		this.PHONE1 = Phone1;
		this.PHONE2 = Phone2;
		this.WORK = Work;
		this.WORKPLACE = WorkPlace;
	}
}
