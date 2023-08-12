package com.aurionpro.test;

import com.aurionpro.model.IRepository;
import com.aurionpro.model.OrderRepository;
import com.aurionpro.model.ProductRepository;

public class RepositoryTest {

	public static void main(String[] args) {

		doDbOperation(new OrderRepository());
		
		doDbOperation(new ProductRepository());
			
	}

	private static void doDbOperation(IRepository repository) {

		repository.create();
		repository.read();
		repository.update();
		repository.delete();
		
	}

}
