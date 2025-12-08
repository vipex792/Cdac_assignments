package com.demo.test;
import java.util.List;
import java.util.ArrayList;
import com.demo.beans.Employee;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.EOFException;

public class TestSerialization {

	public static void main(String[] args) {
		
		List<Employee> lst = new ArrayList<>();
		lst.add(new Employee(11,"Ashutosh", "AI", 56789));
		lst.add(new Employee(11,"Monika", "IOT", 34568));
		lst.add(new Employee(11,"Pyare Mohan", "assistant", 89000));
	
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("empdata1.txt"));){
			for(Employee e:lst) {
				oos.writeObject(e);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		try(ObjectInputStream ois = new ObjectInputStream (new FileInputStream("empdata1.txt"));){
			while(true) {
				Employee e = (Employee )ois.readObject();
				System.out.println(e);
			}
			
		}catch (EOFException e) {
			System.out.println("reached to the end of the file");
			
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e1) {
			e1.printStackTrace();
		}
	}

}
