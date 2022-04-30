package ComparTOR;
import java.math.BigInteger;
 
public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String department;
    private String position;
    private BigInteger sales;
    
  

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public String getPosition() {
		return position;
	}



	public void setPosition(String position) {
		this.position = position;
	}



	public BigInteger getSales() {
		return sales;
	}



	public void setSales(BigInteger sales) {
		this.sales = sales;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", position=" + position
				+ ", sales=" + sales + "]";
	}



	public Employee(int id, String name, String department, String position, BigInteger sales) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.position = position;
		this.sales = sales;
	}



	@Override
    public int compareTo(Employee o) {
        //return this.name.compareTo(o.name);
        //return this.id - o.id;
        return this.position.compareTo(o.position);
    }
    
    //...
    //getter, setter, 持失切, toString() 持繰
    
}