import java.util.Date;


public class TV {

	double inc;
	String colour;
	boolean on_off;
	double price;
	String brand;
	int volume;
	int maxVolue;
	int channel;
	int maxChannel;
	Date date;
	
	public TV() {
		inc = 24;
		colour = "Black";
		on_off = false;
		price = 1000;
		brand = "ARCELIK";
		volume = 10;
		maxVolue = 50;
		channel = 1;
		maxChannel = 100;
		date = new Date();
	}
	
	public TV(String b) {
		inc = 24;
		colour = "Black";
		on_off = false;
		price = 1000;
		brand = b;
		volume = 10;
		maxVolue = 50;
		channel = 1;
		maxChannel = 100;
		date = new Date();
	}

	public double getInc() {
		return inc;
	}

	public void setInc(double inc) {
		this.inc = inc;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public boolean isOn_off() {
		return on_off;
	}

	public void setOn_off(boolean on_off) {
		this.on_off = on_off;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getMaxVolue() {
		return maxVolue;
	}

	public void setMaxVolue(int maxVolue) {
		this.maxVolue = maxVolue;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getMaxChannel() {
		return maxChannel;
	}

	public void setMaxChannel(int maxChannel) {
		this.maxChannel = maxChannel;
	}
	
	public void onOff() {
		 on_off = !on_off;
	}
	
	public void volumeUp() {
		if ( volume < maxVolue ) {
			volume++;
		}
	}
	
	public void volumeDown() {
		if (volume > 0) {
			volume--;
		}
	}
	
	public void channelUp() {
		if ( channel < maxChannel ) {
			channel++;
		}
	}
	
	public void channelDown() {
		if (channel > 0) {
			channel--;
		}
 	}
	
}
