
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
	
		
		if(i % 5==0)
			return "buzz";
		if(i % 15 == 0)
			return "fizzbuzz";
		else
			return Integer.toString(i);
	
		
		
//		return Integer.toString(i);//returns result in string format
	
	}
}
