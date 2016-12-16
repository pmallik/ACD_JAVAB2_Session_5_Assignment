package Package1;

import java.util.Scanner;

//declaring Circle class  which will extend the abstract class Figure
public class Circle extends Figure {
	
   double dim1;
   double dim2;
     
   //implementing abstract method findArea defined in abstract class 
   
	 void findArea(double dim1,double dim2)
	 {
		double pie=3.14f;
	//		float area=2*pie*dim1;
		 
		 double area = pie * (dim1*dim1);
		 double roundOff = Math.round(area*100)/100;
		
		 System.out.println("The area of circle from finArea Circle "  + roundOff);
		 
	 }
	//implementing abstract method findPerimeter defined in abstract class 
	 
	 void findPerimeter(double dim1,double dim2)
	 {
		 double pie=3.14f;
		
		 double area = 2*pie*dim1;
		 double roundOff = Math.round(area*100)/100;
		 System.out.println("The perimeter of circle from findPerimeter "  + roundOff);
	 }
	 
	
	public static void main(String[] args) {
		
		 Circle c1 = new Circle();
		 Scanner s=new Scanner(System.in);//Creating Object of Scanner
		 System.out.println("Enter radius of a circle");
		 c1.dim1=s.nextFloat();
		 c1.dim2=0;
		 
		//calling  method  defined in abstract class 
		
         c1.findArea(c1.dim1,c1.dim2);
         c1.findPerimeter(c1.dim1,c1.dim2);
         
	}

}
