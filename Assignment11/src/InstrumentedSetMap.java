import java.util.HashMap;

public class InstrumentedSetMap<K,V> extends ForwardingSetMap<K,V> {
	public InstrumentedSetMap(HashMap<K, V> s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	private int addCount = 0;
	public int getAddCount() {return addCount;}
}