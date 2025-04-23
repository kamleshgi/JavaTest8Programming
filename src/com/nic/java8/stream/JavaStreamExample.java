package com.nic.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamExample {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));

		List<Float> listprice = productsList.stream().map(x -> x.price).collect(Collectors.toList());
		System.out.println("Price of Laptop " + listprice);

		Map<String, Float> maplist = productsList.stream().
				                    collect(Collectors.toMap(p -> p.name, p -> p.price));
		System.out.println(maplist);

		Map<String, Float> maplistwithPrice = productsList.stream().filter(p -> p.price >= 30000)
				.collect(Collectors.toMap(p -> p.name, p -> p.price));
		System.out.println("MaplistwithPrice "+maplistwithPrice);

		// find the Laptop name which is amount is 90000

		List<String> nameListr = productsList.stream().
				                 filter(product -> product.price == 90000)
				                 .map(product -> product.name)
				                 .collect(Collectors.toList());
		System.out.println(nameListr);

		// This is more compact approach for filtering data
		Float totalPrice = productsList.stream().map(product -> product.price).reduce(0.0f,
				(sum, price) -> sum + price); // accumulating price
		System.out.println(totalPrice);
		// More precise code
		float totalPrice2 = productsList.stream().map(product -> product.price).reduce(0.0f, Float::sum); // accumulating
		System.out.println(totalPrice2);
		
		// price, by
		List<String> priceList=	 productsList.stream().filter(p->p.price> 8000).map(p->p.name).collect(Collectors.toList());    // referring
		
		System.out.println("priceList: "+priceList);// method of
																											// Float
																											// class
		

	}
}
