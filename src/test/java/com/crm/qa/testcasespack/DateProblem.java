package com.crm.qa.testcasespack;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class DateProblem {
	
	
	@Test(enabled=false)
	public void date1() {
		String pattern = "MM-dd-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		System.out.println(date);

	}
	@Test
	public void newpro() {
		String date1= "05-06-1999";
		Date date2 = null;
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		try {
			date2 = sdf.parse(date1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 String formatedDate = sdf.format(date2);
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-YYYY");  
	   String nfd= formatter.format(date2);
		System.out.println(formatedDate);
		System.out.println(nfd);
	}
	
	@Test(enabled=false)
	public void date2() {
		
		// Make a new Date object. It will be initialized to the current time.
        Date now = new Date();

        // See what toString() returns
        System.out.println(" 1. " + now.toString());

//        // Next, try the default DateFormat
//        System.out.println(" 2. " + DateFormat.getInstance().format(now));
//
//        // And the default time and date-time DateFormats
//        System.out.println(" 3. " + DateFormat.getTimeInstance().format(now));
//        System.out.println(" 4. " + 
//            DateFormat.getDateTimeInstance().format(now));
//
//        // Next, try the short, medium and long variants of the 
//        // default time format 
//        System.out.println(" 5. " + 
//            DateFormat.getTimeInstance(DateFormat.SHORT).format(now));
//        System.out.println(" 6. " + 
//            DateFormat.getTimeInstance(DateFormat.MEDIUM).format(now));
//        System.out.println(" 7. " + 
//            DateFormat.getTimeInstance(DateFormat.LONG).format(now));
//
//        // For the default date-time format, the length of both the
//        // date and time elements can be specified. Here are some examples:
//        System.out.println(" 8. " + DateFormat.getDateTimeInstance(
//            DateFormat.SHORT, DateFormat.SHORT).format(now));
//        System.out.println(" 9. " + DateFormat.getDateTimeInstance(
//            DateFormat.MEDIUM, DateFormat.SHORT).format(now));
//        System.out.println("10. " + DateFormat.getDateTimeInstance(
//            DateFormat.LONG, DateFormat.LONG).format(now));
//    }

		
	}
	
}
