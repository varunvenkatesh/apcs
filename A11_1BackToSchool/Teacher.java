// TODO add comments
public class Teacher extends Person
{
    // TODO instance variables
    
    // TODO constructor
    
    // TODO methods

    /**
     * Returns a String representation of this class.
     * @return private instance data as a String
     */
    public String toString()
    {
        return super.toString() + ", subject: " + mySubject +
            ", salary: " + mySalary;
    }
}
