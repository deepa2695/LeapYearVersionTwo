package com.project.LeapYearVersionTwo.LeapYearVersionTwo;

public class LeapYear {
	public boolean isLeapYear(int i) {
		if (i % 400 == 0 || (i % 100 != 0 && i % 4 == 0)) {
			return true;
		}else{
			return false;
		}
		
	}
}
