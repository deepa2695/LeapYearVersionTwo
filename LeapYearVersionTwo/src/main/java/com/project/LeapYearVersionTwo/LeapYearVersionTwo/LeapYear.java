package com.project.LeapYearVersionTwo.LeapYearVersionTwo;

public class LeapYear {
	public boolean isLeapYear(Integer year) {
		
		if(year == null){
			throw new NullPointerException("The input is null");
		}
		
		if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
			return true;
		}else{
			return false;
		}
		
	}
}
