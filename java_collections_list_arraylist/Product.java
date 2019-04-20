package java_collections_part2;

import java.util.*;

public class Product {
	public static final Comparator<Product> BY_WEIGHT = new Comparator<Product>() {
		
		@Override
		public int compare(Product o1, Product o2) {
			// TODO Auto-generated method stub
			return Integer.compare(o1.getWeight(), o2.getWeight());
		}
	};
	
	
	private final String name;
	private final int weight;
	
	public Product(String name, int weight) {
		super();
		this.name = name;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	
	public int getWeight() {
		return weight;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", weight=" + weight + "]";
	}
	
}
