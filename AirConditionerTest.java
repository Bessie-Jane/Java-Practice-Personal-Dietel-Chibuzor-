
public class AirConditionerTest{

	public static void main(String[] args){

	AirConditioner coolAirConditioner = new AirConditioner();

	coolAirConditioner.setProductName("Bessie's AC");
	coolAirConditioner.getProductName();
	coolAirConditioner.increaseTemperature();
	coolAirConditioner.decreaseTemperature();
	coolAirConditioner.setTemperature(35);
	coolAirConditioner.getTemperature();
	coolAirConditioner.setOn(true);
	coolAirConditioner.isOn();
	

	String newAc = coolAirConditioner.getProductName();
	System.out.printf("The name of the AC is %s%n", newAc);

	int newTemp = coolAirConditioner.getTemperature();
	System.out.printf("The AC temperature is %d", newTemp);







}



}