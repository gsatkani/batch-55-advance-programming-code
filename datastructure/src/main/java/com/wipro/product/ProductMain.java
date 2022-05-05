package com.wipro.product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class ProductMain {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ProductServiceImpl service = new ProductServiceImpl();
		System.out.println("---Product App Software---");
		do {
			System.out.println("Press 1.Add Product\n2.List Prodcut3.Search Product By Id");
			int choice = Integer.parseInt(reader.readLine());
			switch (choice) {
			case 1:
				Product product = new Product();
				System.out.println("Id");
				product.setId(Integer.parseInt(reader.readLine()));
				System.out.println("Name");
				product.setName(reader.readLine());
				System.out.println("Price");
				product.setPrice(Double.parseDouble(reader.readLine()));
				System.out.println("Quantity");
				product.setQuantity(Integer.parseInt(reader.readLine()));
				boolean detail = service.addProductDetail(product);
				if (detail) {
					System.out.println("Product Added Sucessfully");
				} else {
					System.out.println("Product Not Added");
				}
				break;
			case 2:
				List<Product> list = service.getAllProductList();
				if (list.isEmpty()) {
					System.out.println("List is Empty");
				} else {
					for (Product pro : list) {
						System.out.println(
								pro.getId() + "--" + pro.getName() + "--" + pro.getPrice() + "--" + pro.getQuantity());
					}
				}
				break;
				
			case 3:
				System.out.println("Enter the Id to Search");
				int key=Integer.parseInt(reader.readLine());
				Product prod = service.searchProductById(key);
				if(prod==null) {
					System.out.println("Product Id " +key +" is not found");
				}
				else {
					System.out.println(prod.getId() + "--" + prod.getName() + "--" + prod.getPrice() + "--" + prod.getQuantity());
				}
				break;
				
			default:
				System.out.println("Thank you");
				System.exit(0);
				break;
			}

		} while (true);

	}

}
