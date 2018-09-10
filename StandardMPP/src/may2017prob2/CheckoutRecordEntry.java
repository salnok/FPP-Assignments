package may2017prob2;

import java.time.LocalDate;

public class CheckoutRecordEntry {
	private LocalDate checkoutDate;
	private LocalDate dueDate;
	private LendingItem lendingitem;
	private ItemType type; 
	
	public CheckoutRecordEntry(LocalDate checkoutDate, LocalDate dueDate, LendingItem lendingitem, ItemType type) {

		this.checkoutDate = checkoutDate;
		this.dueDate = dueDate;
		this.lendingitem = lendingitem;
		this.type = type;
	}
	
	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public ItemType getType() {
		return type;
	}

	public LendingItem getLendingitem() {
		return lendingitem;
	}
	
}
