
public class MetricDate {

	private int days;
	private int weeks;
	private int months;
	private int years;
	
	public MetricDate() {
		
	}
	
	public void toMetricDate(JulianDate date) {
		int num = date.getNumber();
		days = num % 10;
		weeks = num % 100 / 10;
		months = num % 1000 / 100 ;
		years = num / 1000;
	}
	
	public int toJulianDate() {
		int num = 0;
		num += years * 1000;
		num += months *100;
		num += weeks * 10;
		num += days;
		return num;
	}
	
	public String getValue() {
		return "" + years + "." + months + "." + weeks + "." + days;
	}
}
