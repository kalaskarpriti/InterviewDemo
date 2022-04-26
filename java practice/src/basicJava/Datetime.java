package basicJava;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Datetime {

	public static void main(String[] args) {

		Date d = new Date();
		System.out.println(d.toString());
		System.out.println(d);

		SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy");
		System.out.println(sd.format(d));
		SimpleDateFormat time = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(time.format(d));

		// Calendar Methods
		System.out.println("Calendar Methods--------------------------");
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sd1 = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sd1.format(cal.getTime()));
		System.out.println(cal.getFirstDayOfWeek());
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cal.get(Calendar.FRIDAY));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		

	}

}
