import java.util.List;

public class InstrumentedSetList<E> extends FowardingSetList<E>{
	private int addCount = 0;
	public InstrumentedSetList(List<E> s) {super(s);}
	@Override
	public boolean add(E e) {
		addCount++; 
		return super.add(e);
	}
	public int getAddCount() {
		return addCount;
	}

}