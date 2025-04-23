package com.nic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateTesting {
	
	public static long OpMntdiff() {
		// pendRcdDto.setOperationDate("2020-12-12 18:38:08.536857");
		SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		long hours_difference = 0;
		String dateBeforeString;
		try {
			dateBeforeString = "2024-04-09 09:48:00.000";
			Date dateBefore = myFormat.parse(dateBeforeString);
			Date dateAfter = new Date();
			long difference = dateAfter.getTime() - dateBefore.getTime();
			System.out.println("difference : "+difference);
			
			// Calucalte time difference in minutes
			//minutes_difference = TimeUnit.MILLISECONDS.toMinutes(difference);// 1051254 commented before 09-04-2024
			hours_difference = TimeUnit.MILLISECONDS.toHours(difference); //code changed for 30 mnt to 3 hr , Recommentded by Nisha Ma'am for JK-Mail   
		System.out.println("Diffrence: "+hours_difference);
		
		} catch (Exception e) {
			e.getStackTrace();
		}
		return hours_difference;
	}
	
	
	public static void main(String[] args) {
		
		if(OpMntdiff()>= 3) {
			System.out.println("Your date is grater then 3 hrs");
		}else {
			System.out.println("Your date is less then 3 hrs");
		}
		int year=LocalDate.now().getYear();
		System.out.println("DaTe: "+ (LocalDate.now().getMonthValue()) +" - "+Year.now());
		if(LocalDate.now().getMonthValue()<4) {
			System.out.println("Back F Year: "+ (year-1) +" - "+Year.now());
		}else {
			System.out.println("CUrrent f YEAR: "+ LocalDate.now().getYear() +" - "+ (year+1));
		}
	//	System.out.println("DaTe: "+ (Year.now()) +" - "+Year.now());
		
		
		
        String dateStart = "2022/08/20 17:38:08";
        String dateStop = "2022/08/22 09:33:43";
        
        LocalDate startDate = LocalDate.parse("2024-01-10");// add for new
        LocalDate endDate=LocalDate.now();
        
//        while (!startDate.equals(endDate)) {// add for new
//        	System.out.println("startDate "+startDate);
//        	
//        	startDate = startDate.plusDays(1);
//        }
        
        
        
        
        
        
        
        
        
        
        
        
        // Custom date format
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");  

        Date d1 = null;
        Date d2 = null;
        try {
            d1 = format.parse(dateStart);
            d2 = format.parse(dateStop);
        } catch (ParseException e) {
            e.printStackTrace();
        }    

        // Get msec from each, and subtract.
        long diff = d2.getTime() - d1.getTime();

        long days = TimeUnit.MILLISECONDS.toDays(diff);
        long remainingHoursInMillis = diff - TimeUnit.DAYS.toMillis(days);
        long hours = TimeUnit.MILLISECONDS.toHours(remainingHoursInMillis);
        long remainingMinutesInMillis = remainingHoursInMillis - TimeUnit.HOURS.toMillis(hours);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(remainingMinutesInMillis);
        long remainingSecondsInMillis = remainingMinutesInMillis - TimeUnit.MINUTES.toMillis(minutes);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(remainingSecondsInMillis);

        System.out.println("Days: " + days + ", hours: " + hours + ", minutes: " + minutes + ", seconds: " + seconds);
    }
}