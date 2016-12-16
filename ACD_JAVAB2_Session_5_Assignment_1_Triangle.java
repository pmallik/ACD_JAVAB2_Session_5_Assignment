package Package1;

import java.util.Scanner;

//declaring Triangle class  which will extend the abstract class Figure

public class Triangle extends Figure {
	double dim1;
	double dim2;
	//implementing abstract method findArea defined in abstract class 
    
	 void findArea(double dim1,double dim2)
	 {
		
		 double area = (dim1* dim2)/2;
		
		
		 System.out.println("The area of Triangle "  + area);
		 
	 }
		//implementing abstract method findPerimeter defined in abstract class 
	 
	 void findPerimeter(double dim1,double dim2)
	 {
		
		 double area = 2*dim1+dim2;
		
		 System.out.println("The perimeter of Triangle "  + area);
	 }
	 

	public static void main(String[] args) {
	
		  
	      Triangle t1 = new Triangle();
	        
	         Scanner s=new Scanner(System.in);//Creating Object of Scanner
			 System.out.println("Enter width of a Triangle");
			 t1.dim1=s.nextFloat();
			 System.out.println("Enter height of a Triangle");
			 t1.dim2=s.nextFloat();
			 
			//calling  method  defined in abstract class 
			 t1.findArea(t1.dim1,t1.dim2);
			 t1.findPerimeter(t1.dim1,t1.dim2);

	}

}
