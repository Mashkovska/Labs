package clothesshop;

import enums.ClothesBrend;
import enums.ClothesType;

public class Undercoat extends Clothes {

	private String trousersLength;
	private String skirtLength;

	public Undercoat(ClothesType type, ClothesBrend brend, String nameOfCloth, double price, double size, int amount,
			String sleeveLength, String dressLength) {
		super(type, brend, nameOfCloth, price, size, amount);
		this.trousersLength = trousersLength;
		this.skirtLength = skirtLength;

	}

	public String getTrousersLength() {
		return trousersLength;
	}

	public void setTrousersLength(String TrousersLength) {
		this.trousersLength = trousersLength;
	}

	public String getSkirtLength() {
		return skirtLength;
	}

	public void setSkistLength(String skirtLength) {
		this.skirtLength = skirtLength;
	}
}
