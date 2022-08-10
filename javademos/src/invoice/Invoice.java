package invoice;

import java.time.LocalDate;
import java.util.List;

public class Invoice {
private String invo;
private Customer customer;
private LocalDate indate;
private String status;
private List<LineItem> lineItems;

public Invoice(String invo) {
	super();
	this.invo = invo;
	this.indate = LocalDate.now();
}

public String getInvo() {
	return invo;
}

public void setInvo(String invo) {
	this.invo = invo;
}

public Customer getCustomer() {
	return customer;
}

public void setCustomer(Customer customer) {
	this.customer = customer;
}

public LocalDate getIndate() {
	return indate;
}

public void setIndate(LocalDate indate) {
	this.indate = indate;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public List<LineItem> getLineItems() {
	return lineItems;
}

public void setLineItems(List<LineItem> lineItems) {
	this.lineItems = lineItems;
}

@Override
public String toString() {
	return "Invoice [invo=" + invo + ", customer=" + customer + ", indate=" + indate + ", status=" + status
			+ ", lineItems=" + lineItems + "]";
}

}
