package assignment1;

public class NextDayIn30
{
    public boolean needMonthChange;
    public int nextDay(int day)
    {
        if (day == 30)
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
