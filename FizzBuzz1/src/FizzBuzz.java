import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class FizzBuzz {
	
	//TestCase1 which returns 1 as it is
	
	@Test
	public void testFizzBuzzThtReturn1()
	{
		String result = Main.FizzBzz(1);
		assertEquals("1",result);
	}
	
		
}
