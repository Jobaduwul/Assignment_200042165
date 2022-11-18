package assignment1;

public class NextMonth
{
    public boolean needNextMonth;
    public boolean needNextYear;
    public int getNextMonth(int month)
    {
            if(month == 12)
            {
                needNextYear = true;
                month = 1;
            }
            else
            {
                needNextYear = false;
                month++;
            }
        return month;
    }
}
