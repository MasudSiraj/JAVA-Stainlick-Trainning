package trivera.storage;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringArrayTest {

    StringArray stringArray = new StringArray();


    @Test
    public void capacity() {

        assertEquals(5, stringArray.capacity());
        stringArray.add("Scott");
        assertEquals(4, stringArray.capacity());
    }

    @Test
    public void size() {
        assertEquals(0, stringArray.size());
    }

    @Test
    public void get() {
        stringArray.add("A");
        stringArray.add("B");
        stringArray.add("C");

        assertEquals("B", stringArray.get(1));

    }

    @Test
    public void add_10_items_and_ask_for_size() {
        for(int i=0; i<9;i++)
            stringArray.add("Number-"+i);
        assertEquals(10, stringArray.size());
    }

    @Test
    public void remove() {
    }

    @Test
    public void clear() {
    }
}