package com.project.LeapYearVersionTwo.LeapYearVersionTwo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestLeapYear {
	
	public LeapYear leapYear;
	
	@Before
	public void initiaLizeLeapYearClass(){
		leapYear = new LeapYear();
	}
	
	@Test
    public void shouldReturnTrueIfYearIsDivisibleByFourHundred(){
        Assert.assertTrue(leapYear.isLeapYear(1200));
    }
	
	@Test
    public void shouldReturnTrueIfYearIsDivisibleByFourAndNotDivisibleByHundred(){
		Assert.assertTrue(leapYear.isLeapYear(1996));
    }
	
	@Test
    public void shouldReturnFalseIfYearIsNotDivisibleByFourHundred(){
        Assert.assertFalse(leapYear.isLeapYear(1100));
    }
	
	@Test
    public void shouldReturnFalseIfYearIsNotDivisibleByFourAndHundred(){
		Assert.assertFalse(leapYear.isLeapYear(1991));
    }
	
	@Test
    public void shouldReturnFalseIfYearIsDivisibleByFourAndHundred(){
		Assert.assertFalse(leapYear.isLeapYear(1900));
    }
}
