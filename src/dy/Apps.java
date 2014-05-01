package dy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Apps {

	public static void main(String[] args) {
		SimpleDateFormat formatter=new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a");
		Date date=new Date();
		System.out.println(formatter.format(date));
		
		

		

	}

}
