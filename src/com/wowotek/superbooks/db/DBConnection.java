package com.wowotek.superbooks.db;

import java.util.Properties;
import java.sql.*;

import static com.wowotek.superbooks.db.DBConfig.*;

public class DBConnection
{
	public boolean Connected;
	private boolean verbose = DB_VERBOSE_ERROR;
	public Connection c;
	
	public DBConnection()
	{
		Thread thread_connection = new Thread()
		{
			@Override
			public void start()
			{
				Connected = Connect();
			}
		};
		
		try
		{
			System.out.println("Connecting to Database...");
			thread_connection.start();
			thread_connection.join();
			if(!Connected)
			{
				System.out.println("Could Not Connect to Databases ! Exiting Program !");
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	private boolean createConnection()
	{
		String connectionURL = DB_LOCATION;
		Properties properties = new Properties();
		properties.setProperty("user", DB_USERNAME);
		properties.setProperty("password", DB_PASSWORD);
		properties.setProperty("useSSL", DB_USE_SSL);
		properties.setProperty("autoReconnect", DB_AUTO_RECONNECT);

		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			c = DriverManager.getConnection(connectionURL, properties);
			return true;
		} catch(ClassNotFoundException | InstantiationException | IllegalAccessException cnfe)
		{
			if(verbose)
				System.out.println("	" + cnfe.getMessage());
			return false;
		} catch(SQLException ex)
		{
			if(verbose)
				System.out.println("	" + ex.getMessage());
			return false;
		}
	}
	
	private boolean Connect()
	{
		for(int i = 0; i < DB_NUMBER_OF_RETRIES; i++)
		{
			if(createConnection() == true)
			{
				System.out.println("Database Berhasil Terhubung!");
				return true;
			}
			else
			{
				if(verbose)
				{
					System.out.println("	Connection Failed!");
					System.out.println("	Retrying...");
					System.out.println("	Total Tries = " + (i+1) + "/" + DB_NUMBER_OF_RETRIES);
				}
				continue;
			}
		}
		return false;
	}
	
	public boolean Disconnect()
	{
		try
		{
			this.c.close();
			if(this.c.isClosed())
			{
				System.out.println("Koneksi Database Berhasil Ditutup");
				return true;
			}
			else
			{
				throw new SQLException("Gagal Menutup Koneksi Database !");
			}
		}
		catch(SQLException ex)
		{
			if(verbose)
			{
				System.out.println(ex.getMessage());
			}
			return false;
		}
	}
}
