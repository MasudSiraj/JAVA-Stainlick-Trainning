package trivera.storage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class IntegerTest {

	@Test
	public void testSize() {
		GenericArray<Integer> array = new GenericArray<>();
		int size = array.size();
		assertEquals(0, size);
	}

	@Test
	public void testSize1() {
		GenericArray<Integer> array = new GenericArray<>();
		array.add(1);
		int size = array.size();

		assertEquals(1, size);
	}

	@Test
	public void testSizeAfterRemove() {
		GenericArray<Integer> array = new GenericArray<>();
		array.add(1);
		array.remove(1);
		int size = array.size();

		assertEquals(0, size);
	}

	@Test
	public void testAdd() {
		GenericArray<Integer> array = new GenericArray<>();
		for (int i = 0; i < 100; i++) {
			array.add(1);
		}
		int size = array.size();
		assertEquals(100, size);
	}

	@Test
	public void testGet() {
		GenericArray<Integer> array = new GenericArray<>();
		array.add(1);
		array.add(2);
		Object object0 = array.get(0);
		Object object1 = array.get(1);
		assertEquals(object0, 1);
		assertEquals(object1, 2);
	}

	@Test
	public void testRemove() {
		GenericArray<Integer> array = new GenericArray<>();
		array.add(1);
		array.add(2);
		array.add(2);
		array.add(3);

		array.remove(2);

		int size = array.size();
		assertEquals(2, size);
	}

	@Test
	public void testClear() {
		GenericArray<Integer> array = new GenericArray<>();
		array.add(1);
		array.add(2);
		array.clear();
		int size = array.size();
		assertEquals(0, size);
	}

}
