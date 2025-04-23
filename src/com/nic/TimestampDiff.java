package com.nic;

import java.sql.Timestamp;

public class TimestampDiff {

	public static void main(String[] args) throws InterruptedException {
		
		Timestamp t1 = new Timestamp(System.currentTimeMillis());
        Timestamp t2 = new Timestamp(System.currentTimeMillis());
        
        getTimeDiff(t1,t2);
        
    }
    private static long getTimeNoMillis(Timestamp t) {
        return t.getTime() - (t.getNanos()/1000000);
    }
    
    private static long getTimeDiff(Timestamp t1,Timestamp t2) {
    	t1.setNanos(t1.getNanos() + 60);
        t2.setNanos(t2.getNanos() + 30);
        System.out.println(t1);
        System.out.println(t2);
        // The actual diff...
        long firstTime = (getTimeNoMillis(t1) * 1000000) + t1.getNanos();
        long secondTime = (getTimeNoMillis(t2) * 1000000) + t2.getNanos();
        long diff = Math.abs(firstTime - secondTime); // diff is in nanos
        System.out.println(diff);
        System.out.println(Math.abs(t1.getTime() - t2.getTime()));
        
        return diff;
    }
}