import java.time.LocalDateTime;

/**
 * This class takes any date and converts it to a Julian Date otherwise takes a
 * Julian Date and converts it back to Gregorian.
 * 
 * @author Aidaika09
 * @author n-c0de-r
 * @version 25.05.2021
 *
 */

public class JulianDate {

	private static final LocalDateTime CURRENT_DATE = LocalDateTime.of(-4712, 1, 1, 12, 0, 0, 0);

	private int julianDate;
	private int julianTime;
	private LocalDateTime gregorianDate;

	/**
	 * Overload the class with several constructors to guard against passing to few
	 * arguments
	 */
	public JulianDate(int number) {
		//converts back to gregorian.
	}

	public JulianDate(int year, int month, int day) {
		this(year, month, day, 0, 0, 0);
	}

	public JulianDate(int year, int month, int day, int hrs) {
		this(year, month, day, hrs, 0, 0);
	}

	public JulianDate(int year, int month, int day, int hrs, int min) {
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
	public JulianDate(int year, int month, int day, int hrs, int min, int sec) {
		//Pretty much a copy of www.youtube.com/watch?v=A9KJQje-340&t=488s
		//It's much simpler and cleaner to read than the formula of Wikipedia!
		
		int a = (14-month) / 12;	//calculate the average days in a month?
		int y = year + 4800 - a;	// calculate the average of years?
		int m = month + 12 * a - 3; //calculate the average of months in a year?
		
		julianDate = day + (153 * m + 2) / 5 + (365 * y) + y/4 + y/100 + y/400  - 32045;
		
		julianTime = julianDate + hrs/24 + min/1440 + sec/86400;
	}

	public int getDays() {
		return julianDate;
	}

	public int getTime() {
		return julianTime;
	}

	public String getWeekday() {
		int w = (julianTime % 7);
		switch (w) {
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";
		case 0:
			return "Sunday";
		default:
			return "not a weekday";
		}
	}

}
