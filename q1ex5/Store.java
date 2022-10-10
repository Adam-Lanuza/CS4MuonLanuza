import java.util.ArrayList;

public class Store {
	private String name;
	private double earnings;
	private ArrayList<Item> itemList;
	private static ArrayList<Store> storeList = new ArrayList<>();

	public Store(String name) {
		// Initialize name to parameter and earnings to zero
		this.name = name;
		this.earnings = 0.0;
		
		// Initialize itemList as a new ArrayList
		this.itemList = new ArrayList<>();
		
		// add 'this' store to storeList
		storeList.add(this);
	}

	public String getName() {
		return name;
	}

	public double getEarnings() {
		return earnings;
	}

	public void sellItem(int index) {
		// check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
		if (index < itemList.size()) {
			// get Item at index from itemList and add its cost to earnings
			Item purchase = itemList.get(index);
			earnings += purchase.getCost();

			// print statement indicating the sale
			System.out.printf("%s has been sold for %.2f\n", purchase.getName(), purchase.getCost());
		} else {
			System.out.println("There are only " + itemList.size() + " items in the store");
		}
	}

	public void sellItem(String name) {
		// check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
		for (Item purchase : itemList) {
			if (purchase.getName().equals(name)) {
				// get Item from itemList and add its cost to earnings
				earnings += purchase.getCost();
				// print statement indicating the sale
				System.out.printf("%s has been sold for %.2f\n", purchase.getName(), purchase.getCost());

				return; // Doesn't return anything but is needed to end the method without triggering the printf below
			}
		}
		System.out.printf("The store doesn't sell %s\n", name); // Only functions when the return in the if doesn't run.
	}

	public void sellItem(Item i) {
		// check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
		if (itemList.contains(i)) {
			// get Item i from itemList and add its cost to earnings
			earnings += i.getCost();
			
			// print statement indicating the sale
			System.out.printf("%s has been sold for %.2f\n", i.getName(), i.getCost());
		} else {
			System.out.printf("The store doesn't sell %s\n", i.getName());
		}
	}

	public void addItem(Item i) {
		itemList.add(i);
	}

	public void filterType(String type) {
		// loop over itemList and print all items with the specified type
		for (Item purchase : itemList) {
			if (purchase.getType().equals(type)) {
				System.out.printf("%s, ", purchase.getName());
			}
		}
		System.out.print("\n");
	}

	public void filterCheap(double maxCost) {
		// loop over itemList and print all items with a cost lower than or equal to the specified value
		for (Item purchase : itemList) {
			if (purchase.getCost() <= maxCost) {
				System.out.printf("%s, ", purchase.getName());
			}
		}
		System.out.print("\n");
	}

	public void filterExpensive(double minCost) {
		// loop over itemList and print all items with a cost higher than or equal to the specified value
		for (Item purchase : itemList) {
			if (purchase.getCost() >= minCost) {
				System.out.printf("%s, ", purchase.getName());
			}
		}
		System.out.print("\n");
	}

	public static void printStats() {
		// loop over storeList and print the name and the earnings'Store.java'
		for (Store store : storeList) {
			System.out.printf("Store Name: %s\nStore Earnings: %.2f\n", store.getName(), store.getEarnings());
		}
	}
}
