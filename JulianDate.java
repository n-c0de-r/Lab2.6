/**
 * This class takes any date and converts it to a Julian Date otherwise takes a
 * Julian Date and converts it back to Gregorian.
 * 
 * @author n-c0de-r
 * @version 25.05.2021 update 23.06.2021
 *
 */

public class JulianDate {

	private int value;
	
	public JulianDate (int year, int month, int day) {
		//Using the formula from Wikipedia instead of one own
		value = (1461 * (year + 4800 + (month - 14)/12))/4 +(367 * (month - 2 - 12 * ((month - 14)/12)))/12 - (3 * ((year + 4800 + (month - 14)/12)/100))/4 + day - 32075;
		
	} 
}
