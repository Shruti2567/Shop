package shop;

import java.util.HashMap;
import java.util.Map;

public class Cart {

	Map<Integer, Integer> cart= new HashMap<>() ;
	
	public void additem(int itemId,Shop shop, int categoryId) {
		Item item= shop.getItem(categoryId, itemId) ;
		
		if (item.getQuantity()>0) {
			cart.put(itemId, cart.getOrDefault(itemId, 0)+1);
			item.setQuantity(item.getQuantity()-1);
			System.out.println(cart.get(itemId));
		}
		else {
			System.out.println("Item out of stock");
		}
	}
	
	 public void removeItem(int itemId,Shop shop, int categoryId) 
	 {
	        if (cart.containsKey(itemId)) 
	        {
	        	cart.put(itemId, cart.get(itemId)-1) ;
	        	
	        	System.out.println("Item removed fro  1st if");
	        	System.out.println(cart.get(itemId));
	        if(cart.get(itemId)==0)
	        {
	        	cart.remove(itemId) ;
	        	
	        }
	        
	        Item item= shop.getItem(categoryId, itemId) ;
	        item.setQuantity(item.getQuantity()+1);
	        
	        
	        }
	        else {
	        	System.out.println("Item Not In cart");
	        }
     }
	
}
