package entities;

public class Bill {
	
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	public double couvert() {
		if (feeding() <= 30.0) {
			return 4.0;
		}
		else {
			return 0.0;
		}
	}	
	
	public double feeding() {
		double sum = beer * 5.0 + softDrink * 3.0 + barbecue * 7.0;
		return sum;
	}
	
	public double ticket() {
		if (gender == 'F') {
			return 8.0;
		}
		else {
			return 10.0;
		}
	}	
	
	public double total() {
		double sum = couvert() + feeding() + ticket();
		return sum;
	}
}
