package com.device;

import com.interfaces.MediaDevice;

public class TV extends Device implements MediaDevice
{
	

	@Override
	public void play() 
	{
		System.out.println("\tPlaying video");
	}
	public TV() 
	{
		super();
		System.out.println("\tTV obj created");
	}
	@Override
	public void pause() 
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void stop() 
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void next() 
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void previous() 
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void adjustVolume() 
	{
		// TODO Auto-generated method stub
		
	}
}
