package com.fish.Hotel;

public class Empty
{
	MainRun mr=new MainRun();
	public boolean isEmpty(int roomNo)
	{		if("EMPTY".equals(mr.getRoom()[(roomNo/100)-1][(roomNo%100)-1]))
			return true;
		else
			return false;
	 }
}
