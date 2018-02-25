package clothesshop;

import java.util.Scanner;


public class Main {
	
	 public static void main(String[] args) {
		 
		 ClothesShopManager shop = new ClothesShopManager();
		 
		 shop.addClothes(new Clothes (ClothesType.SOLEMN,ClothesBrend.BERSHKA,"Trousers",32,345,56));
		 shop.addClothes(new Clothes(ClothesType.CASUAL,ClothesBrend.PULLBEAR,"T-shirt",23,45,67));
		 shop.addClothes(new Clothes (ClothesType.OFFICIAL,ClothesBrend.ZARA,"Skirt",32,345,56));
		 shop.addClothes(new Clothes(ClothesType.SOLEMN,ClothesBrend.BERSHKA,"Dress",23,45,67));
		 shop.addClothes(new Clothes (ClothesType.SOLEMN,ClothesBrend.PULLBEAR,"Shirt",32,345,56));
		 shop.addClothes(new Clothes(ClothesType.OFFICIAL,ClothesBrend.ZARA,"Blouse",23,45,67));
		 
		 boolean menu = true;
		 while(menu) {
			 
			 System.out.println("Menu");
	            System.out.println(" 1 - Print list of clothes;");
	            System.out.println(" 2 - Search by type of clothes;");
	            System.out.println(" 3 - Print list of clothes sorted by brend;");
	            System.out.println(" 4 - Exit;");
	            
	            Scanner in = new Scanner(System.in);
	            int num = in.nextInt();
	            //in.close();
	            switch (num) {
	                case 1: {
	                    System.out.println(shop.getClothes().toString());
	                    break;
	                }
                    
	                case 2: {
	                	 Scanner scanner = new Scanner(System.in);
	                     System.out.println("Enter the type: ");
	                     String type = scanner.nextLine();
	                     
	                     if (type.equals("SOLEMN") || type.equals("Solemn") || type.equals("solemn")) {
	                         System.out.println(shop.searchClothesByType(ClothesType.SOLEMN).toString());
	                          }
	                     else if (type.equals("OFFICIAL") || type.equals("Official") || type.equals("official"));{
	                    	 System.out.println(shop.searchClothesByType(ClothesType.OFFICIAL).toString());
	                     }
	                      if (type.equals("CASUAL") || type.equals("Casual") || type.equals("casual"));{
	                    	 System.out.println(shop.searchClothesByType(ClothesType.CASUAL).toString());
	                    	 
	                     }
	                      break;
	                     }
	                
	                
	               
	                
	                
	                case 4 :
	                default: {
	                    System.out.println("Exited programm");
	                    menu = false;
	                    break;
	                }
	                
		 }
	 }

	 }
}
