package question3;
public class Main
{
	public static void main(String[] args)
	{
		//Creating the object of Surgeon class and passing the values in parameter for parameterized constructor
        Surgeon surgeon=new Surgeon("Alice","Surgeon","Neuro");
        //Creating the object of Nurse class and passing the values in parameter for parameterized constructor
        Nurse nurse=new Nurse("Bob","Intern","Ortho","Orthopedics");
        //calling the methods
        surgeon.introduce();
        surgeon.performSurgery();
        nurse.introduce();
        nurse.assistInSurgery();
    }
}
