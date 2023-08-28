/*Q.3: Create a program in java to implement multilevel inheritance and hierarchical inheritance .
Take classes like : Doctor , Surgeon and Nurse
Create methods and show method overriding.
 */
package question3;
public class Doctor
{
	String name;
	String specialization;
	Doctor(String name,String specialization)
	{
		this.name = name;
		this.specialization=specialization;
	}
	void introduce()
	{
		System.out.println("Hello, I'm Dr. "+name+" and I'm a "+specialization);
	}
}
