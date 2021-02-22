
public class Employee{

	private String firstName;
	private String lastName;
	private double salary;

	public Employee (String firstName, String lastName, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		}

	public void setFirstName(String name) {
		this.firstName = name;
		}
	
	public  String getFirstName(){
		return firstName;
		}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
		}
	
	public String getLastName(){
		return lastName;
		}	
	
	public void setSalary(double salary){
		if(salary > 0) {
		this.salary = salary;
		}
		}
	
	public double getSalary(){
		return salary;
		}
	
	public void increasedSalary(double rate){
		salary += (rate/100) * salary;
		}
		

}
	
	 