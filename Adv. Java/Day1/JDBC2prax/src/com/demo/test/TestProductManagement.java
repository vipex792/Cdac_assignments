package com.demo.test;
import com.demo.beans.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;
import java.util.Scanner;

public class TestProductManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		ProductService pservice= new ProductServiceImpl();
		
		do {
			System.out.println("1.Add new product \n2.Delete product \n3.Modify product ");
			
			
			System.out.println("Choice : ");
			choice=sc.nextInt();
			
			switch(choice) {
			
			case 1->{
				boolean status = pservice.addNewProduct();
				if(status) {
					System.out.println("Product added successfully");
				}
				
				else {
					System.out.println("Not added");
				}
			}
			
			
			case 2->{
				
			}
			
			}
		}
		
		while(choice!=9);
	}

}
