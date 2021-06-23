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
	
	/**
	 * Constructor of the class, takes dates and converts to a JulianDate number
	 * 
	 * @param year	Year of the given date
	 * @param month	Month of the given date
	 * @param day	Day of the given date
	 */
	public JulianDate (int year, int month, int day) {
		//Using the formula from https://quasar.as.utexas.edu/BillInfo/JulianDatesG.html
		int A = year/100;
		int B = A/4;
		int C = 2-A+B;
		int E = (int) (365.25 * (year+4716));
		int F = (int) (30.6001 * (month +1));
		
		value = (int) (C+day+E+F-1524.5);
		
		
		if (value%100 == 0) {
			System.out.println("Your lifetime is divisible by 100!");
		}
	}
	
	/**
	 * Constructor, if only days are entered.
	 * @param days	Days lived as a julian day number.
	 */
	public JulianDate (int days) {
		value = days;
	}
	
	/**
	 * Getter to return the JulianDate number.
	 * @return	Integer value for that date.
	 */
	public int getNumber() {
		return value;
	}
	
	/**
	 * Returns the day of the week for that specific date.
	 * @return	String with the weekday.
	 */
	public String getWeekday() {
		//Calculate day value for each weekday
		int w =(value % 7)+1;
		
		switch(w) {
		case 0:
			return "Monday";
		case 1:
			return "Tuesday";
		case 2:
			return "Wednesday";
		case 3:
			return "Thursday";
		case 4:
			return "Friday";
		case 5:
			return "Saturday";
		case 6:
			System.out.println("Your are a Sunday's Child! YAY!");
			return "Sunday";
		default:
			return "Not a day!";
		}
	}
	
}
