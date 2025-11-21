import java.util.*;
public class pizza {
	private int price;
	private String bill = "";
	private int cheesPrice = 100;
	private int toppingPrice = 150;
	private int takeAway = 50;

	pizza() {
		Scanner in = new Scanner(System.in);
		boolean veg = false;
		System.out.println("Veg (yes / no) :");
		char ch = in.next().charAt(0);
		String type = "";
		if (ch == 'y')
			veg = true;
		if (veg) {
			type += "Veg Pizza Price : ";
			price = 300;
		} else {
			type += "NonVeg Pizza Price : ";
			price = 400;
		}

		bill += type + price + "\n";
	}

	public void addExtraChiees() {
		price += cheesPrice;
		bill += "Chees : " + cheesPrice + "\n";
	}

	public void addExtraToppings() {
		price += toppingPrice;
		bill += "Toppings : " + toppingPrice + "\n";
	}

	public void takeAway() {
		price += takeAway;
		bill += "TakeAway : " + takeAway + "\n";
	}

	public void getBill() {
		bill += "*********************";
		if (!bill.isEmpty())
			System.out.println(bill);
		System.out.println("Total Amount : " + price);
	}

	public int getCheesPrice() {
		return cheesPrice;
	}

	public void setCheesPrice(int cheesPrice) {
		this.cheesPrice = cheesPrice;
	}

	public int getToppingPrice() {
		return toppingPrice;
	}

	public void setToppingPrice(int toppingPrice) {
		this.toppingPrice = toppingPrice;
	}

	public int getTakeAway() {
		return takeAway;
	}

	public void setTakeAway(int takeAway) {
		this.takeAway = takeAway;
	}

}
