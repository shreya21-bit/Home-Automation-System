package com.house;

import com.device.Device;

import java.util.List;
import java.util.ArrayList;

public class Room 
{

	private String roomType;
	private List<Device> devices;
	
	// Parameterized constructor
	public Room(String roomType)
	{
		super();
	
		this.roomType = roomType;
		devices = new ArrayList<Device>();
	}

	public String getRoomType() 
	{
		return roomType;
	}

	public void setRoomType(String roomType) 
	{
		this.roomType = roomType;
	}

	public List<Device> getDevices() 
	{
		return devices;
	}

	public void setDevices(List<Device> devices) 
	{
		this.devices = devices;
	}

	@Override
	public String toString()
	{
		return "" + roomType ;
	}
	
	public void displayDevices()
	{
		
		if(this.devices.size()==0) 
		{
			System.out.println("---------------------------------------------------------");
			System.out.println("\tNo data to display");
			System.out.println("---------------------------------------------------------");
			return;
		}
		System.out.println("=========================================================");
		System.out.println("\tInstalled Devices : ");
		System.out.println("---------------------------------------------------------");
		int i=0;
		for(Device dev : this.devices) 
		{
			System.out.println("\t"+(++i)+"."+dev.getClass().getSimpleName()+dev);
		}
		System.out.println("---------------------------------------------------------");
		return;
	}
}