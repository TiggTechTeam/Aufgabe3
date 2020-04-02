//Jahreiss, Kevin; Karasz, David; Urban, Melanie; 
public class Day {
	
	private int temp = 0;
	private String weather = "";
	
	public Day (String weather, int temp) {		
		this.weather = weather;
		this.temp = temp;		
	}
	
	public void setTemp(int i) {
		temp = i;
	}
	
	public void setWeather(String i) {
		weather = i;
	}
	
	public int getTemp() {
		return temp;
	}
	
	public String getWeather() {
		return weather;
	}
	
	public String toString() {
		String str = " | " + weather + " mit " + temp + "C |";
		return str;
	}

}
