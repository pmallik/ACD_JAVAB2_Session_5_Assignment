package Package1;

public class PermanentEmp extends Employee {
	int paid_leave, sick_leave, casual_leave;
	double basic, hra,pfa;
	
	void print_leave_details(int totalleaves)
	{
		System.out.println("Total leaves "  + totalleaves); 
	}
	
	void calculate_balance_leaves(int totalleave,int paidleave,int sickleave,int casualleave)
	{
		int leave_balance = totalleave-(paidleave+sickleave+casualleave);
		System.out.println("Leave Balance "  + leave_balance); 
		
	}
	
	 boolean avail_leave(int no_of_leaves, char type_of_leave)
	{
		return false;
	}
	
	void calculate_salary(double totalsalary,double basic)
	{
	//	Pf = 12% of basic
	   double pfa = (12/100) * basic;
		double hra = 0.5 * basic;
			//	hra = 50% of basic
		totalsalary = basic + (hra - pfa);
		
	 System.out.println("Total Salary "  + totalsalary); 
		
	}
	public int getPaid_leave()
	{
        return paid_leave;
    }

    

    public int getSick_leave()
    {
        return sick_leave;
    }
    public double getbasic()
    {
        return basic;
    }
    public double gethra()
    {
        return hra;
    }
    public double getpfa()
    {
        return pfa;
    }
    public int getCasual_leave()
    {
        return casual_leave;
    }

    

    public void setSickLeave(int newValue){
    	sick_leave = newValue;
    }
    public void setPaidLeave(int newValue){
    	paid_leave = newValue;
    }
    public void setCasualleave(int newValue)
    {
    	casual_leave = newValue;
    }
    
    public void setBasic(double newValue){
        basic = newValue;
    }
   

   
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermanentEmp emp1=new PermanentEmp();
		emp1.setEmpId(1);
		emp1.setEmpName("XYZ");
		emp1.TotalSalary(50000);
		emp1.settotalleaves(20);
		emp1.setCasualleave(2);
		
		emp1.setBasic(30000);
		emp1.setSickLeave(1);
		
		System.out.println("Employee Name: "  + emp1.getEmpId() + " " +  emp1.getEmpName()); 
		System.out.println("Type: Permanent " ); 
		emp1.calculate_balance_leaves(emp1.getTotalleaves(),emp1.getPaid_leave(),emp1.getSick_leave(),emp1.getCasual_leave());
		emp1.print_leave_details(emp1.getTotalleaves());
		emp1.calculate_salary(emp1.getTotalSalary(),emp1.getbasic());
		
	

	}

}
