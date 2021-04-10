import java.util.Comparator;
/**
 * payComparator used to compare two employees names
 * @author Abhrajit Ghosh
 *
 * @param <T>
 */
public class nameComparator<T> implements Comparator<T>{

	@Override
	public int compare(T arg0, T arg1) {
		try {
		return ((Employee) arg0).getName().compareTo(((Employee) arg1).getName());
		}
		catch(Exception e) {
			
		}
		return 22;
	}
	
}
