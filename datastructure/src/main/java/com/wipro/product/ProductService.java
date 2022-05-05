package com.wipro.product;

import java.util.List;

public interface ProductService {
	boolean addProductDetail(Product product);

	List<Product> getAllProductList();

	Product searchProductById(int id);
	
	List<Product> getProductByName(String name);
}
