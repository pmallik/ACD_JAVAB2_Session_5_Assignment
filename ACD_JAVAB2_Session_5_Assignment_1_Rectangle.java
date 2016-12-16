package Package1;

import java.util.Scanner;

//declaring rectangle class  which will extend the abstract class Figure

public class Rectangle extends Figure{
	double dim1;
	double dim2;
	//implementing abstract method findArea defined in abstract class 
	 void findArea(double dim1,double dim2)
	 {
		
	
		 
		 
		 double area = dim1*dim2;
		
		
		 System.out.println("The area of rectangle from finArea  "  + area);
		 
	 }
		//implementing abstract method findPerimeter defined in abstract class 
	 
	 
	 void findPerimeter(double dim1,double dim2)
	 {
		 
		 
		 double area = 2*dim1+2*dim2;
		 System.out.println("The perimeter of rectangle from findPerimeter "  + area);
	 }
	 

	public static void main(String[] args) {
		
		
		
		Rectangle r1 = new Rectangle();
        
         Scanner s=new Scanner(System.in);//Creating Object of Scanner
		 System.out.println("Enter length of a rectangle");
		 r1.dim1=s.nextFloat();
		 System.out.println("Enter length of a rectangle");
		 r1.dim2=s.nextFloat();
		//calling  method  defined in abstract class 
		 r1.findArea(r1.dim1,r1.dim2);
         r1.findPerimeter(r1.dim1,r1.dim2);
		 

	}

}
