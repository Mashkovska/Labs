package clothesshop;

import enums.ClothesBrend;
import enums.ClothesType;

public class Outwear extends Clothes {

	private String sleeveLength;
	private String dressLength;

	public Outwear(ClothesType type, ClothesBrend brend, String nameOfCloth, double price, double size, int amount,
			String sleeveLength, String dressLength) {
		super(type, brend, nameOfCloth, price, size, amount);
		this.dressLength = dressLength;
		this.sleeveLength = sleeveLength;

	}

	public String getSleeveLength() {
		return sleeveLength;
	}

	public void setSleeveLength(String SleeveLength) {
		this.sleeveLength = sleeveLength;
	}

	public String getDressLength() {
		return dressLength;
	}

	public void setDressLength(String dressLength) {
		this.dressLength = dressLength;
	}

	
}
