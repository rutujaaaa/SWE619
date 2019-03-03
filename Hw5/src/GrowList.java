/*
 * Contributors: Rutuja, Anchal, Maleeha
 * 
 * 
 * Statement on contribution:
 * Maleeha and Anchal worked on Junit test cases and
 * Maleeha and Rutuja worked on implementing the Iterator and fixing up 
 * the issues while implementing it.
 * 
 * 
 * 
 */


import java.util.*;
//  GrowList is a mutable list that only gets longer.
public class GrowList <E> implements Iterable<E>{

	private Map<Integer,E> values;

	public GrowList() { values = new HashMap<Integer,E>();}

	/* Effects:Add to the end of the list
	 * Creates a new list and adds o to that list
	 */

	public void add(E o) {
		values.put(size(), o);
	}

	// Efects:number of values in list
	public int size() { return values.size(); }

	// get ith value in list
	public E get(int i) { 
		if (! inRange(i)) throw new IndexOutOfBoundsException("GrowList.get");
		return values.get(i);
	}

	// update ith value in list;  return previous value or null if none
	public E set(int i, E o) {
		if (! inRange(i)) throw new IndexOutOfBoundsException("GrowList.set");
		return values.put(i, o);
	}

	// private helper method
	private boolean inRange(int i) { return (i >= 0) && (i < size()); }

	public String toString() {
		if (size() == 0) return "[]";
		String result = "[";
		for (int i = 0; i < size()-1; i++) {
			result += values.get(i) + ",";
		}
		return result + values.get(size() - 1) + "]";
	}
	//@Override
	private class growListIterator implements java.util.Iterator<E>{

		private int i;

		@Override
		public boolean hasNext() {

			// Check if the current element is the last in the array
			return (i < values.size());
		}  

		@Override
		public E next() { 
			return  values.get(i);
		}
		//Using the inbuilt implementation of remove() from the iterartor 
		
		
		/*    @Override
    public void remove(){
      throw new UnsupportedOperationException("Elements in growlist can't be removed");
    }*/
	}
	@Override
	public java.util.Iterator<E> iterator(){
		return new growListIterator();
	}

	public static void main(String[] args) {
		GrowList<String> list = new GrowList<String>();

		System.out.println("list is:" + list);
		list.add("cat");
		System.out.println("list is:" + list);
		list.add("dog");
		System.out.println("list is:" + list);
		list.set(1,"bat");
		System.out.println("list is:" + list);

	}
}