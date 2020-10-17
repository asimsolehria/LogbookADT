package logbook;

import java.io.*;
import java.time.Month;
import java.util.*;
import java.time.YearMonth;

public class Logbook {
    private int logMonth,logYear;
    private int[] entry=new int[31];
    private GregorianCalendar logCalendar;

    public Logbook() {
        logCalendar=new GregorianCalendar();
        logYear=logCalendar.get(Calendar.YEAR);
        logMonth=logCalendar.get(Calendar.MONTH)+1;
    }
    
    
    public Logbook(int logMonth, int logYear) {
        
        this.logYear=logYear;
        this.logMonth=logMonth>=1 && logMonth<=12 ? logMonth : 1;
        logCalendar=new GregorianCalendar(logYear, logMonth-1, 1);
    }
    public void putEntry(int value)
    {
        entry[logCalendar.get(Calendar.DAY_OF_MONTH)]=value;
    }
    
    public void putEntry(int day , int value)
    {
        entry[day-1]=value;
    }
    
    public void putFridayEntry(int value)
    {
                int day;
        for ( day = 0; day< this.daysInMonth(); day++) 
        {
            if(this.dayOfWeek(day)%4==0)
                entry[day]=value;
        }
        
    }
    public int getEntry(int day)
    {
        return entry[day-1];
    }
    
    public int getEntry()
    {
        return entry[logCalendar.get(Calendar.DAY_OF_MONTH)];
    }

    public int getLogMonth() {
        return logMonth;
    }

    public int getLogYear() {
        return logYear;
    }
    
    public int daysInMonth()
    {
        YearMonth object=YearMonth.of(logYear, logMonth);
        int daysInMonth=object.lengthOfMonth();
        return daysInMonth;
    }
    
    
    private boolean leapYear()
    {
        return logCalendar.isLeapYear(logYear);
    }
    
    public int dayOfWeek(int day)
    {
        logCalendar.set(logYear, logMonth-1, day);
        return logCalendar.get(Calendar.DAY_OF_WEEK)-1;
    }
    
    
    public void plus(Logbook obj)
    {
        int day;
        for ( day = 0; day< obj.daysInMonth(); day++) 
        {
            this.entry[day]+=obj.entry[day];
        }
    }
    
    void displayCalendar()
    {
        System.out.println("\t\t--------"+this.logMonth+"/"+this.logYear+"--------\n");
        
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        
        for (int i = 0; i < dayOfWeek(1); i++)
            System.out.print("\t");
        
        
        for (int day = 1; day <= this.daysInMonth(); day++)
        {
            System.out.print(day+" ("+this.getEntry(day)+")"+"\t");
            if(day%7==7-dayOfWeek(1))
                System.out.println("\n");
        }
        
    }
    
//--------If there were no built in method I would implement it as follows------
    
    public boolean isLeapYear(int year)
    {
        return year%4==0 || year%100==0 || year% 400==0;
    }
    
    
//--------If there were no built in method I would implement it as follows------
    
    
    public int day(int year, int month , int day)
    {
        int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 }; 
        year -= (month < 3) ? 1 : 0; 
        return ( year + year/4 - year/100 + year/400 + t[month-1] + day) % 7;
    }
    
    
}
