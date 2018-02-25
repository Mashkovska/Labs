package clothesshop;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ClothesShopManager {

	private List <Clothes> clothes = new LinkedList<>();
	
	public void setClothes(List<Clothes> clothes) {
		this.clothes = clothes;
	}
	
	public List<Clothes> getClothes() {
		return this.clothes;
	}
	public ClothesShopManager() {}
	
	
	public ClothesShopManager(List <Clothes> clothes) {
		this.clothes = clothes;
	}
	
	public void addClothes(Clothes addClothes) {
		clothes.add(addClothes);
	}
	
	
	
	
	public List<Clothes> searchClothesByType(ClothesType typeToFind){
        List<Clothes> result = new LinkedList<>();
        for (Clothes clothes : clothes) {
        	Object typeToFind2 = null;
            if (clothes.getType().equals(typeToFind2)) {
                result.add(clothes);
            }

        }
        return result;
   }
	
	public List<Clothes> getClothesList(){
		
		return clothes;
		
	}
	
	public void setClothesList(List<Clothes> clothesList) {
		this.clothes = clothesList;
	}
}


	

	


