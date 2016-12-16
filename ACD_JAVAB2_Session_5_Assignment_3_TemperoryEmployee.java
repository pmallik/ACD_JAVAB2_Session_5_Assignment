package Package1;

// creating temperory employee class by extending parent employee class

public class TemperoryEmployee extends Employee{
	void calculate_balance_leaves(int totalleave)
	{
		int leavetaken=5;
		int leave_balance = totalleave-leavetaken;
		System.out.println("Leave Balance "  + leave_balance); 
		
	}
	
	 boolean avail_leave(int no_of_leaves, char type_of_leave)
	{
		return false;
	}
	 //calculate overriding method to get calculated salary
	
	void calculate_salary(double totalsalary)
	{
	
		System.out.println("Total Salary "  + totalsalary); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TemperoryEmployee emp1=new TemperoryEmployee();
		
		// setting the value of temperory employee
		
		emp1.setEmpId(1);
		emp1.setEmpName("Temperory Employee1");
		emp1.TotalSalary(70000);
		emp1.settotalleaves(20);
		
		System.out.println("Employee Name: "  + emp1.getEmpId() + " " +  emp1.getEmpName()); 
		System.out.println("Type: Temperory " ); 
		
		// calculate the salary and leave balance by calling methods of the class
		
		emp1.calculate_salary(emp1.getTotalSalary());
		emp1.calculate_balance_leaves(emp1.getTotalleaves());
			
		 
		 
		 
			
		

	}

}
