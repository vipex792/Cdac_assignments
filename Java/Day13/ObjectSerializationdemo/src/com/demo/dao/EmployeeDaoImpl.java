package com.demo.dao;

import com.demo.beans.Employee;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.EOFException;
import java.io.File;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {
static List <Employee> lst;

@Override
public void readData(String fname)  {
	File f = new File(fname);
	if(f.exists()) {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fname));){
				while(true) {
					Employee e =  (Employee)ois.readObject();
					lst.add(e);
				}
				}
				catch(EOFException e){
					System.out.println("Reached end to the file");
				}
		
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}
@Override
public boolean save(Employee e) {
	// TODO Auto-generated method stub
	return lst.add(e);
}
public boolean removeById(int empid) {
	return lst.remove(new Employee(empid));
}

}
