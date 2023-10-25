class OrderMain {
	public static void main(String[] args) {
		Item item = new Item();
		Order order = new Order();
		order.addItem("Laptop");
		OrderHistory history = new OrderHistory();
		history.getDailyHistory();
		OrderViewer viewer = new OrderViewer();
		viewer.printOrder(order);
	}
}
