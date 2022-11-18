package assignment1;

import org.apache.velocity.runtime.directive.Parse;

import java.awt.geom.NoninvertibleTransformException;

public class Calender {
    int month;
    int day;
    int year;


    public String NextDay(String date) throws ExceptionClass {
        String[] DATE=date.split("/");
        int day= Integer.parseInt(DATE[0]);
        int month= Integer.parseInt(DATE[1]);
        int year = Integer.parseInt(DATE[2]);
        return FindNextDay(day,month,year);
    }
    public String FindNextDay(int day,int month,int year) throws ExceptionClass {

        switch (month)
        {
            case 1: case 3: case 5: case 7: case 8: case 10: return(MonthsWith31Days(day,month)+"/"+year);
            case 4: case 6: case 9: case 11: return(MonthsWith30Days(day,month)+"/"+year);
            case 2: return(MonthFebrurary(day,month,year));
            case 12: return MonthDecember(day,month,year);
        }
        return null;
    }

    public String MonthDecember(int day,int month , int year) {
        if(day == 31) {
            day = 1;
            month=1;
            year++;
    } else {
            day=day+1;
        }
        return (day+"/"+month+"/"+year);
    }

    public String MonthFebrurary(int day, int month,int year) throws ExceptionClass {
        if(IsLeapyear(year)) {
            return ifLeapyear(day,month,year);
        }
        else{
           return ifNotLeapyear(day, month, year);
            }
    }

    public boolean IsLeapyear(int year) {
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
        {
            return true;
        }
        return false;
    }

    public String MonthsWith30Days(int day, int month) {
        if(day==30)
        {
            day=1;
            month++;
        }
        else
        {
            day++;
        }
        return (day+"/"+month);
    }

    public String MonthsWith31Days(int day, int month) {
        if(day==31)
        {
            day=1;
            month++;
        }
        else
        {
            day++;
        }
        return (day+"/"+month);
    }
    public String ifLeapyear(int day,int month, int year)
    {
        if (day == 29) {
            day = 1;
            month++;
        } else {
            day = day + 1;
        }
        return (day+"/"+month+"/"+year);
    }
    public String ifNotLeapyear(int day,int month, int year) throws ExceptionClass {
        if(day==29)
        {
            throw new ExceptionClass(year+ " is not a leapyear.Can't have 29 days.");
        }
        else if(day==28)
        {
            day = 1;
            month++;
        } else {
            day=day+1;
        }
        return (day+"/"+month+"/"+year);
    }
}
