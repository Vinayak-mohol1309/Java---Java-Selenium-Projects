package com.advanto.pack1;
import java.util.Scanner;
public class DayNameShow {

	public static int weekday(int date ,int month , int year) {
		int yr,yd;
		int dayWeek;
		yr = year % 100;
		yd = year / 100;
		System.out.println("\nThe Date Given is: "+date+"/"+month+"/"+year);
		dayWeek = (int)(1.25*yr+findm(month,year)+date-2*(yd%4));
		dayWeek = dayWeek % 7;
		switch (dayWeek) {
		case 0: {
			System.out.println("Day of week of the date is: Saturday");
			break;
		}
		case 1: {
			System.out.println("Day of week of the date is: Sunday");
			break;
		}
		case 2: {
			System.out.println("Day of week of the date is: Monday");
			break;
		}
		case 3: {
			System.out.println("Day of week of the date is: Tuesday");
			break;
		}
		case 4: {
			System.out.println("Day of week of the date is: Wednesday");
			break;
		}
		case 5: {
			System.out.println("Day of week of the date is: Thursday");
			break;
		}
		case 6: {
			System.out.println("Day of week of the date is: Friday");
			break;
		}
		default:
			System.out.println("The given input data is wrong");
		}
		return 0;
	}
	
	public static int findm(int months , int yearss) {
		int findMonth,leapYr;
		if((yearss % 100 == 0 )&& (yearss % 400 != 0))
			leapYr=0;
		else if(yearss % 4 == 0)
			leapYr=1;
		else
			leapYr=0;
		findMonth = 3 + (2 - leapYr) * ((months + 2) / (2 * months))
				+ (5 * months + months / 9) / 2;
		findMonth = findMonth % 7;
		return findMonth;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the year: ");
		int years = input.nextInt();
		System.out.println("enter the month: ");
		int mont = input.nextInt();
		System.out.println("enter the date: ");
		int dat = input.nextInt();
		weekday(dat,mont,years);

	}

}
