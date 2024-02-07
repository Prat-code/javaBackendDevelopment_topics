package lec2_gfg;

public   interface flight_details {
	
	//interface class
	// all methos are public and abstract
	String getflightName();
	int getfrlightprize();
	int getavailableseats();
	
	//after java 8 n 7 we can have default,static,private methods in interface class
	default double getpersonluggageCount() {
		return 12*90;
	}
	
	static int personcount() {
		return 10;
	}
	
	private int personphnno() {
		return 1293;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
