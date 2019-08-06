/**
 * 
 * 
 */
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Vector;
public class ListIndexer<E extends String> implements Indexer<E> {

	private List<E> listElements;
	public ListIndexer(List<E> listElements) {
		super();
		this.listElements = listElements;
	}
	@Override
	public <E> int search(E x) {
		if(x == null)
			throw new NullPointerException();
		else {
			int searchIndex = listElements.indexOf(x);
			if(searchIndex == -1) {
				throw new NoSuchElementException();
			}
			else
				return searchIndex;
		}
	}
public int size() {
	return listElements.size();
}
}
