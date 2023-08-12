package com.aurionpro.model;

public class OrderRepository implements IRepository {

	@Override
	public void create() {
		System.out.println("\nOrder repository is created");

	}

	@Override
	public void read() {
		System.out.println("Order repository is read");

	}

	@Override
	public void update() {
		System.out.println("Order repository is updated");

	}

	@Override
	public void delete() {
		System.out.println("Order repository is deleted");

	}

}
