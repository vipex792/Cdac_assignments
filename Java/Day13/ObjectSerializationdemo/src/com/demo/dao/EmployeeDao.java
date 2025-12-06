package com.demo.dao;
import com.demo.beans.Employee;
import java.util.List;

public interface EmployeeDao {
 boolean save (Employee e);

 boolean removeById(int empid);

void readData(String fname);
}

