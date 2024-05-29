// Godawari 
// Shreya Sangale
// Sudiksha Phadtare
// Akshada Thange

package com.homeAutomationSystem;

import java.util.Scanner;

import com.device.AC;
import com.device.Device;
import com.device.Lights;
import com.device.Radio;
import com.device.Shower;
import com.device.TV;
import com.house.House;
import com.house.Room;

public class HomeAutomation 
{ 
	
	static Scanner sc = new Scanner(System.in);
	static House home = new House();
	
	public static void main(String[] args) 
	{

		// take house info 
		System.out.println("--------------------------------------------------------------------------");
		System.out.print("\tEnter House No. : ");
		int houseNum = sc.nextInt();
		home.setHouseNo(houseNum);
		System.out.print("\tEnter Owner Name : ");
		sc.next();
		String name = sc.nextLine();
		home.setOwnerName(name);
		System.out.println("--------------------------------------------------------------------------");
		// perform operations
		
		switchOperations();
		
	}

	private static void switchOperations()
	{
		
		int choice = 0;
		while(choice!=7) 
		{
				
				roomMenu();
				System.out.print("\n\tEnter Your Choice : ");
				choice = sc.nextInt();
				
				switch(choice) 
				{
				
					case 1 :// add room
						{   
							System.out.print("\n\tEnter type of room you want to add :");
							sc.nextLine();
							String roomType = sc.nextLine();
							home.getRooms().add(new Room(roomType));
						}
						break;
						
					case 2://  add device
						{
							home.displayRoomsInfo();
							System.out.print("\n\tEnter Number of room you want to add device : ");
							int roomNum=sc.nextInt();
							availableDevices();
							System.out.print("\n\tEnter Number of device you want to add : ");
							int choice1= sc.nextInt();
							
//							System.out.println("\tBefore operation : ");
//							home.getRooms().get(roomNum-1).displayDevices();
							
							switch(choice1) 
							{
							
								case 1:
									{
//										System.out.println("\tTv device");
										home.getRooms().get(roomNum-1).getDevices().add(new TV());
									}
									break;
									
								case 2:
									{
//										System.out.println("\tAc device");
										home.getRooms().get(roomNum-1).getDevices().add(new AC());
									}
									break;
									
								case 3:
									{
//										System.out.println("\tLight device");
										home.getRooms().get(roomNum-1).getDevices().add(new Lights());
									}
									break;
									
								case 4:// Shower
									{
										home.getRooms().get(roomNum-1).getDevices().add(new Shower());
									}
									break;
								
								case 5:// Radio
									{
										home.getRooms().get(roomNum-1).getDevices().add(new Radio());
									}
									break;
									
								default:
									{
										System.out.println("\n\tInvalid choice");
									}
							}
//							System.out.println("\n\tAfter operation : ");
//							home.getRooms().get(roomNum-1).displayDevices();
						}
						break;
						
					case 3:// access device
						{
							home.displayRoomsInfo();
							System.out.print("\n\tEnter Number of room you want to access device : ");
							int roomNum=sc.nextInt();
							home.getRooms().get(roomNum-1).displayDevices();
							System.out.print("\n\tEnter Number of device you would like to access : ");
							int devNum= sc.nextInt();
							
							deviceOperationMenu();
							System.out.print("\n\tEnter Number of operation you would like to do with selected device : ");
							int choice1=sc.nextInt();
							
							Device dev = home.getRooms().get(roomNum-1).getDevices().get(devNum-1);
							
							switch(choice1) 
							{
							
								case 1:// turn on
									{
										dev.turnOn();
									}
									break;
									
								case 2:// turn off
									{
										dev.turnOff();
									}
									break;
									
								case 3:// check status of device
									{
										System.out.println("\n\tStatus of "+dev.getClass().getSimpleName()+" is "+dev.getStatus());;
									}
									break;
									
								case 4:// check time
									{
										System.out.println("\n\tTotal time for device being "+dev.getStatus()+" is "+String.format("%.2f", (float)dev.checkTime()) + " seconds.");;
									}
									break;
									
								default:
									{
										System.out.println("\n\tInvalid Choice");
									}
									break;
							}
//							home.getRooms().get(roomNum-1).displayDevices();
						}
						break;
						
					case 4:// remove device
						{
							home.displayRoomsInfo();
							System.out.print("\n\tEnter Number of room you want to remove device : ");
							int roomNum=sc.nextInt();
							home.getRooms().get(roomNum-1).displayDevices();
							System.out.print("\n\tEnter Number of device you would like to remove : ");
							int devNum= sc.nextInt();
							home.getRooms().get(roomNum-1).getDevices().remove(devNum-1);						}
						break;
						
					case 5:// remove room
						{
							home.displayRoomsInfo();
							System.out.print("\n\tEnter Number of room you want to remove : ");
							int roomNum=sc.nextInt();
							home.getRooms().remove(roomNum-1);
						}
						break;
						
					case 6:// display All room info
						{
							System.out.println("\n\tDisplaying rooms Information : ");
							home.displayRoomsInfo();
							System.out.print("\n\tEnter Number of room : ");
							int roomNum=sc.nextInt();
							home.getRooms().get(roomNum-1).displayDevices();
						}
						break;
					
					case 7:// exit
						{
							System.out.println("\n\tExiting from HomeAutomation System.....");
						}
						break;
						
					default:
						{
							System.out.println("\n\tInvalid choice");
						}
				}
		}
	}

	private static void deviceOperationMenu() 
	{

		System.out.println("\t+================================+");
		System.out.println("\t|         DEVICE OPERATIONS      |");
		System.out.println("\t+================================+");
		System.out.println("\t|         1. Turn ON             |");
		System.out.println("\t|         2. Turn OFF            |");
		System.out.println("\t|         3. Check Status        |");
		System.out.println("\t|         4. Get Time            |");
		System.out.println("\t+================================+");
	}

	private static void availableDevices()
	{
		
		System.out.println("\t+======================+");
		System.out.println("\t|       DEVICES        |");
		System.out.println("\t+======================+");
		System.out.println("\t|      1. TV           |");
		System.out.println("\t|      2. AC           |");
		System.out.println("\t|      3. Lights       |");
		System.out.println("\t|      4. Shower       |");
		System.out.println("\t|      5. Radio        |");
		System.out.println("\t+======================+");
	}

	private static void roomMenu()
	{
		
		System.out.println("\t+======================================+");
		System.out.println("\t|               MENU                   |");
		System.out.println("\t+======================================+");
		System.out.println("\t|       1. Create Room                 |");
		System.out.println("\t|       2. Add device                  |");
		System.out.println("\t|       3. Access device               |");
		System.out.println("\t|       4. Remove Device               |");
		System.out.println("\t|       5. Remove Room                 |");
		System.out.println("\t|       6. Display all Room Info       |");
		System.out.println("\t|       7. Exit                        |");
		System.out.println("\t+======================================+");
	}
}
