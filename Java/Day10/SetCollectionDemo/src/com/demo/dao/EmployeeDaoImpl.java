package com.demo.dao;
import java.util.TreeSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.ArrayList;

import com.demo.beans.Employee;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
public class EmployeeDaoImpl implements EmployeeDao {
static Set<Employee> eset;
static {eset = new HashSet<>();
	eset.add(new Employee(105, "Rajan", 56000 , LocalDate.of(2023, 11,02)));
	eset.add(new Employee(110, "Niyati", 60000, LocalDate.of(2024, 10, 03)));
	eset.add(new Employee(115, "Ajay", 40000, LocalDate.of(2024, 10, 03)));
	eset.add(new Employee(120, "Ajay", 35000, LocalDate.of(2024, 10, 03)));
	eset.add(new Employee(130, "Manorama", 50000, LocalDate.of(2024, 10, 03)));

}
	@Override
	public boolean save(Employee e) {
	
		return eset.add(e);
	}
	
	@Override
	public Set<Employee> findAll() {
		
		return eset;
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		Optional<Employee> ob = eset.stream().filter(e->e.getEmpid()==id).findFirst();
		if(ob.isPresent()) {
			return ob.get();
		}
		return null;
	}

	@Override
	public Set<Employee> findByName(String nm) {
		Set<Employee> es = eset.stream().filter(e->e.getEname().equals(nm)).collect(Collectors.toSet()); 
		if(es.size()>0) {
			return es;
		}
		return null ;
	}

	@Override
	public boolean updateBySal(int id, double sal) {
		Employee e =findById(id);
		if(e!=null) {
			e.setSal(sal);
			return true;
		}
		return false;
	}
	

	@Override
	public boolean removeById(int id) {
		return eset.remove(new Employee(id));
		
	}

	@Override
	public boolean removeBySal(double sal) {
		// TODO Auto-generated method stub
		return eset.removeIf(e->e.getSal()==sal);
	}
	

	@Override
	public List<Employee> sortBySal() {
		Comparator<Employee> csal =(o1,o2)->{
			System.out.println("in sal comparator" + o1.getSal() + "----" + o2.getSal());
			return (int)(o1.getSal() - o2.getSal());
			
		};
		
		List<Employee> elist = new ArrayList<>();
		for(Employee e:eset) {
			elist.add(e);
		}
		
		elist.sort(csal);
		return elist;
	}

	@Override
	public List<Employee> sortByName() {
		
		Comparator<Employee> c = (o1,o2)->{
			System.out.println("in name comparator" + o1.getEname() + "----" +  o2.getEname());
			return o1.getEname().compareTo	( o2.getEname());
		};
		List<Employee> elist= new ArrayList<>();
		for(Employee e:eset) {
			elist.add(e);
		}
		elist.sort(c);
		return elist;
	}

	@Override
	public Set<Employee> sortById() {
	Set<Employee> tset= new TreeSet<>();
	for (Employee e:eset) {
		tset.add(e);
		}
		return tset;
	}	
	
	
	@Override
	public Employee findBySal(double sal) {
		Optional<Employee> ob = eset.stream().filter(e->e.getSal()==sal).findFirst();
		if(ob.isPresent()) {
			return ob.get();
		}
		return null;
		
	}
	
	
	
}
