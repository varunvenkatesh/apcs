/**
 * 
 * Student class containing the most fundamental fields required for a "student"
 * 
 * @author ktirumala940
 * @version Oct 13, 2015
 * @author Period: 6
 * @author Assignment: A11_1BackToSchool
 *
 * @author Sources: Kushal Tirumala
 */
public class Student extends Person
{
    private String myIdNum; // Student Id Number

    private double myGPA; // grade point average


    /**
     * constructor for the student class
     * 
     * @param name
     *            name
     * @param age
     *            age
     * @param gender
     *            gender
     * @param idNum
     *            ID number
     * @param gpa
     *            GPA
     */
    public Student( String name, 
        int age, String gender, String idNum, double gpa )
    {
        // use the super class' constructor
        super( name, age, gender );

        // initialize what's new to Student
        myIdNum = idNum;
        myGPA = gpa;
    }


    /**
     * 
     * returns the ID Number of the student
     * 
     * @return id number
     */
    public String getIdNum()
    {
        return myIdNum;
    }


    /**
     * 
     * returns the GPA of the student
     * 
     * @return GPA
     */
    public double getGPA()
    {
        return myGPA;
    }


    /**
     * 
     * sets a new ID number for the student
     * 
     * @param idNum
     *            the new ID number
     */
    public void setIdNum( String idNum )
    {
        myIdNum = idNum;
    }


    /**
     * 
     * sets a new GPA for the student
     * 
     * @param gpa
     *            the new GPA to set
     */
    public void setGPA( double gpa )
    {
        myGPA = gpa;
    }


    /**
     * Returns a String representation of this class.
     * 
     * @return private instance data as a String
     */
    public String toString()
    {
        return super.toString() + 
                        ", student id: " + myIdNum + ", gpa: " + myGPA;
    }
}
