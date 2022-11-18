package assignment1;

import java.util.Arrays;
import java.util.List;

public class NextDateGenerator
{
    public int day;
    public int month;
    public int year;
    public boolean isLeapYear;
    public boolean needNextMonth;
    public boolean needNextYear;
    public List<Integer> MonthsWith30Days = Arrays.asList(4,6,9,11);
    public List<Integer> MonthsWith31Days = Arrays.asList(1,3,5,7,8,10,12);
    public NextDateGenerator(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
        if(year % 4 == 0)
        {
            isLeapYear = true;
        }
        else
        {
            isLeapYear = false;
        }
    }
    public void getNextDay(int day, int month, int year)
    {
        if(this.MonthsWith30Days.contains(month))
        {
            NextDayIn30 nextDayIn30 = new NextDayIn30();
            this.day = nextDayIn30.nextDay(day);
            //System.out.println(this.day);
            this.needNextMonth = nextDayIn30.needMonthChange;
        }
        if(this.MonthsWith31Days.contains(month))
        {
            NextDayIn31 nextDayIn31 = new NextDayIn31();
            this.day = nextDayIn31.nextDay(day);
            //System.out.println(this.day);
            this.needNextMonth = nextDayIn31.needMonthChange;
        }
        if(month == 2)
        {
            if(this.isLeapYear)
            {
                NextDayFebLeap nextDayFebLeap = new NextDayFebLeap();
                this.day = nextDayFebLeap.nextDay(day);
                //System.out.println(this.day);
                this.needNextMonth = nextDayFebLeap.needMonthChange;
            }
            else
            {
                NextDayFeb nextDayFeb = new NextDayFeb();
                this.day = nextDayFeb.nextDay(day);
                //System.out.println(this.day);
                this.needNextMonth = nextDayFeb.needMonthChange;
            }
        }
        if(this.needNextMonth == true)
        {
            NextMonth nextMonth = new NextMonth();
            this.month = nextMonth.getNextMonth(month);
            //System.out.println(this.month);
            this.needNextYear = nextMonth.needNextYear;
        }
        if(this.needNextYear == true)
        {
            NextYear nextYear = new NextYear();
            this.year = nextYear.getNextYear(year);
            //System.out.println(this.year);
        }
    }
}
