
import java.util.Scanner;

//create the OverrangeException class

public class OverrangeException extends Exception {

	//create constructor
	
     public OverrangeException(String s)
   {
	super(s);
   }

}

public class TestOverrangeException {  // Declare public class 

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		//Accept Input as Total run and Faced Over
		
		System.out.println("Enter Total Runs:");
		float total_run =sc.nextFloat();
		
		System.out.println("Enter faced overs:");
		float faced_overs =sc.nextFloat();
		
		
		
		try {                                                  
			float run_rate=0;	
			if(faced_overs>0 && faced_overs<=20)
			{
				run_rate=total_run/faced_overs;                     
				System.out.println("Run Rate is:"+run_rate);
			}

			else {
				throw new OverrangeException ("Over is not in 1 to 20 range");     
			}
		}
			catch(OverrangeException e1)                                       
		{
				System.out.println("caught exception");
				System.out.println(e1.getMessage());                        
		}
			
		}
	
}



