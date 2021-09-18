package com.project.LeapYearVersionTwo.LeapYearVersionTwo;

import org.junit.Assert;
import org.junit.Test;

public class TestLeapYear {
	
	@Test
    public void shouldReturnTrueIfYearIsDivisibleByFourHundred(){
		LeapYear leapYear = new LeapYear();
        Assert.assertTrue(leapYear.isLeapYear(1200));
    }
	
}
