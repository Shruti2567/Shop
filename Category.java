package shop;

import java.util.HashMap;
import java.util.Map;

public class Category {
	private int categoryId;
	private String name;
	 Map<Integer, Item> items = new HashMap <>();
	 
	public Category() {
	}
	public Category(int categoryId, String name) {
		super();
		this.categoryId = categoryId;
		this.name = name;
		
	}
	@Override
	public String toString() {
		return "id ->"+categoryId+" name-> " + name + "\n";
	}

	
	  public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Map<Integer, Item> getItems() {
		return items;
	}
	
	public void addItem(Item item) {
	        items.put(item.getItemId(), item);
	    }

	    public void removeItem(int itemId) {
	        items.remove(itemId);
	    }
	
	    
	
}
