package com.wowotek.superbooks;

import com.wowotek.superbooks.db.*;

public class Main {
	public static void main(String[] args)
	{
		DBConnection db = new DBConnection();
		db.Disconnect();
	}
}
