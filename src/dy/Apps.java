package dy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Apps {

	public static void main(String[] args) {
		SimpleDateFormat formatter = new SimpleDateFormat(
				"dd-MMM-yyyy hh:mm:ss a");

		// Compare if the date2 is later than date. Simple word if the date2 is
		// bigger than date
		try {
			Date date1 = new Date();

			Thread.sleep(1000);
			Date date2 = new Date();
			if (date2.after(date1) == true) {
				System.out.println("The date2 is after date1");
			} else {
				System.out.println("The date2 is before date1");
			}
			System.out.println(formatter.format(date1));
			System.out.println(formatter.format(date2));
			System.out.printf("%tF", date1);
			System.out.println();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// How to parse the string to date object
		Date date1 = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("yyyy/MM/dd");

		String dateStr;
		dateStr = "2014/01/01";
		try {
			date1 = ft.parse(dateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(formatter.format(date1));

		// how to find time different

		Date d1 = null;
		Date d2 = null;
		long diff = 0;
		try {
			d1 = ft.parse("2014/01/01");
			d2 = ft.parse("2014/01/30");

			if (d2.after(d1) == true) {

				diff = d2.getTime() - d1.getTime();
			}else
			{
				diff=0;
			}

			long diffSeconds = diff / 1000 % 60;
			long diffMinutes = diff / (60 * 1000) % 60;
			long diffHours = diff / (60 * 60 * 1000) % 24;
			long diffDays = diff / (24 * 60 * 60 * 1000);
			
			System.out.print(diffDays + " days, ");
			System.out.print(diffHours + " hours, ");
			System.out.print(diffMinutes + " minutes, ");
			System.out.println(diffSeconds + " seconds.");

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//How to add day to date
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Calendar c = Calendar.getInstance();
		c.setTime(new Date()); // Now use today date.
		c.add(Calendar.DATE, 5); // Adding 5 days
		String output = sdf.format(c.getTime());
		System.out.println(output);

	}

}
