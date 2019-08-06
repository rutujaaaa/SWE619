import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import java.util.ArrayList;



public class BoundedQueueTest {
	
    @Test
    public void testput() {
        BoundedQueue<String> bq = new BoundedQueue<>(5);
        bq.put("bat");
        assertEquals(bq.get(),"bat");
    }
    
    @Test
    public void testget() {
    	 BoundedQueue<String> bq = new BoundedQueue<>(5);
         bq.put("cat");
         assertEquals(bq.get(),"cat");
    }
    @Test
    public void testgetAll() {
    	 BoundedQueue<String> bq = new BoundedQueue<>(5);
    	 List<String> expected = Arrays.asList("ball", "bat", "cat");
    	 bq.put("ball");
    	 bq.put("bat");
         bq.put("cat");
        // BoundedQueue<String> bq1 = new BoundedQueue<>(5);
         assertEquals(expected, bq.getAll());
//         assertThat(bq.getAll(),expected);
    }
    @Test
    public void testputAll() {
    	BoundedQueue<String> bq = new BoundedQueue<>(3);
    	List<String> original =new ArrayList<>();
    	
    	original.add("ball");
    	original.add("bat");
    	original.add("cat");
    	bq.putAll(original);
    	System.out.println(original);
    	System.out.println(bq.getAll());
//    	assertEquals(original,bq.getAll());
    }
    
}