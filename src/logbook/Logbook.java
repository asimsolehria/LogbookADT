package logbook;

import java.io.*;
import java.util.*;


public class Logbook {
    private int logMonth,logYear;
    private int[] entry=new int[31];
    private GregorianCalendar logCalendar;

    public Logbook(int logMonth, int logYear) {
        this.logMonth = logMonth;
        this.logYear = logYear;
    }
    
    public void putEntry(int day , int value)
    {
        entry[day]=value;
    }
    public int getEntry(int day)
    {
        return entry[day];
    }

    public int getLogMonth() {
        return logMonth;
    }

    public int getLogYear() {
        return logYear;
    }
    
    public int daysInMonth()
    {
        return 0;
    }
    
    
    private boolean leapYear()
    {
        return logCalendar.isLeapYear(logYear);
    }

    
}
