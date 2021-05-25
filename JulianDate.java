import java.time.LocalDateTime;

/**
 * This class takes any date and converts it to a Julian Date
 * otherwise takes a Julian Date and converts it back to Gregorian.
 * 
 * @author Aidaika09
 * @author n-c0de-r
 * @version 25.05.2021
 *
 */

public class JulianDate {
	private static final LocalDateTime CURRENT_DATE = LocalDateTime.of(-4712, 1, 1, 12, 0, 0, 0);
	
	private double julianDate;
	private LocalDateTime gregorianDate;
	
	/**
	 * Overload the class with several constructors to guard against
	 * passing to few arguments 
	 */
	public JulianDate (int year) {
		this(year, 1, 1, 0, 0, 0);
	}
	
	public JulianDate (int year, int month) {
		this(year, month, 1, 0, 0, 0);
	}
	
	public JulianDate (int year, int month, int day) {
		this(year, month, day, 0, 0, 0);
	}
	
	public JulianDate (int year, int month, int day, int hrs) {
		this(year, month, day, hrs, 0, 0);
	}
	
	public JulianDate (int year, int month, int day, int hrs, int min) {
		this(year, month, day, hrs, min, 0);
	}
	
	/**
	 * Main constructor with all parameters to create a Julian Date
	 * 
	 * @param year
	 * @param month
	 * @param day
	 * @param hrs
	 * @param min
	 * @param sec
	 */
	public JulianDate (int year, int month, int day, int hrs, int min, int sec) {
		int february = 0;
		
		// Add year number
		julianDate = (year + 4712) * 1000000000;
		
		//Check if it's a leap year, and set the smallest month length
		if (year % 4 == 0) {
			february = 29;
		} else {
			february = 28;
		}
		
		//If the current day is smaller than the minimum month length
		//don't include the current month in multiplication.
		if (day < february) {
			month += (month-1);
		}
		
		// Add day numbers
		julianDate += (month * february) + (day % february) * 1000000;
		
		//Add hours
		julianDate += (hrs % 24) * 10000;
		
		//Add hours
		julianDate += (min % 60) * 100;
		
		//Add hours
		julianDate += sec;
	}
	
	public double getJulian_() {
		return julianDate;
	}
	
	public LocalDateTime getGregorianDate() {
		return gregorianDate;
	}
	
	public void getJulianDate() {
		System.out.println();
	}
}
