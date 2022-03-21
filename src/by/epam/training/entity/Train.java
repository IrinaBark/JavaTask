package by.epam.training.entity;

import java.util.Calendar;

import java.util.GregorianCalendar;

public class Train {
	
	public String destination;
	public int trainNumber;
	public Calendar departureTime;
	
	public Train() {
		
		departureTime = new GregorianCalendar(2022, 3, 15);
	}
	
	public void getDepartureTime() {
		
		System.out.println(departureTime.getTime());
	}

}
