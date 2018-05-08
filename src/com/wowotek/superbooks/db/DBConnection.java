package com.wowotek.superbooks.db;

import java.util.Properties;
import java.sql.*;

import static com.wowotek.superbooks.db.DBConfig.*;

public class DBConnection
{
	private Connection c;
	
	public DBConnection()
	{
		Connect();
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
			System.out.println(cnfe.getMessage());
			return false;
		} catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
			return false;
		}
	}
	
	private void Connect()
	{
		for(int i = 0; i < DB_NUMBER_OF_RETRIES; i++)
		{
			if(createConnection() == true)
			{
				System.out.println("Connection Established!");
				break;
				
			}
			else
			{
				System.out.println("Connection Failed!");
				continue;
			}
		}
	}
}
