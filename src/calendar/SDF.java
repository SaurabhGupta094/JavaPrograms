package calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SDF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		simpleDateFormat();

	}

	public static void simpleDateFormat() {
		SimpleDateFormat sdf = new SimpleDateFormat("");
		String date = sdf.format(new Date());
		Date date1=sdf.get2DigitYearStart();
		System.out.println(date1);
	}
}
