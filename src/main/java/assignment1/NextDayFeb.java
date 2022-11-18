package assignment1;

public class NextDayFeb
{
    public boolean needMonthChange;
    public int nextDay(int day)
    {
        if (day == 28)
        {
            needMonthChange = true;
            return 1;
        }
        else
        {
            needMonthChange = false;
            day++;
            return day;
        }
    }
}
