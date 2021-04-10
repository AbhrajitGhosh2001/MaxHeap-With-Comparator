import java.util.Comparator;
/**
 * PriorityQueque acts like a container for generic heap
 * @author Abhrajit Ghosh
 *
 * @param <T>
 */
public class PriorityQueue<T> implements PriorityQueueInterface{
	private GenericHeap D;

	public PriorityQueue(Comparator<Employee> comparator) {
		this.D= new GenericHeap (comparator);
	}

	@Override
	public void insert(Employee e) {
		D.insert(e);
	}

	@Override
	public Employee delete() {
		return D.delete();
	}

	@Override
	public boolean isEmpty() {
	   return D.isEmpty();
	}

	@Override
	public void sort() {
		D.sort();
	}

	@Override
	public void print() {
		D.print();
	}

}
