package clothesshop;

import enums.ClothesBrend;
import enums.ClothesType;

public abstract class Clothes {

	private ClothesType type;
	ClothesBrend brend;

	String nameOfCloth;
	double price;
	double size;
	int amount;
	static String length;

	public Clothes(ClothesType type, ClothesBrend brend, String nameOfCloth, double price, double size, int amount) {

		setType(type);
		setNameOfCloth(nameOfCloth);
		setPrice(price);
		setSize(size);
		setAmount(amount);
		setLength(length);
		setBrend(brend);

	}

	@Override
	public String toString() {
		return "Name = " + nameOfCloth + " Type = " + type + " Brend = " + brend + " Amount = " + amount + " Price = "
				+ price;
	}

	public ClothesType getType() {
		return type;
	}

	public ClothesBrend getBrend() {
		return brend;
	}

	public void setBrend(ClothesBrend brend) {
		this.brend = brend;
	}

	public String getNameOfCloth() {
		return nameOfCloth;
	}

	public void setNameOfCloth(String nameOfCloth) {
		this.nameOfCloth = nameOfCloth;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public void setType(ClothesType type) {
		this.type = type;
	}

}
