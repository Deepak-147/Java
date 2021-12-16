package com.myPackage.oops.part2_object_composition;

public class CustomerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address homeAddress = new Address("63, F-block, Sector-14", "Udaipur", "313002");
		Customer customer = new Customer("Deepak Laxkar", homeAddress);

		Address workAddress = new Address("Whitefield", "Bangalore", "560037");
		customer.setWorkAddress(workAddress);

		System.out.println(customer);
	}

}
