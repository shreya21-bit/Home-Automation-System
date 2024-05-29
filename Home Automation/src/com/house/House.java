package com.house;

import java.util.List;
import java.util.ArrayList;

public class House 
{
	
	private List<Room>rooms;
	private int houseNo;
	private String ownerName;
	
	public House() 
	{
		rooms = new ArrayList<Room>();
	}
	
	public House(int houseNo,String owner)
	{
		super();
		
		this.houseNo = houseNo;
		rooms = new ArrayList<Room>();
		ownerName=owner;
	}

	public String getOwnerName() 
	{
		return ownerName;
	}

	public void setOwnerName(String ownerName)
	{
		this.ownerName = ownerName;
	}

	public List<Room> getRooms() 
	{
		return rooms;
	}

	public void setRooms(List<Room> rooms)
	{
		this.rooms = rooms;
	}
	
	public int getHouseNo() 
	{
		return houseNo;
	}

	public void setHouseNo(int houseNo)
	{
		this.houseNo = houseNo;
	}
	
	public void displayRoomsInfo() 
	{

		if(rooms.size()==0) 
		{
			System.out.println("---------------------------------------------------------");
			System.out.println("\tNo data to display");
			System.out.println("---------------------------------------------------------");
			return;
		}
		System.out.println("=========================================================");
		System.out.println("\tRooms available : ");
		System.out.println("---------------------------------------------------------");
		int i=0;
		for(Room rm : rooms) 
		{
			System.out.println("\t"+(++i)+"."+rm);
		}
		System.out.println("---------------------------------------------------------");
		return;
	}
}
