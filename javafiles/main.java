public class main {
	public static void main(String[] args) {

		System.out.println("Pizza Bill Generator Starting...\n");

		pizza p = new pizza();
		p.addExtraChiees();
		p.addExtraToppings();
		p.takeAway();
		p.getBill();
	}
}
