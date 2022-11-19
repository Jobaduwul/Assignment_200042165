package assignment2.DataCoupling;

public class RentalSystem
{
    public void reserve(Car car)
    {
        car.isAvailable = false;
    }
}
