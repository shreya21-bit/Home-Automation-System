package com.device;

import com.interfaces.TempControllable;

public class Shower extends Device implements TempControllable
{

	@Override
	public void setTemperature(int temp)
	{
		// TODO Auto-generated method stub
		
	}

	public Shower() 
	{
		super();
		System.out.println("\tShower Obj Created");
	}
}
