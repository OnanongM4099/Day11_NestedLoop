package Day11_NestedLoop;

import java.util.Scanner;

public class Timer {

	public static void main(String[] args) throws InterruptedException {
		
		//for(int j = 59 ; j >= 0 ; j--) {
			//System.out.println(j);
		//}
		
		//for(int i = 2-1 ; i > 0 ; i--) {
		//System.out.println("Hello"); 
		//}
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println(" Boonggggggg  ");

	
	for(int i = scan.nextInt() - 1; i >= 0 ; i--) {
		//System.out.println(i + " minute");//1 minute
    
	for(int m = 59 ; m > 0 ; m--) {
			System.out.println(m + " minute "+m +"second");	//print 59 - 0 second
			Thread.sleep(1000);//set times 1 minute
			
	}
	}
    scan.close(); 
    }

}
