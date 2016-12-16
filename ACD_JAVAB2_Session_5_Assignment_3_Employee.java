package Package1;

// Declaring parent class instance variable get and set methods of properties and methods
public  class Employee {
	int empId;
	String empName;
	int total_leaves;
	double total_salary;
	 void calculate_balance_leaves()
	 {
	 }
	public String getEmpName()
    {
        return empName;
    }
	
	public int getEmpId()
    {
        return empId;
    }
	public int getTotalleaves()
    {
        return total_leaves;
    }
	public double getTotalSalary()
    {
        return total_salary;
    }
	

	    public void setEmpName(String newValue){
	        empName = newValue;
	    }

	    public void setEmpId(int newValue){
	    	empId = newValue;
	    }

	    public void settotalleaves(int newValue){
	        total_leaves = newValue;
	    }

	    public void TotalSalary(double newValue){
	        total_salary = newValue;
	    }
	 
	
	 boolean avail_leave(int no_of_leaves, char type_of_leave)
	 {
		 return false;
	 }
	 

	
	 void calculate_salary()
	 {
	 }
	 
}
