package day5.items;

public class Item {
	private String itemCode;
	private String itemName;
    private int price;
    private int quantity;
    
    public Item() {
    	this.itemCode = "";
    	this.itemName = "";
    	this.price = 0;
    	this.quantity = 0;
    }
    
    public Item(String itemCode, String itemName, int price, int quantity) {
    	this.itemCode = itemCode;
    	this.itemName = itemName;
    	this.price = price;
    	this.quantity = quantity;
    }
    
    @Override
    public String toString() {
    	return "Item Code: " + this.itemCode + "\n Item Name: " + this.itemName + "\n Price: " + this.price + "\n Quantity: " + this.quantity;
    }

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
