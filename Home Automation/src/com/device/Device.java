package com.device;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import com.interfaces.BasicDevice;

public class Device implements BasicDevice{

	private String status;
	private LocalTime startTime;
	
	public Device() {
		super();
		this.status = "off";
		this.startTime = LocalTime.now();
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	@Override
	public boolean turnOn() {

		System.out.println("\tDevice is being turned on");
		if(this.getStatus().equalsIgnoreCase("off")) {
			this.setStatus("On");
			this.setStartTime(LocalTime.now());
			return true;
		}
		System.out.println("\tYour device is already turned ON");
		return false;
	}

	
	public boolean turnOff() 
	{
		
		System.out.println("\tDevice is being turned off");
		if(this.getStatus().equalsIgnoreCase("on")) 
		{
			this.setStatus("Off");
			this.setStartTime(LocalTime.now());
			return true;
		}
		System.out.println("\tYour device is already turned OFF");
		return false;
	}

	
	public long checkTime()
	{
		
		System.out.println("\tCalculating time for your deviece's current status");
		return (Duration.between(startTime,LocalTime.now())).toSeconds();
	}

	@Override
	public String toString() {
		return "\tstatus = " + status + "\tstartTime=" + startTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
	}
}
