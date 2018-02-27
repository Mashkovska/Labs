package clothesshop;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import enums.ClothesType;

public class ClothesShopManager {

	private List<Clothes> clothes = new LinkedList<>();

	public void setClothes(List<Clothes> clothes) {
		this.clothes = clothes;
	}

	public List<Clothes> getClothes() {
		return this.clothes;
	}

	public ClothesShopManager() {
	}

	public ClothesShopManager(List<Clothes> clothes) {
		this.clothes = clothes;
	}

	public void addClothes(Clothes addClothes) {
		clothes.add(addClothes);
	}

	public List<Clothes> findByType(ClothesType ClothesType) {
		List<Clothes> result = new LinkedList<>();
		for (Clothes clothes : clothes) {
			if (clothes.getType() == ClothesType) {
				result.add(clothes);
			}
		}

		return result;
	}

	public void sortByBrend(List<Clothes> list) {
		list.sort((Clothes o1, Clothes o2) -> o2.getBrend().compareTo(o1.getBrend()));
	}

	public List<Clothes> getClothesList() {

		return clothes;

	}

	public void setClothesList(List<Clothes> clothesList) {
		this.clothes = clothesList;
	}
}
