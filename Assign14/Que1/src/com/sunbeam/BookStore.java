package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;

public class BookStore {
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;
    Category category;

	public BookStore() {

	}

	public BookStore(String i, double price, String authorName, int quantity, int c) {
		this.isbn = i;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
		category = Category.values()[c];
		this.category = category;
	}

	public String getIsbn() {
		return isbn;
	}

	public double getPrice() {
		return price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return "BookStore [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ ", category=" + category + "]";
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookStore other = (BookStore) obj;
		return Objects.equals(isbn, other.isbn);
	}
	
	

}

//isbn(string), category(enum), price(double), authorName(string), quantity(int)