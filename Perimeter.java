/*Q.1: Write a class with the name Perimeter using function overload that computes the perimeter of a square, a rectangle and a circle.
Formula:
Perimeter of a square=4*s
Perimeter of a rectangle=2*(l+b)
Perimeter of a circle=2*(22/7)*r
 */
package question1;
public class Perimeter 
{
    // Calculate perimeter of a square
    public double calculatePerimeter(double side)
    {
        return 4*side;
    }
    // Calculate perimeter of a rectangle
    public double calculatePerimeter(double length, double width)
    {
        return 2*(length+width);
    }
    // Calculate perimeter of a circle
    public double calculatePerimeter(double radius, boolean isCircle)
    {
        if(isCircle)
        {
            return 2*(22.0/7.0)*radius;
        }
        else
        {
            System.out.println("Invalid shape!");
            return -1;
        }
    }
    public static void main(String[] args)
    {
        Perimeter perimeterCalculator = new Perimeter();
        double squareSide=5.0;
        double rectangleLength=6.0;
        double rectangleWidth=4.0;
        double circleRadius=3.0;

        double squarePerimeter=perimeterCalculator.calculatePerimeter(squareSide);
        double rectanglePerimeter=perimeterCalculator.calculatePerimeter(rectangleLength, rectangleWidth);
        double circlePerimeter=perimeterCalculator.calculatePerimeter(circleRadius, true);

        System.out.println("Perimeter of the square: "+squarePerimeter);
        System.out.println("Perimeter of the rectangle: "+rectanglePerimeter);
        System.out.println("Perimeter of the circle: "+circlePerimeter);
    }
}
