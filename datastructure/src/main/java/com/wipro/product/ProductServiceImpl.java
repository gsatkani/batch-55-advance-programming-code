package com.wipro.product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
	List<Product> productList = new ArrayList<Product>();

	public boolean addProductDetail(Product product) {
		boolean add = productList.add(product);
		return add;
	}

	public List<Product> getAllProductList() {
		return productList;
	}

	public Product searchProductById(int id) {
		for (Product product : productList) {
			if (id == product.getId()) {
				return product;
			}
		}
		return null;
	}

	public List<Product> getProductByName(String name) {
		List<Product> pList=new ArrayList<Product>();
		for (Product product : productList) {
			if(name.equals(product.getName())) {
				pList.add(product);
			}
		}
		return pList;
	}
}
