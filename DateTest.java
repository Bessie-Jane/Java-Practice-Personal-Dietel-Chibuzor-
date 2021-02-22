
public class DateTest{
	
	public static void main(String[] args){
	
	Date myDate = new Date(01, 01, 2000);	

	System.out.println( myDate.getMonth()  + " is the first month, " + 
				"and " + myDate.getDay() + " is the first day of " +
					" the year " + myDate.getYear());

	myDate.setMonth(2);
	myDate.setDay(8);
	myDate.setYear(2021);
	
	System.out.println("New month is " + myDate.getMonth() +  
				" while new day is " + myDate.getDay() +   
					" and new year is " + myDate.getYear());
	

	String fullDateDisplay = myDate.displayDate(8, 1, 2000);			
	
	System.out.println("The date could also be displayed with a slash as: " + fullDateDisplay);
	
	}

	} 