package com.signify.client;

import com.signify.service.CustomerService;

public class CustomerClient {
  
	public static void main(String args[]) {
	CustomerService service=new CustomerService();
	service.createCustomer();
	service.deleteCustomer(101);
	service.listCustomer();
	service.updateCustomer(101);
	}
	
}

