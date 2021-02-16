//import  java.util.Scanner;   
	
public class AirConditioner{

   	private boolean isOn;
   	private String  productName;
   	private int     temperature = 16;


	public void decreaseTemperature(){
	temperature--;
}	
	
	public String getProductName(){
	return productName;
}
	
	public int getTemperature(){
	return temperature;
} 
	
	public void increaseTemperature(){
	temperature++;
}	

	public boolean isOn(){
	return true;
}
	
	public void setOn(boolean yes){
	yes = true;
	isOn = yes;

}

	public void setProductName(String Name){
	productName = Name;
}

	public void setTemperature(int temp){
	temperature = temp;
}













}





























	