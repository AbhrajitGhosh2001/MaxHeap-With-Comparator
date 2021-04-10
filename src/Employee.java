/**
 * Employee class holds name and pay rate of employees
 * @author Abhrajit Ghosh
 *
 */
public class Employee {
private String name;
private int pay;

	Employee(String name,int pay){
		this.pay=pay;
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPay() {
		return pay;
	}
	
	public boolean equals(Employee other) {
		return this.getPay()==other.getPay();
	}
	
	
	public String toString(){
		return name +" "+ pay;
	}
	
	
}
