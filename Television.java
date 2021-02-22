
public class Television{
	
	private String brandName;
	private String colour;
	private int length;
	private boolean isOn;
	private int volume;
	private int channel;

	public Television(String name, String colour, int length, boolean tvOn, int volume, int channel){
	
				brandName = name;
				this.colour = colour;
				this.length = length;
				this.isOn = tvOn;
				this.volume = volume;
				this.channel = channel;
		 		
				}

	public String getbrandName(){
	return brandName;
	}
	
	public String getColour(){
	return colour;
	}

	public int getlength(){
	return length;
	}

	public boolean IsOn(){
	return isOn;
	}
	
	public void setIsOn(boolean yes){
	this.isOn = yes;
	}

	public int getVolume(){
	return volume;
	}
		
	public void setVolume(int volume){
	if(volume >= 1 && volume <= 20){
	this.volume = volume;
	}
	if(volume > 20){
	System.out.print("Volume is too high");	
	}
	}
	

	public void increaseVolume(int volume){
		if(volume >= 1 && volume <= 19){
		volume++;
		}
		}
	
	public void decreaseVolume(int volume){
		if(volume >=2 && volume <= 20){
		volume--;
		}	
		}

	public void setChannel(int channel){
	this.channel = channel;
	}
		
	public int getchannel(){
	return channel;
	}

}
