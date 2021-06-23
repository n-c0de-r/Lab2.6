import java.time.LocalDate;
import java.util.Scanner;

/**
 * This class takes  dates as an input String
 * and converts them to a JulianDate.
 * 
 * @author	n-c0de-r
 * @version	23.06.21
 */

public class Input {
	
	private int y = LocalDate.now().getYear();
	private int m = LocalDate.now().getMonthValue();
	private int d = LocalDate.now().getDayOfMonth();

	private int year;
	private int month;
	private int day;
	
	private JulianDate current;
	private JulianDate input;

	public Input() {
		
		current = new JulianDate(y, m, d);
		
		Scanner s = new Scanner(System.in);
		String line = "";

		System.out.println("Type 'exit' to terminate.");
		System.out.println();
		System.out.println("Please enter your birthday.");
		System.out.println();
		
		while (!line.equals("exit")) {
			
			System.out.print("First enter the year: ");
			line = s.nextLine().trim().toLowerCase();
			try {
				year = Integer.parseInt(line);
			} catch (NumberFormatException e) {
				System.err.println("Please enter a number!");
				continue;
			}

			System.out.print("Next enter the month: ");
			line = s.nextLine().trim().toLowerCase();
			try {
				month = Integer.parseInt(line);
			} catch (NumberFormatException e) {
				System.err.println("Please enter a number!");
				continue;
			}

			System.out.print("Finally, enter the day: ");
			line = s.nextLine().trim().toLowerCase();
			try {
				day = Integer.parseInt(line);
			} catch (NumberFormatException e) {
				System.err.println("Please enter a number!");
				continue;
			}
			
			input = new JulianDate(year, month, day);
			System.out.println(input);
		}
		s.close();
	}

	public static void main(String[] args) {
		

		
		Input i = new Input();

	}

}
