package com.nic;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TestDate {

	private static String formattedTime1;

	public static void main(String[] args) {
		try {
			
			
			
			
			
			OpMntdiff("2022-08-04 12:37:54.554463");
			
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
			LocalTime target = LocalTime.parse(sdf.format(new Date()));
			LocalTime target1 = LocalTime.parse("13:30");
			LocalTime target2 = LocalTime.parse("16:30");
			System.out.println(target);
			if(target.equals(target1)||target.equals(target2) ) {
				System.out.println("Matched");
				
				
			}
			
			
			
//			"4/22/2022 9:44:16 PM"
//			"4/22/2022 9:45:20 PM"
			getdateddMMyyyy("Tue Apr 26 00:00:00 IST 2022");
			conveterAMPMDateToTimestamp("4/22/2022 9:44:16 PM");
			conveterAMPMDateToTimestamp("4/22/2022 9:44:16 AM");
		
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddhhmmss");
		Date data;
		String formattedTime = null;
	
			Date date = dateFormat.parse("20210929104958");//20210727100721
			Timestamp timeStampDate = new Timestamp(date.getTime());
			formattedTime = timeStampDate.toString() + "00000";
		     System.out.println("Date "+formattedTime);
		} catch (ParseException e) {
			
		}

	}
	
	
	
	
public static String conveterAMPMDateToTimestamp(String stringData) {
	 	try {	
     SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyy h:mm:ss a");
     Date data1 = sdf.parse(stringData);
     Timestamp timeStampDate = new Timestamp(data1.getTime());
     String formattedTime = timeStampDate.toString() + "00000";
     System.out.println("Timestamp "+formattedTime);
	 	} catch (Exception e) {
	 		System.out.println("Exception"+e);
		}
	 	return formattedTime1;
}


public static String getdateddMMyyyy(String stringData) throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");//
    SimpleDateFormat output = new SimpleDateFormat("dd MMM yyyy");
    Date data = sdf.parse(stringData);
    String formattedTime = output.format(data);
    System.out.println("Date chalan "+formattedTime);
    return formattedTime;
}

public static long OpMntdiff(String dateBeforeString ) {
//    String ("2020-12-12 18:38:08.536857");
    SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    long minutes_difference = 0;
    long hr_difference = 0;
   // String dateBeforeString;
    try {
        // dateBeforeString = "2021-06-03 01:10:00.000";
        //dateBeforeString = pgidobj.getOpDate();
    	 // Calucalte time difference in minutes
        Date dateBefore = myFormat.parse(dateBeforeString);
        Date dateAfter = new Date();
        System.out.println("Current Date: "+dateAfter +"My Date : "+dateBefore);
        long difference = dateAfter.getTime() - dateBefore.getTime();
        long minutes_t = TimeUnit.MILLISECONDS.toMinutes(difference);//1051254
        long hour_t=TimeUnit.MILLISECONDS.toHours(difference);
        System.out.println("minutes_t : "+minutes_t  +" My Date : "+dateBefore+ " Current Date: "+dateAfter +"hour_t "+hour_t);
        long minutes = (difference / 1000) / 60;//1051254
        hr_difference = ((difference / (1000*60*60)) / 24);
        
        System.out.println("minutes_t : "+minutes_t  +"My Date : "+dateBefore+"Hour :"+hr_difference);
    } catch (Exception e) {
//        LOGGER.error(e.toString() + " , " + e.getStackTrace()[0]);
    }
    return minutes_difference;
}

}
