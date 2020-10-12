
package logbook;
/**
 *
 * @author asim
 */
public class Coffee {
    
    int day;
    public static void main(String[] args) 
    {
        
        int day;
        
          Logbook coffee= new Logbook(12, 2000);
          
//-------------------------Putting and getting Entry Test-----------------------
          
//        coffee.putEntry(2, 100);
//        coffee.putEntry(15, 200);
//        coffee.putEntry(15, 300);
//        coffee.putEntry(1, 98);
//        coffee.putEntry(coffee.daysInMonth(), 32);
//        System.out.println(coffee.getEntry(2));
//        System.out.println(coffee.getEntry(15));
//        System.out.println(coffee.getEntry(1));
//        System.out.println(coffee.getEntry(coffee.daysInMonth()));


//-----------------------------Logbook entries print Test-----------------------

//        System.out.println("Month/Year : "+coffee.getLogMonth()+"/"+coffee.getLogYear());
//        for (day = 1; day <= coffee.daysInMonth(); day++) 
//        {
//            System.out.println(day + " : "+coffee.getEntry(day));   
//        }


//-----------------------------Day of Week print Test---------------------------

//        System.out.println(coffee.daysInMonth());
//        System.out.println(coffee.dayOfWeek(1));


//------------------------------Default constructor Test------------------------

//        Logbook softDrink=new Logbook();
//
//        System.out.println(softDrink.daysInMonth());
//        softDrink.putEntry(36);
//        System.out.println(softDrink.getEntry());


//----------------Entries summation Test for a particular month-----------------

//        Logbook softDrinks=new Logbook(12, 2000);
//
//        softDrinks.putEntry(2, 256);
//        softDrinks.putEntry(15, 600);
//
//        softDrinks.plus(coffee);
//
//        System.out.println(softDrinks.getEntry(2));
//        System.out.println(softDrinks.getEntry(15));



//----------------Summation of logDay100 and logDay200 Entires------------------


//        Logbook logDay100=new Logbook(12, 2000);
//        Logbook logDay200=new Logbook(12, 2000);
//
//
//        for (day = 1; day <=logDay100.daysInMonth(); day++) 
//        {
//            logDay100.putEntry(day, day*100);
//            logDay200.putEntry(day, day*200);
//        }
//
//
//        logDay100.plus(logDay200);
//
//        System.out.println("Month/Year : "+logDay200.getLogMonth()+"/"+logDay200.getLogYear());
//        for (day = 1; day <= logDay100.daysInMonth(); day++) 
//        {
//            System.out.println(day + " : "+logDay100.getEntry(day));   
//        }
              
              
//------------------------Own written Leap Year implementation------------------

//        Logbook leap=new Logbook(2, 2000);
//        Logbook notLeap=new Logbook(2, 1999);
//
//        System.out.println(leap.isLeapYear(leap.getLogYear()));
//        System.out.println(leap.isLeapYear(notLeap.getLogYear()));

//---------------------------displayCalendar------------------------------------
        coffee.displayCalendar();
        System.out.println(coffee.dayOfWeek(1));
    }
    
        
}
