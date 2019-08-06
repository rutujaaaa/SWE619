import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

import java.util.Set;

import org.junit.jupiter.api.Test;

class TestClass {
	@Test
	/**
	 * Equals method fails cause of sub typing due to set 
	 * being a sub type of collection
	 */
	public void CollectionTest()
	{
		Set<String> s1 = new HashSet<String>();
		s1.add("bat");
		s1.add("cat");
		InstrumentedSetCollection<String> c1 = new InstrumentedSetCollection<String>(s1);
		Set<String> s2 = new HashSet<String>();
		s2.add("bat");
		s2.add("cat");
		InstrumentedSetCollection<String> c2 = new InstrumentedSetCollection<String>(s2);
		assertFalse(c1.equals(c2));
	}
	/*@Test
public void ListTest()
{
	List<String> c1 = new LinkedList<String>();
	c1.add("bat");
	c1.add("cat");
	InstrumentedSetList <String> l = new InstrumentedSetList<>(c1);
	List<String> c2 = new LinkedList<String>();
	c2.add("bat");
	c2.add("cat");
	InstrumentedSetList <String> l1 = new InstrumentedSetList<>(c2);
	assertTrue(l.equals(l1));

}
@Test
public void MapTest()
{
	HashMap<Integer,String> c1 = new HashMap<Integer,String>();
	c1.put(1, "cat");
	c1.put(2,"bat");
	InstrumentedSetMap<Integer,String> m = new InstrumentedSetMap<>(c1);
	HashMap<Integer,String> c2 = new HashMap<Integer,String>();
	c2.put(1,"cat");
	c2.put(2,"bat");
	InstrumentedSetMap<Integer,String> m1 = new InstrumentedSetMap<>(c2);
	assertTrue(m.equals(m1));
}*/
}
