package clothesshop;

import java.util.ArrayList;
import java.util.Comparator;


public class Clothes {

	private ClothesType type;
	private ClothesBrend brend;
	private String nameOfCloth;
	double price;
	double size;
	private int amount;
	
	
	public Clothes(ClothesType type, ClothesBrend brend, String nameOfCloth, double price, double size, int amount) {
		setClothesType(type);
		setClothesBrend(brend);
		setNameOfCloth(nameOfCloth);
		setPrice(price);
		setSize(size);
		setAmount(amount);
		
	}


	
	public ClothesType getType() {
		return type;
	}
	
	public void setClothesType(ClothesType type) {
		amount+= 1;
		this.type = type;
	}
	
	public ClothesBrend getBrend() {
		return brend;
	}
	
	public void setClothesBrend(ClothesBrend brend) {
		this.brend = brend;
	}
	 
	public  String getNameOfCloth() {
		return nameOfCloth;
	}
	
	public void  setNameOfCloth(String nameOfCloth) {
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
	
		
	    
}
