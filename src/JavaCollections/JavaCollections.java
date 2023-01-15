package JavaCollections;

import java.util.*;

public class JavaCollections {
	
	

	public static void main(String[] args) {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		customers.add(new Customer("James", "Bond", "jb007@mi6.gov.uk"));
		customers.add(new Customer("Jimmy", "Tan", "jimmy@email.com"));
		customers.add(new Customer("Sally", "Yeh", "sally@email.com"));
				
		System.out.println("Array List");
		System.out.println("");
		
//		Iterator<Customer> iter = customers.iterator();
		
//		while (iter.hasNext()) {
//			
//			Customer customer = (Customer) iter.next();
//			System.out.println(customer.toString());
//		}
		
		// Can use for loop instead of the above.
		for (Customer customer : customers) {
			System.out.println(customer.toString());
		}
		
		Vector<Customer> vCustomers = new Vector<Customer>();
		
		vCustomers.add(new Customer("James", "Bond", "jb007@mi6.gov.uk"));
		vCustomers.add(new Customer("Jimmy", "Tan", "jimmy@email.com"));
		vCustomers.add(new Customer("Sally", "Yeh", "sally@email.com"));
		

		
		System.out.println("");
		System.out.println("Vector");
		System.out.println("");
		
//		Iterator<Customer> vIter = vCustomers.iterator();
		
//		while (vIter.hasNext()) {
//			
//			Customer customer = (Customer) vIter.next();
//			System.out.println(customer.toString());
//		}
		
		for (Customer customer : vCustomers) {
			System.out.println(customer.toString());
		}
		
		Stack<Customer> sCustomers = new Stack<Customer>();
		
		sCustomers.add(new Customer("James", "Bond", "jb007@mi6.gov.uk"));
		sCustomers.add(new Customer("Jimmy", "Tan", "jimmy@email.com"));
		sCustomers.add(new Customer("Sally", "Yeh", "sally@email.com"));
		

		
		System.out.println("");
		System.out.println("Stack");
		System.out.println("");
		
//		Iterator<Customer> sIter = sCustomers.iterator();
		
//		while (sIter.hasNext()) {
//			
//			Customer customer = (Customer) sIter.next();
//			System.out.println(customer.toString());
//		}
		
		for (Customer customer : sCustomers) {
			System.out.println(customer.toString());
		}
		
		System.out.println("");
		System.out.println("Priority Queue");
		System.out.println("");
		
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		
		pq.add(10);
		pq.add(5);
		pq.add(20);
		pq.add(2);
		
//		Iterator<Integer> pqIter = pq.iterator();
//		
//		while (pqIter.hasNext()) {
//			
//			Integer i = pqIter.next();
//			System.out.println(i);
//		}
		
		for (Integer i : pq) {
			System.out.println(i);
		}		
		
		System.out.println("");
		System.out.println("Priority");
		System.out.println("");
		
	}

}
