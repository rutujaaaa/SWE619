import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ListIndexerTest {

    @Test
    public void elementFoundInTheListTest() {

        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("cat");
        list.add("bat");

        Indexer<String> listIndexer = new ListIndexer<>(list);
        assertEquals(Indexer.search(listIndexer, "bat"),2);
    }
    @Test
    public void testWhenElementNotPresent() {

        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("cat");
        list.add("bat");
        Indexer<String> listIndexer = new ListIndexer<>(list);
        assertThrows(NoSuchElementException.class, ()-> Indexer.search(listIndexer, "rat"));
    }

    @Test
    public void testNull() {

        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add(null);
        list.add("cat");
        list.add("bat");
        

        Indexer<String> listIndexer = new ListIndexer<>(list);
        assertThrows(NullPointerException.class, ()-> Indexer.search(listIndexer, null));
       // assertThrows(()->Indexer.search(listIndexer, null),NullPointerException.class);
    }

}
