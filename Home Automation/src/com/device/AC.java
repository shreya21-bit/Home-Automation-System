package com.device;

import com.interfaces.TempControllable;

public class AC extends Device implements TempControllable{

	@Override
	public void setTemperature(int temp) {
		
		System.out.println("\tSetting temparature");
	}

	public AC() {
		super();
		System.out.println("\tAc object created");
	}
}
