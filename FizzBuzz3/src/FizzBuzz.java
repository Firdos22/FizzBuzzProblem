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
	
	//TestCase2 returns fizz if number divisible by 3
	
	@Test
	public void testFizzBuzzThtReturn3()
	{
		String result = Main.FizzBzz(3);
		assertEquals("fizz",result);
	}
	
	//TestCase3 returns 2 
	
	@Test
	public void testFizzBuzzThtReturn2()
	{
		String result = Main.FizzBzz(2);
		assertEquals("2",result);
	}
   
	//TestCase4 returns fizz if number divisible by 3
	
	@Test
	public void testFizzBuzzThtReturnFizz()
	{
		String result = Main.FizzBzz(3);
		assertEquals("fizz",result);
	}
	
	//TestCase5 returns buzz if number divisible by 5
	
	@Test
	public void testFizzBuzzThtReturn10()
	{
		String result = Main.FizzBzz(10);
		assertEquals("buzz",result);
	}
	
	//TestCase6 returns fizzbuzz if number divisible by 3*5
	
	@Test
	public void testFizzBuzzThtReturn15()
	{
		String result = Main.FizzBzz(15);
		assertEquals("fizzbuzz",result);
	}
	
	
	
}
