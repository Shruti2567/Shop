package shop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Shop shop = new Shop() ;
//		Cart cart= new Cart() ;
//		
//		Category cloths= new Category(1, "Cloths") ;
//		
//		shop.addCategory(cloths);
//		
//		
//		Item shirt = new Item(101, "Shirt", 500, 10) ;
//		Item Tshirt = new Item(102, "TShirt", 500, 10) ;
//		shop.addItemToShop(1, shirt);
//		shop.addItemToShop(1, Tshirt);
////		
////		cart.displayItems(shop, cloths);
//		
//		cart.additem(101, shop, 1);
//		cart.additem(101, shop, 1);
//		cart.removeItem(101, shop, 1);
//		
		
		Scanner scanner= new Scanner(System.in) ;
		System.out.println("Enter your choice");
		System.out.println("1. Add category to shop\n2. Add item in shop"
				+ "\n3. Remove item from shop\n4. Add item to cart \n5. Remove item from cart");
		int choice =scanner.nextInt() ;
		Shop shop= new Shop() ;
		Cart cart= new  Cart() ;
		switch (choice) 
		{
			case 1 -> 
			{
				 scanner.nextLine(); 
				System.out.println("Enter category name: ");
				String categoryName=scanner.nextLine() ;
				Category category= new Category() ;
				category.setName(categoryName);
				shop.addCategory(category); 
			}
			
			case 2 ->
			{
				System.out.println("Enter item details");
				Item item= new Item() ;
				int id= scanner.nextInt() ;
				System.out.println("Enter item id: ");
				item.setItemId(id);
				String name= scanner.nextLine() ;
				System.out.println("Enter item name: ");
				item.setName(name);
				double price= scanner.nextDouble() ;
				System.out.println("Enter item price: ");
				item.setPrice(price);
				int quantity= scanner.nextInt() ;
				System.out.println("Enter quantity of item: ");
				item.setQuantity(quantity);
				
				shop.addItemToShop(id, item);
				
			}
			
			case 3 ->
			{
				System.out.println("Enter category id: ");
				System.out.println("Enter item id:");
				int categoryid=scanner.nextInt() ;
				int itemId= scanner.nextInt() ;
				shop.removeItemFromShop(categoryid, itemId);
			}
			
			case 4->
			{
				System.out.println("Categories: "+shop.categories);
				
				System.out.println("Enter category id: ");
			    int categoryId = scanner.nextInt();  

			    shop.displayItemsByCategory(categoryId);

			    System.out.println("Enter item id to add to cart: ");
			    int itemId = scanner.nextInt();

			    cart.additem(itemId, shop, categoryId);
				
				
			}
			case 5 ->{
				System.out.println("Categories: "+shop.categories);
				
				System.out.println("Enter category id: ");
			    int categoryId = scanner.nextInt();  

			    shop.displayItemsByCategory(categoryId);

			    System.out.println("Enter item id to add to cart: ");
			    int itemId = scanner.nextInt();
			    cart.removeItem(itemId, shop, categoryId);
			}
		}
		
		
	}
}
