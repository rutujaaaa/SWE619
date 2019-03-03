import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

class GrowListTest {
	private GrowList<String> list = new GrowList();

	@Test
	public void hasNextTest() {
		Iterator<String> it = list.iterator();

		assertFalse(it.hasNext());    
		list.add("cat");
		assertTrue(it.hasNext());
	}

	@Test
	public void nextTest() {
		Iterator<String> it = list.iterator();
		list.add("cat");
		assertEquals(it.next(),"cat");
	}

	@Test
	public void removeTest() {
		Iterator<String> it = list.iterator();
		list.add("cat");
		assertThrows(UnsupportedOperationException.class, ()-> it.remove());
	}


}
