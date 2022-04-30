package ComparTOR;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "jdk", "A1", "C연구원", new BigInteger("2800"));
        Employee employee2 = new Employee(2, "amateur", "B2", "B연구원", new BigInteger("2800"));
        Employee employee3 = new Employee(3, "pro", "C2", "A연구원", new BigInteger("7000"));
        List<Employee> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        for(Employee i :list) {
        	System.out.println(i);
        }
        Collections.sort(list,new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				
				return o2.getSales().compareTo(o1.getSales());
			}
        	
        });
        System.out.println("----------------------");
        for(Employee i :list) {
        	System.out.println(i);
        }
    }
}

