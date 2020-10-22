
public class Main {

	public static void main(String[] args) {
	//print value
		for(int i=1;i<=100;i++)
	  {
        System.out.println(FizzBzz(i));
	  }
	}
//to check conditions (divisible by 3/5/3*5)
	public static String FizzBzz(int i) {
	
		
			 if(i% (3*5) == 0)
		{
			return "fizzbuzz";
		}
		
		if(i%3==0)
		{
			return "fizz";
		}
		if(i%5==0)
		{
			return "buzz";
		}
		
		
		
		return Integer.toString(i);//returns result in string format
	
	}
}
