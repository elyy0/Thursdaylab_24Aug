package question3;
public class Surgeon extends Doctor
{
	String surgeryType;
	//Parameterized constructor
    Surgeon(String name,String specialization,String surgeryType)
    {
        super(name,specialization);
        this.surgeryType=surgeryType;
    }
    //overriding the introduce method from the parent class
    @Override
    void introduce()
    {
        System.out.println("Greetings, I'm Dr. "+name+", a "+specialization+" surgeon specialized in "+surgeryType+" surgery");
    }
    void performSurgery() 
    {
        System.out.println("Performing "+surgeryType+" surgery...");
    }
}
