/*Contributors: Rutuja, Anchal, Maleeha
 * Statement on contribution:
 * Rutuja and Anchal updated the GrowList methods and created
 * the junit tests. Maleeha fixed a few errors with the tests and
 * the Growlist methods and cleaned up the code
 * 
 * 
 * Note: the constructor is private to make Growlist immutable.
 * This implementation detail prevents the constructor from
 * being called in the associated junit tests. 
 * In order to run the tests, please make the constructor public
 */

import java.util.*;
public class GrowList<E> {

	private Map<Integer,E> values;

	private GrowList() { 
		values = new HashMap<Integer,E>();
		}

	/* Effects:Add to the end of the list
	 * Creates a new list and adds o to that list
	 */

	public GrowList<E> add(E o) {
		GrowList<E> g = new GrowList<E>();
		if(this.size() == 0){
			g.values.put(0, o);
		}
		else {
			for(int i = 0; i < this.size(); i++){
				g.values.put(i, this.values.get(i));
			}
			g.values.put(this.size(), o);
		}
		return g;
	}


	// Efects:number of values in list
	public int size() { 
		return values.size();
	}

	//Observer in the piblic API
	//Effects: get ith value in list or else throws IOOBE if not inRange
	public E get(int i) { 
		if (! inRange(i)) throw new IndexOutOfBoundsException("GrowList.get");
		return values.get(i);
	}

	// Effects:update ith value in list;  return previous value or null if none
	public GrowList<E> set(int i, E o) {
		if (! inRange(i)) throw new IndexOutOfBoundsException("GrowList.set");
		GrowList<E> g = new GrowList<E>();
		for(int j = 0; j < this.size(); j++){
			if(j== i)
				g.values.put(j, o);
			else
				g.values.put(j, values.get(j));
		}
		return g;
	}

	// private helper methods
	private boolean inRange(int i) { return (i >= 0) && (i < this.size()); }

	public String toString() {
		if (size() == 0) return "[]";
		String result = "[";
		for (int i = 0; i < size()-1; i++) {
			result += values.get(i) + ",";
		}
		return result + values.get(size() - 1) + "]";
	}
	public static void main(String[] args) {
		GrowList<String> list = new GrowList<String>();

		System.out.println("list is:" + list);
		list = list.add("cat");
		System.out.println("list is:" + list);
		list = list.add("dog");
		System.out.println("list is:" + list);
		list = list.set(1,"bat");
		System.out.println("list is:" + list);

	}

}
