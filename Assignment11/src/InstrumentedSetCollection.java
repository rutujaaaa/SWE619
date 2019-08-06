import java.util.Collection;
/**
 * 
 * Contribution
 * Anchal, Rutuja, Maleeha
 * 
 * 
 * 
 */
public class InstrumentedSetCollection<E> extends ForwardingSetCollection<E>{
	private int addCount = 0;
	public InstrumentedSetCollection(Collection<E> s) {super(s);}
	@Override
	public boolean add(E e) {
		addCount++; 
		return super.add(e);
	}
	public int getAddCount() {
		return addCount;
	}
}
