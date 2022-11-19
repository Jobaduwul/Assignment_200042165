package assignment2.StampCoupling;

public class CustomerManager
{
    public String getDetails(Customer customer)
    {
        return customer.name+" "+customer.email+" "+customer.number;
        //customer password not used
    }
}
