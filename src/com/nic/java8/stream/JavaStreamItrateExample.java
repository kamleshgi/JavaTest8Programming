package com.nic.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamItrateExample {
	public static void main(String args[]) {
		Stream.iterate(5, element -> element + 1).filter(element -> element % 2 == 0).limit(10)
				.forEach(System.out::println);
		System.out.println("1.====================Write a Table ================");
		Stream.iterate(0, element -> element + 1).limit(11)
				.forEach(element -> System.out.println("2 * " + element + " = " + element * 2));

		System.out.println("2.====================Find the Product Name which price is 30000 ================");
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		System.out.println("Print All List");
		productsList.stream().forEach(element-> System.out.println(element.id+" "+element.name+" "+element.price));
		
		
	    Map<Integer, String> mapProduct33 = productsList.stream().collect(Collectors.toMap(p -> p.id, p -> p.name +" "+ p.getPrice()));      
		System.out.println("mapProduct33 "+mapProduct33);
		
		// This is more compact approach for filtering data
		productsList.stream().filter(product -> product.price == 30000)
				.forEach(product -> System.out.println(product.name));

		System.out.println(
				"3.====================Find the reduce() which is used to sum of all the product prices. ================");
		float totalPrice = productsList.stream().map(product -> product.price).reduce(0.0f, Float::sum);
		System.out.println("TotalPrice: " + totalPrice);

		Double amount = productsList.stream().filter(product -> product.price > productsList.size())
				.mapToDouble(product -> product.price).sum();
		System.out.println("Total Laptop Price: " + amount);

		// Using Collectors's method to sum the prices.
		System.out.println(
				"4. ====================Using Collectors's method to sum the prices used to sum of all the product prices. ================");
		Double summingDoublePrice = productsList.stream()
				.collect(Collectors.summingDouble(produt -> produt.getPrice()));
		System.out.println("SummingDoublePrice Laptop Price: " + summingDoublePrice);

		// max() method to get max Product price
		System.out.println("5. ====================Using max() method to get max Product price. ================");
		Product productA = productsList.stream().max((product1, product2) -> product1.price > product2.price ? 1 : -1)
				.get();
		System.out.println("MAX price " + productA.price + " :" + productA.name);

		System.out.println("6. ====================Using min() method to get Min Product price. ================");
		Product productB = productsList.stream().min((product1, product2) -> product1.price > product2.price ? 1 : -1)
				.get();
		System.out.println("MAX price " + productB.price + " :" + productB.name);

		// count() Method in Collection
		System.out.println(
				"7. =============Using count() Method. count number of products based on the filter   in Collection ================");
		Long countprodcut = productsList.stream().filter(product -> product.price > 25000).count();
		System.out.println("Countprodcut: " + countprodcut);

		// Convert List into Map
		System.out.println("8.=============Using Convert List into Map in Collection ================");
		Map<Integer, String> mapProduct = productsList.stream().collect(Collectors.toMap(p -> p.id, p -> p.name));
		System.out.println("mapProduct: " + mapProduct);

		List<Float> array = productsList.stream().filter(product -> product.price > 30000)// fetching price by referring
																							// getPrice method
				.map(Product::getPrice)// collecting as list
				.collect(Collectors.toList());
		System.out.println("array: " + array);
	}
}
