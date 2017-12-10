package stack;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class ThreeStacksTest {
	
	ThreeStacks threeStacks;

	@Before
	public void setUp() throws Exception {
		threeStacks = new ThreeStacks(10);
	}

	@Test
	public void testPush() {
		for(int i = 0; i < threeStacks.getStackSize(); i++){
			threeStacks.push(0, 20);
		}
		assertEquals(threeStacks.isFull(0), true);
		
		threeStacks.push(1, 20);
		threeStacks.push(1, 30);
		threeStacks.push(1, 40);
		assertEquals(threeStacks.isFull(1), false);
		
		assertEquals(threeStacks.isEmpty(2), true);
		
		threeStacks.push(2, 40);
		assertEquals(threeStacks.isFull(2), false);
	}

	@Test
	public void testPop() {
		threeStacks.push(1, 20);
		threeStacks.push(1, 30);
		threeStacks.push(1, 40);
		threeStacks.push(1, 20);
		threeStacks.push(1, 30);
		threeStacks.push(1, 40);
		int popped = threeStacks.pop(1);
		assertEquals(40, popped);
		popped = threeStacks.pop(1);
		assertEquals(30, popped);
		popped = threeStacks.pop(1);
		assertEquals(20, popped);
		
		assertEquals(threeStacks.isEmpty(1), false);
		
		threeStacks.pop(1);
		threeStacks.pop(1);
		threeStacks.pop(1);
		
		assertEquals(threeStacks.isEmpty(1), true);
	}

	@Test
	public void testIsEmpty() {
		assertEquals(threeStacks.isEmpty(0), true);
		assertEquals(threeStacks.isEmpty(1), true);
		assertEquals(threeStacks.isEmpty(2), true);
	}
	
	@Test
	public void testIsFull() {
		assertEquals(threeStacks.isFull(0), false);
		assertEquals(threeStacks.isFull(1), false);
		assertEquals(threeStacks.isFull(2), false);
		
		for(int i = 0; i < threeStacks.getStackSize(); i++){
			threeStacks.push(0, 20);
		}
		assertEquals(threeStacks.isFull(0), true);
	}

}
