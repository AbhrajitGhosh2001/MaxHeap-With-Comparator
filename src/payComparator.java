import java.util.Comparator;
/**
 * payComparator used to compare two employees pay rates
 * @author Abhrajit Ghosh
 *
 * @param <T>
 */
public class payComparator<T> implements Comparator<T>{
	@Override
	public int compare(T arg0, T arg1) {
	
		if(((Employee) arg0).getPay()<((Employee) arg1).getPay()) {
			return -1;
			}
		else if(((Employee) arg0).getPay()>((Employee) arg1).getPay()) {
				return 1;
			}
		else {
				return 0;
			}
	}

}
