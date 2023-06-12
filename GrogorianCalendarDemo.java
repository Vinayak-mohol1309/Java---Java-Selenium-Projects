package com.advanto.pack1;
import java.util.*;
public class GrogorianCalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String months[]= {"jan","feb","mar","apr","may","jun",
				"jul","aug","sep","oct","nov","dec"};
		int year;
		GregorianCalendar gcalender = new GregorianCalendar();
		System.out.print("Date: ");
		System.out.print(months[gcalender.get(Calendar.MONTH)].toUpperCase());
		System.out.print(" "+ gcalender.get(Calendar.DATE)+" ");
		System.out.println(year=gcalender.get(Calendar.YEAR));
		System.out.print("Time: ");
		System.out.print(gcalender.get(Calendar.HOUR)+":");
		System.out.print(gcalender.get(Calendar.MINUTE)+":");
		System.out.println(gcalender.get(Calendar.SECOND));
		
		if(gcalender.isLeapYear(year)) {
			System.out.println("the current year is a leap year "+year);
		}else {
			System.out.println("the current year is not a leap year "+year);
		}
		
	}

}
