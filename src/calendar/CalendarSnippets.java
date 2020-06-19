package calendar;

import java.util.Calendar;

public class CalendarSnippets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		currentDate();
	}

	public static void currentDate() {
		Calendar cal = Calendar.getInstance();
		int DAY_OF_MONTH=cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(DAY_OF_MONTH);
		
		int DAY_OF_WEEK=cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(DAY_OF_WEEK);
		
		int DAY_OF_WEEK_IN_MONTH=cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		System.out.println(DAY_OF_WEEK_IN_MONTH);
	}

}
