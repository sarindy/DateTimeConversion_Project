package dy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Apps {

	public static void main(String[] args) {
		SimpleDateFormat formater=new SimpleDateFormat("dd-MM-yyyy");
		
		String  dateInString="14-02-1980";
		try {
			Date date=formater.parse(dateInString);
			System.out.println(date);
			System.out.println(formater.format(date));
			
			//Customize the New Date
			System.out.println("New Customize Date to dd-MMM-yyyy : ");
			SimpleDateFormat formater1=new SimpleDateFormat("dd-MMM-yyyy");
			System.out.println(formater1.format(date));
			
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		

	}

}
