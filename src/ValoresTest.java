import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import junit.framework.TestCase;

public class ValoresTest extends TestCase {
	
	private Valores val;
	
	protected void setUp() throws Exception {
		
		super.setUp();
		
		val = new Valores();
		val.ins(5);
		val.ins(12);
		val.ins(1);
		val.ins(30);
		val.ins(152);
		val.ins(6);
	}
	
	@Test
	public void testIns() {
		
		assertEquals(false, val.ins(-10));
		assertEquals(false, val.ins(0));
		
		val.ins(2);
		assertEquals(7, val.size().intValue());
		
		val.ins(3);
		assertEquals(8, val.size().intValue());
		
		val.ins(4);
		assertEquals(9, val.size().intValue());
		
		val.ins(5);
		assertEquals(10, val.size().intValue());
		assertEquals(false, val.ins(11)); 
		
	}
	
		public void testDel() {
			
		assertEquals(5, val.del(0).intValue());
		assertNotEquals(6, val.del(4).intValue());
		assertEquals(-1, val.del(4).intValue());
		assertNotEquals(152, val.del(0).intValue());
		assertEquals(-1, val.del(0).intValue());
		
		}
}
