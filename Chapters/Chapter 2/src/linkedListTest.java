import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
/*
 * Collection of unit tests for chapter 2.
 * linkedList.java tests
 * 
 */

public class linkedListTest {

	linkedList L;
	
	
	@Test
	public void creationTest(){
		L = new linkedList('a');
		Assert.assertNotNull(L);
	}
	
	@Test
	public void addToTest(){
		L = new linkedList('a');
		L.addToLinkedList(L, 'b');
		Assert.assertNotNull(L.next);
		Assert.assertEquals('b', L.next.val);
	}
	@Test
	public void getNodeTest(){
		L = new linkedList('a');
		L.addToLinkedList(L, 'b');
		Assert.assertNotNull(L.getNode(L, 1));
		Assert.assertEquals(L.next, L.getNode(L, 1));
	}

	//
}
