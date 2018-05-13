package com.wowotek.superbooks;

public class Util
{
	public static boolean checkStringInGroup(String text, String[] group)
	{
		for(String i: group)
		{
			if(text.equals(i))
			{
				return true;
			}
		}
		return false;
	}
}
