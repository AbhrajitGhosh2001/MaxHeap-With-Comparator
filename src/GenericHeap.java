
import java.util.Comparator;
/**
 * MaxHeap Data structure
 * @author Abhrajit Ghosh
 *
 * @param <T>
 */

public class GenericHeap<T> implements GenericHeapInterface{
	    private Employee[] Heap;
	    private int size;
	    private int maxsize;
	    private Comparator<Employee> comparator;
	    
	    public GenericHeap(Comparator<Employee> comparator)
	    {
	    	this.comparator=comparator;
	        this.maxsize = 200;
	        this.size = 0;
	        Heap = (new Employee[this.maxsize + 1]);
	         Heap[0] = new Employee("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA",Integer.MAX_VALUE);
	    }
	  
	    // Returns position of parent
	    private int parent(int pos) 
	    { return pos / 2; }
	  
	    // Below two functions return left and
	    // right children.
	    private int leftChild(int pos) 
	    { return (2 * pos); }
	    private int rightChild(int pos)
	    {return (2 * pos) + 1;}
	  
	    // Returns true of given node is leaf
	    private boolean isLeaf(int pos)
	    {
	        if (pos > (size / 2) && pos <= size) {
	            return true;
	        }
	        return false;
	    }
	  
	    private void swap(int fpos, int spos)
	    {
	        Employee tmp;
	        tmp = Heap[fpos];
	        Heap[fpos] = Heap[spos];
	        Heap[spos] = tmp;
	    }
	  
	    // A recursive function to max heapify the given
	    // subtree. This function assumes that the left and
	    // right subtrees are already heapified, we only need
	    // to fix the root.
	    //comparater is1 if >
	    public void heapify(int pos)
	    {
	        int max = pos; // for now max is the root
	        int left = leftChild(pos);
	        int right = rightChild(pos);

	        // if element of left index is greater than root
	        if (left < Heap.length && comparator.compare(Heap[left],Heap[max])<0)
	            max = left;

	        // if element of right index is the longest so far
	        if (right < Heap.length && comparator.compare(Heap[right],Heap[max])<0)
	            max = right;

	        // if largest has no root
	        if (max != pos) {
	            swap(pos,max);
	            // recursion
	            heapify(max);
	        }
	    }
	  
	    // Inserts a new element to max heap
	    public void insert(Employee element)
	    {
	        Heap[++size] = element;
	  
	        // Traverse up and fix violated property
	        int current = size;
	        while (comparator.compare(Heap[current],Heap[parent(current)])==1) {
	            swap(current, parent(current));
	            current = parent(current);
	        }
	    }
	  
	    //print method
	    public void print()
	    {
	        for (int i = 1; i <= size / 2; i++) {
	            System.out.print(
	                " PARENT : " + Heap[i]
	                + " LEFT CHILD : " + Heap[2 * i]
	                + " RIGHT CHILD :" + Heap[2 * i + 1]);
	            System.out.println(); 
	        }
	        System.out.println(); 
	    }
	  
	    // Remove an element from max heap
	    public Employee delete()
	    {
	        Employee popped = Heap[1];
	        Heap[1] = Heap[size--];
	        heapify(1);
	        return popped;
	    }

	    //checks if empty
		public boolean isEmpty() {
			if(Heap[1]!=null) {
			return false;
			}
			else {
				return true;
			}
		}


		//Sorts using heapify
		public void sort()
	    {
	        int n = Heap.length;
	 
	        // One by one extract an element from heap
	        for (int i = n - 1; i >= 0; i--) {
	            // Move current root to end
	        	swap(0,i);
	            // call max heapify on the reduced heap
	            heapify(0);
	        }
	    }

}
