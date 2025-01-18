package com.shopping.serviceI;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shopping.entity.Product;
@Service
public interface ProductService {

	Product saveDetails(Product product);

	List<Product> getallDetails();

	Product getsingleData(String pro_id);

}
