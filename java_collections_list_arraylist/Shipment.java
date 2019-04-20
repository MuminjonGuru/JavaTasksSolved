package java_collections_part2;

import java.util.*;

public class Shipment implements Iterable<Product> {

	private static final int LIGHT_VAN_MAX_WEIGHT = 20;
	private static final int PRODUCT_NOT_PRESENT = -1;
	
	private List<Product> lightVanProducts;
	private List<Product> HeavyVanProducts;
	
	private final List<Product> products = new ArrayList<>();
	
	public void add(Product product) {
		products.add(product);
	}
	
	public void replace(Product oldProduct, Product newProduct) {
		final int index = products.indexOf(oldProduct);
		if (index != PRODUCT_NOT_PRESENT) {
			products.set(index, newProduct);
		}
	}
	
	public void prepare() {
		products.sort(Product.BY_WEIGHT);
		
		int splitPoint = findSplitPoint();
		
		lightVanProducts = products.subList(0, splitPoint);
		HeavyVanProducts = products.subList(splitPoint, products.size());
	}
	
	private int findSplitPoint() {
		for(int i = 0; i < products.size(); i++) {
			final Product product = products.get(i);
			if (product.getWeight() > LIGHT_VAN_MAX_WEIGHT) {
				return i;
			}
		}
		return 0;
	}

	public List<Product> getHeavyVanProducts() { return HeavyVanProducts; }

	public List<Product> getLightVanProducts() { return lightVanProducts; }
	
	@Override
	public Iterator<Product> iterator() {
		// TODO Auto-generated method stub
		return products.iterator();
	}
	
}
