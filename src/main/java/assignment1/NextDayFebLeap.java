package assignment1;

public class NextDayFebLeap
{
    public boolean needMonthChange;
    public int nextDay(int day)
    {
        if (day == 29)
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
