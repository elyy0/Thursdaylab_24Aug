package question3;
public class Nurse extends Surgeon
{
	String currentRotation;
    Nurse(String name,String specialization,String surgeryType,String currentRotation)
    {
        super(name,specialization,surgeryType);
        this.currentRotation=currentRotation;
    }
    @Override
    void introduce()
    {
        System.out.println("Hi there, I'm "+name+", a nurse currently in rotation for "+currentRotation);
    }
    void assistInSurgery()
    {
        System.out.println("Assisting in "+surgeryType+" surgery...");
    }
}
