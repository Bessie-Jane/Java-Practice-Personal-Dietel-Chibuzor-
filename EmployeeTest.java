public class EmployeeTest{

	public static void main(String[] args){
		
		Employee goodEmployees = new Employee("Joy", "Bessie", 150000);
		
		Employee hardWorkingEmployees = new Employee("Anthony", "Solomon", 200000);	

		goodEmployees.setFirstName("Grace");
		
		// goodEmployees.getFirstName()

		goodEmployees.setLastName("Super");
	
		System.out.printf ("My Favourite Employees Firstname is %s%nAnd Her Lastname is %s%n", goodEmployees.getFirstName(), goodEmployees.getLastName());
		

		// goodEmployees.getLastName()

		goodEmployees.setSalary(300000);

		System.out.println("Her Salary is " + goodEmployees.getSalary());
		
		// goodEmployees.getsalary()

		goodEmployees.increasedSalary(10.0);

		System.out.println("After a ten percent increase her new salary will be " + goodEmployees.getSalary());

		// goodEmployees.getsalary()
		
		

		hardWorkingEmployees.setFirstName("Iyanu");

		System.out.println("While my second favourite employee's first name is " + hardWorkingEmployees.getFirstName());
		
		//hardWorkingEmployees.setFirstName

		hardWorkingEmployees.setLastName("Oyatoye");

		System.out.println("And her last name is " + hardWorkingEmployees.getLastName());
		
		//hardWorkingEmployees.getLastName

		hardWorkingEmployees.setSalary(500000);

		System.out.println("Her Salary is " + hardWorkingEmployees.getSalary());

		// hardWorkingEmployees.getsalary()

		hardWorkingEmployees.increasedSalary(10.0);

		System.out.println("Also, after a ten percent increase her new salary will be " + hardWorkingEmployees.getSalary());

		// hardWorkingEmployees.getsalary()

		

		


}
}