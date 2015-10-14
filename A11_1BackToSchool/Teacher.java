/**
 * 
 * The Teacher class, containing all the required fields/methods for a "teacher"
 *
 * @author ktirumala940
 * @version Oct 13, 2015
 * @author Period: 6
 * @author Assignment: A11_1BackToSchool
 *
 * @author Sources: Kushal Tirumala
 */
public class Teacher extends Person
{
    /**
     * subject the teacher teaches
     */
    private String subject;

    /**
     * salary of the teacher
     */
    public double salary;


    /**
     * constructor for the Teacher class
     * 
     * @param myName
     *            name
     * @param myAge
     *            age
     * @param myGender
     *            gender
     * @param subject
     *            subject the teacher is teaching
     * @param salary
     *            salary of the teacher
     */
    public Teacher( String myName, 
        int myAge, String myGender, String subject, double salary )
    {
        super( myName, myAge, myGender );
        this.subject = subject;
        this.salary = salary;
    }


    /**
     * returns the current area the teacher teaches
     * 
     * @return the area of study
     */
    public String getSubject()
    {
        return subject;
    }


    /**
     * 
     * sets a new area of study for the teacher
     * 
     * @param newSubject
     *            new area of study to teach
     */
    public void setSubject( String newSubject )
    {
        subject = newSubject;
    }


    /**
     * 
     * returns the current salary of the teacher
     * 
     * @return the salary of the teacher
     */
    public double getSalary()
    {
        return salary;
    }


    /**
     * 
     * sets a new salary for the teacher
     * 
     * @param newSalary
     *            new salary for the teacher to set
     */
    public void setSalary( double newSalary )
    {
        salary = newSalary;
    }


    /**
     * Returns a String representation of this class.
     * 
     * @return private instance data as a String
     */
    public String toString()
    {
        return super.toString() + 
                        ", subject: " + subject + ", salary: " + salary;
    }
}
