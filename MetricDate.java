/**
 * This class takes JulianDate types and converts them to MetricDates
 * 
 * @author HTW-IMI
 * @version 2021.06.23
 */
public class MetricDate {

	private int days;
	private int weeks;
	private int months;
	private int years;
	
	/**
	 * Empty constructor
	 */
	public MetricDate() {
	}
	
	/**
	 * Constructor to convert regular dates to Metric
	 *
	 * @param year
	 * @param month
	 * @param day
	 */
	public MetricDate(int year, int month, int day) {
		//Only considers the full julian date, needs subtraction of current dates!
		JulianDate jd = new JulianDate(year, month, day);
		toMetricDate(jd);
	}
	
	/**
	 * Method to convert JulianDates to MetricDates.
	 *
	 * @param date	Object of type JulianDate.
	 */
	public void toMetricDate(JulianDate date) {
		int num = date.getNumber();
		days = num % 10;
		weeks = num % 100 / 10;
		months = num % 1000 / 100 ;
		years = num / 1000;
	}
	
	/**
	 * Convert any MetricDate to JulianDate number
	 *
	 * @return	Recalculated JulianDate number
	 */
	public int toJulianDate() {
		int num = 0;
		num += years * 1000;
		num += months *100;
		num += weeks * 10;
		num += days;
		return num;
	}
	
	/**
	 * Accessor method to get the MetricDate value.
	 *
	 * @return	A String representation of the MetricDate.
	 */
	public String getValue() {
		return "" + years + "." + months + "." + weeks + "." + days;
	}
}
