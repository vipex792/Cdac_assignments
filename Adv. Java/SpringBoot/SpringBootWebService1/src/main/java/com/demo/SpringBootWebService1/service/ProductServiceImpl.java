package com.demo.SpringBootWebService1.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.SpringBootWebService1.beans.Product;
import com.demo.SpringBootWebService1.dao.ProductDao;
import com.demo.SpringBootWebService1.dto.ProductDto;
import com.demo.SpringBootWebService1.mapper.ProductDtoMapper;

@Service
public class ProductServiceImpl implements ProductService{
   @Autowired
   ProductDao pdao;

@Override
public List<ProductDto> getAllProducts() {
	System.out.println("hello");
	List <Product> plist = pdao.findAll();
	System.out.println(plist);
	List<ProductDto> plist1=plist.stream().map(prod->ProductDtoMapper.mapToProductDto(prod)).collect(Collectors.toList());
	return plist1;		
}

@Override
public ProductDto getById(int pid) {
	Optional <Product> p = pdao.findById(pid);
	if(p.isPresent()) {
	ProductDto prod = ProductDtoMapper.mapToProductDto(p.get());
	return prod;
}
return null;
	
}

@Override
public List<ProductDto> getByPrice(double lprice, double hprice) {
	List<Product> plist= pdao.findByPrice(lprice, hprice);
	if(plist.size()>0) {
		List<ProductDto> plist1=plist.stream().map(prod->ProductDtoMapper.mapToProductDto(prod)).collect(Collectors.toList());
		return plist1;
	}
    return null;
}

@Override
public boolean addProduct(ProductDto p) {
	Product prod = ProductDtoMapper.mapToProduct(p);
	Product p1 = pdao.save(prod);
	return p1!=null;
}

@Override
public boolean updateProduct(ProductDto p) {
	Product prod = ProductDtoMapper.mapToProduct(p);
	Optional<Product> op = pdao.findById(p.getPid());
    if(op.isPresent()) {
    	Product p2=op.get();
    	p2.setPname(p.getPname());
    	p2.setQty(p.getQty());
    	p2.setPrice(p.getPrice());
    	pdao.save(p2);
    	return true;
    }
        return false;
}

@Override
public boolean deleteProduct(int pid) {
	Optional<Product> op = pdao.findById(pid);
	if(op.isPresent()) {
		pdao.delete(op.get());
		return true;
	}
	return false;
} 

}