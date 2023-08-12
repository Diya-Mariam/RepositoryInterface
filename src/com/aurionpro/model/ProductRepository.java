package com.aurionpro.model;

public class ProductRepository implements IRepository {

	@Override
	public void create() {

		System.out.println("\nProduct repository is created");
	}

	@Override
	public void read() {

		System.out.println("Product repository is read");

	}

	@Override
	public void update() {

		System.out.println("Product repository is updated");
	}

	@Override
	public void delete() {

		System.out.println("Product repository is deleteds");
	}

}
