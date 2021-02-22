
public class Date{

	private int month;
	private int day;
	private int year;

	public Date(int newMonth, int newDay, int newYear){
		month = newMonth;
		day = newDay;
		year = newYear;	
		}
			
	public int getMonth(){
		return month;
		} 

	public void setMonth( int newMonth){
		month = newMonth;
		}

	public int getDay(){
		return day;
		}

	public void setDay(int newDay){
		day = newDay;
		}

	public int getYear(){
		return year;
		}

	public void setYear(int newYear){
		year = newYear;
		}
	
	public String displayDate(int month, int day, int year){
		return (month + "/" + day + "/" + year); 
		}
	
} 