package clothesshop;

import enums.ClothesBrend;
import enums.ClothesType;

public class Whiteness extends Clothes {

	private String thinLength;
	private String breastLength;

	public Whiteness(ClothesType type, ClothesBrend brend, String nameOfCloth, double price, double size, int amount,
			String sleeveLength, String dressLength) {
		super(type, brend, nameOfCloth, price, size, amount);
		this.thinLength = thinLength;
		this.breastLength = breastLength;

	}

	public String getThinLength() {
		return thinLength;
	}

	public void setThinLength(String ThinLength) {
		this.thinLength = thinLength;
	}

	public String getBreastLength() {
		return breastLength;
	}

	public void setBreastLength(String breastLength) {
		this.breastLength = breastLength;
	}

}
