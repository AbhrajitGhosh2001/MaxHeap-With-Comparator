
public interface GenericHeapInterface<T> {

	void insert(Employee e);
	
	Employee delete();
	
	void heapify(int pos);
	
	boolean isEmpty();
	
	void sort();
	
	void print();
}
