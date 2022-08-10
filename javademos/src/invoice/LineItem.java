package invoice;

public class LineItem {
private int id;
private Invoice invo;
private Product product;
private int quantity;
public LineItem(int id,Invoice invo, Product product, int quantity) {
	super();
	this.id = id;
	this.product = product;
	this.quantity = quantity;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Invoice getInvo() {
	return invo;
}
public void setInvo(Invoice invo) {
	this.invo = invo;
}
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
@Override
public String toString() {
	return "LineItem [id=" + id + ", invo=" + invo + ", product=" + product + ", quantity=" + quantity + "]";
}

}
