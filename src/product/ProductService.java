package product;

import java.util.*;

import myinfo.*;

public class ProductService implements ProductInterface {
	private static ProductService instance = null;
	private ProductService() {}
	public static ProductService getInstace() {
		if (instance == null) instance = new ProductService();
		return instance;
	}
	
	MyInfo info = MyInfo.getInstance();
	
	
}
