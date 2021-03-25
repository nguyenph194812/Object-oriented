
public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
		
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	private int qtyOrdered;
	//add one by one
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		for(int i=0; i < 10; i++) {
			if(itemsOrdered[i] != null)
					qtyOrdered++;
		}
		
		if(qtyOrdered == 10)
			System.out.println("The order is full");
		
		else {
			if(qtyOrdered == 9)
				System.out.println("The order is almost full");
			for(int j=0; j < 10; j++) {
				if(itemsOrdered[j] == null) {
					itemsOrdered[j] = disc;
					break;
				}
			}
		}
	}
	
	//add a list
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		for(int i=0; i < 10; i++) {
			if(itemsOrdered[i] != null)
					qtyOrdered++;
		}
		
		if(qtyOrdered == 10)
			System.out.println("The order is full");
		
		else {
			if(qtyOrdered == 9)
				System.out.println("The order is almost full");
			for(int j = 0; j < 10; j++) {
				if(itemsOrdered[j] == null) {
					for(int k= 0; k < dvdList.length; k ++) {
						if(qtyOrdered <= 9) {
							itemsOrdered[j] = dvdList[k];
							qtyOrdered ++;
						}	
						else {
							System.out.println("DVD cant be add: " + dvdList[k].getTitle());
						}		
					}
					break;
				}
			}
		}
	}
	
	//add number of parameters
	
	public float totalCost() {
		float totalcost = 0;
		for(int i=0; i<10; i++) {
			if(itemsOrdered[i] != null) {
				totalcost += itemsOrdered[i].getCost();
			}
		}
		return totalcost;
	}
}
