package database;
import java.util.ArrayList;
import java.util.List;
import invoice.Customer;

public class CustomerData {
 private List<Customer> customers =intializeCustomers();
 private List<Customer> intializeCustomers(){
	 List<Customer> custlist=new ArrayList<Customer>();
	 custlist.add(new Customer("a@a.c","A","9089898989"));
	 custlist.add(new Customer("b@b.c","B","9089898989"));
	 custlist.add(new Customer("c@c.c","C","9089898989"));
	 return custlist;
 }
 public List<Customer> getCustomers(){
	 return customers;
 }
}
