// display infor by calling
package companyDetails;

public class DispTwoEmpDetailss 
{

	public static void main(String[] args) 
	{
		 
				Employee emp1 = new Employee();	
				Employee emp2 = new Employee();
	
				emp1.readData();
				emp2.readData();
				
				emp1.printData();
				emp2.printData();
					
				System.out.println(Employee.company);
				
	

	}

}
