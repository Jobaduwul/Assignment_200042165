import assignment1.NextDateGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClass
{
    @Test
    public void DayTest()
    {
        NextDateGenerator nextDateGenerator = new NextDateGenerator(29, 3, 2022);
        nextDateGenerator.getNextDay(29,3,2022);
        assertEquals(nextDateGenerator.day, 30);
    }
    @Test
    public void MonthTest()
    {
        NextDateGenerator nextDateGenerator = new NextDateGenerator(31, 1, 2022);
        nextDateGenerator.getNextDay(31,1,2022);
        assertEquals(nextDateGenerator.month, 2);
    }
    @Test
    public void YearTest()
    {
        NextDateGenerator nextDateGenerator = new NextDateGenerator(31, 12, 2022);
        nextDateGenerator.getNextDay(31,12,2022);
        assertEquals(nextDateGenerator.month, 1);
        assertEquals(nextDateGenerator.day, 1);
        assertEquals(nextDateGenerator.year, 2023);
    }
    @Test
    public void LeapFebruaryTest()
    {
        NextDateGenerator nextDateGenerator = new NextDateGenerator(28, 2, 2020);
        nextDateGenerator.getNextDay(28, 2, 2020);
        assertEquals(nextDateGenerator.month, 2);
        assertEquals(nextDateGenerator.day, 29);
        assertEquals(nextDateGenerator.year, 2020);
    }
}
