/**
 * 
 * Person class representing all the required fields/methods for a "person"
 *
 * @author ktirumala940
 * @version Oct 13, 2015
 * @author Period: 6
 * @author Assignment: A11_1BackToSchool
 *
 * @author Sources: Kushal Tirumala
 */
public class Person
{
    private String myName; // name of the person

    private int myAge; // person's age

    private String myGender; // 'M' for male, 'F' for female


    /**
     * constructor for the Person class
     * 
     * @param name
     *            name of person
     * @param age
     *            age of person
     * @param gender
     *            gender of person
     */
    public Person( String name, int age, String gender )
    {
        myName = name;
        myAge = age;
        myGender = gender;
    }


    /**
     * 
     * returns the current name of the student
     * 
     * @return the name of the student
     */
    public String getName()
    {
        return myName;
    }


    /**
     * 
     * returns the current age of the student
     * 
     * @return the age of the student
     */
    public int getAge()
    {
        return myAge;
    }


    /**
     * 
     * returns the current gender of the student
     * 
     * @return the gender of the student
     */
    public String getGender()
    {
        return myGender;
    }


    /**
     * 
     * sets a new name for the student #identitycrisis
     * 
     * @param name
     *            the new name for the student
     */
    public void setName( String name )
    {
        myName = name;
    }


    /**
     * 
     * Sets a new age for the student
     * 
     * @param age
     *            the new age the student is
     */
    public void setAge( int age )
    {
        myAge = age;
    }


    /**
     * 
     * Sets a new gender for the student
     * 
     * @param gender
     *            new gender for the student to be
     */
    public void setGender( String gender )
    {
        myGender = gender;
    }


    /**
     * Returns a String representation of this class.
     * 
     * @return private instance data as a String
     */
    public String toString()
    {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }
}