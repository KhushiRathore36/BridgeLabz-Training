package OPPSProblem;

public class InventoryItem {
    String itemCode;
    String itemName;
    double price;
    static double totalCost;
    InventoryItem(String itemCode,String itemName,double price){
    	this.itemCode=itemCode;
    	this.itemName=itemName;
    	this.price=price;
    	totalCost+=price;
    }
    
    
    public void display() {
    	System.out.println("itemCode: "+itemCode);
    	System.out.println("itemName: "+itemName);
    	System.out.println("price: "+price);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        InventoryItem item=new InventoryItem("01AA","Water Bottle",500.0);
        InventoryItem item1=new InventoryItem("01BB","Rice",700.0);
        InventoryItem item2=new InventoryItem("02AA","blackboard",400.0);
        
        item.display();
        item1.display();
        item2.display();
        System.out.println("The total amount is: "+InventoryItem.totalCost);
	}

}
