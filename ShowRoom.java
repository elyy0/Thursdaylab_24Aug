/* Q.2: Design a class named ShowRoom with the following description: Instance variables/data members:
String name: to store the name of the customer.
long mobno: to store the mobile number of the customer.
double cost: to store the cost of the items purchased. 
double dis: to store the discount amount.
double amount: to store the amount to be paid after discount.
Member methods:
ShowRoom(): default constructor to initialize data members.
void input(): to input customer name, mobile number, cost.
void calculate(): to calculate discount on the cost of purchased items, based on the following criteria:
COST 							DISCOUNT (IN PERCENTAGE) 
> <=to Rs. 10000                       	5%
> Rs.10000 <=Rs.20000               	10%
> Rs.20000 <=Rs.35000              		15%
> Rs.35000 								20%
 void display(): to display customer name, mobile number, amount to be paid after discount.
 Write a main() method to create an object of the class and call the above member methods
*/
package question2;
import java.util.Scanner;
public class ShowRoom 
{
	String name;
    long mobno;
    double cost;
    double dis;
    double amount;
    //Default constructor which is used to initialization of variables.
    ShowRoom()
    {
        name="";
        mobno=0;
        cost=0;
        dis=0;
        amount=0;
    }
    //taking input from the user like name, number, and final cost of purchased item.
    void input()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter customer name: ");
        name=scanner.nextLine();
        System.out.print("Enter mobile number: ");
        mobno=scanner.nextLong();
        System.out.print("Enter cost of purchased items: ");
        cost=scanner.nextDouble();
    }
    void calculate()
    {
        //if the total amount of purchased item is equals to or below 10000 give 5% discount.
    	if(cost<=10000)
        {
            dis=cost*0.05;
        }
    	//if the total amount of purchased item is equals to or below 20000 give 10% discount.
        else if(cost<=20000)
        {
            dis=cost*0.10;
        }
    	//if the total amount of purchased item is equals to or below 35000 give 15% discount.
        else if(cost<=35000)
        {
            dis=cost*0.15;
        }
    	//if the total amount of purchased item is above the 35000 give 20% discount.
        else
        {
            dis=cost*0.20;
        }
        amount=cost-dis;
    }
    //displaying the name, mobile number and discounted amount.
    void display() 
    {
        System.out.println("Customer Name: "+name);
        System.out.println("Mobile Number: "+mobno);
        System.out.println("Amount to be paid after discount: "+amount);
    }
}
