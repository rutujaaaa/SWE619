
public interface Indexer<E> {
	public static <E> int search(Indexer<E> c, E x) {
		return c.search(x);
	}

	<E> int search(E x);
	
}
