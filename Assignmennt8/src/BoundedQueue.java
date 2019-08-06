
import java.util.List;
import java.util.ArrayList;


public class BoundedQueue <E>{
	private List<E> rep;
	private int size;
	public BoundedQueue(int length) {
		size = length;
		rep = new ArrayList<E>(length);
	}
	public int count()
	{
		int k =0;
		for(E i:rep)
		{
			if (i != null) {
				k++;
			}
		}
		return k;
	}
	public boolean isFull() {
		if(count() == size)
			return true;
		else
			return false;

	}
	public boolean isEmpty()
	{
		if(count()==0)
			return true;
		else
			return false;
	}
	public void put(E e)
	{
		if(e != null && !isFull() ) 
			rep.add(e);
		else
			throw new IllegalArgumentException("No element");

	}

	public int size()
	{
		return rep.size();
	}

	public E get() {
		if(!isEmpty())
		{
			E result = null;
			result = rep.get(0);
			rep.remove(0);
			return result;
		}
		else
			throw new IllegalArgumentException("No element");
	}

	public void putAll(List<E> al)
	{
		if(al.size()<=size())
			rep.addAll(al);
		else
			throw new IllegalArgumentException("Different size");
	}
	public List<E> getAll()
	{
		List<E> ll = new ArrayList<E>();
		ll.addAll(rep);
		rep.clear();
		return ll;
	}

	public boolean repOk() {
		
		for (E elem: rep) {
			if (elem == null) {
				return false;
			}
		} 
		
		if (count() > size) {
			return false;
		}
		
		return true;
		
	}

}


