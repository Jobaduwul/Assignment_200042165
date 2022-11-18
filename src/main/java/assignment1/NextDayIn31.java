package assignment1;

public class NextDayIn31
{
    public boolean needMonthChange;
    public int nextDay(int day)
    {
        if (day == 31)
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
