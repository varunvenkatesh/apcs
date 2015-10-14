/**
 * 
 * CollegeStudent class - represents the object for a "college student" with the
 * appropriate fields
 *
 * @author ktirumala940
 * @version Oct 13, 2015
 * @author Period: 6
 * @author Assignment: A11_1BackToSchool
 *
 * @author Sources: Kushal Tirumala
 */
public class CollegeStudent extends Student
{
    private String major;

    private int year;


    /**
     * constructor for the College Student class
     * 
     * @param myName
     *            name
     * @param myAge
     *            age
     * @param myGender
     *            gender
     * @param myIdNum
     *            ID number
     * @param myGPA
     *            GPA of student
     * @param year
     *            year of graduation
     * @param major
     *            major of college student
     */
    public CollegeStudent(
        String myName,
        int myAge,
        String myGender,
        String myIdNum,
        double myGPA,
        int year,
        String major )
    {
        super( myName, myAge, myGender, myIdNum, myGPA );
        this.year = year;
        this.major = major;
    }


    /**
     * returns the current major of the college student
     * 
     * @return the major of the college student
     */
    public String getMajor()
    {
        return major;
    }


    /**
     * sets the major of a college student to a new area of study
     * 
     * @param newMajor
     *            the new major to be set
     */
    public void setMajor( String newMajor )
    {
        major = newMajor;
    }


    /**
     * 
     * returns the year of graduation of the college student
     * 
     * @return the year of graduation
     */
    public int getYear()
    {
        return year;
    }


    /**
     * 
     * Sets a new year of graduation for the student
     * 
     * @param newYear
     *            the new year of graduation
     */
    public void setYear( int newYear )
    {
        year = newYear;
    }


    /**
     * Returns a String representation of this class.
     * 
     * @return private instance data as a String
     */
    public String toString()
    {
        return super.toString() + ", year: " + year + ", major: " + major;
    }
}
