package com.shopping.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.entity.Product;
import com.shopping.repository.ProductRepository;
import com.shopping.serviceI.ProductService;
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository proRepository;
	@Override
	public Product saveDetails(Product product) {
		Product prod=proRepository.save(product);
		return prod;
	}
	@Override
	public List<Product> getallDetails() {
		List<Product> al=proRepository.findAll();
		return al;
	}
	@Override
	public Product getsingleData(String pro_id) {
		Optional<Product> op=proRepository.findById(pro_id);
		if(op.isPresent()) {
			Product pr=op.get();
			return pr;
		}
		return null;
	
	}
	

}
