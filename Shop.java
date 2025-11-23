package shop;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shop {

	Map<Integer	,Category> categories= new HashMap<>() ;
	
	//add category 
	public void addCategory(Category category)
	{
		categories.put(category.getCategoryId(), category) ;
		System.out.println(category.getName()+" added sucessfully");
	}
	
	//add item inside category
	public void addItemToShop(int categoryId,Item item)
	{
		categories.get(categoryId).addItem(item);
		System.out.println(item.getName()+" added to shop");
	}
	
	//remove item from category 
	public void removeItemFromShop(int categoryId, int itemId) {
		categories.get(categoryId).removeItem(itemId); 
		System.out.println("item with "+itemId+" removed from Shop");
	}
	
	public Item	getItem(int categoryId,int itemId)
	{
		return categories.get(categoryId).items.get(itemId) ;
	}
	
	public void displayItemsByCategory(int categoryId) {
	    Category category = categories.get(categoryId);

	    if (category == null) {
	        System.out.println("Category not found!");
	        return;
	    }

	    System.out.println("Items in Category: " + category.getName());
	    for (Item item : category.getItems().values()) {
	        System.out.println(item.getItemId() + " - " + item.getName() +
	                           " | Price: " + item.getPrice() +
	                           " | Qty: " + item.getQuantity());
	    }
	}

}
 