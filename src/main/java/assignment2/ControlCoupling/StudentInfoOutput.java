package assignment2.ControlCoupling;

public class StudentInfoOutput
{
    String getStudentInfo(Student student, String infoType)
    {
        String returnString = null;
        if(infoType == "name")
        {
            returnString = student.name;
        }
        else if (infoType == "ID")
        {
            returnString = student.ID;
        }
        return returnString;
    }
}
