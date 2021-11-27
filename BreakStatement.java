package Day11_NestedLoop;

public class BreakStatement {

	public static void main(String[] args) {
		
		for(int b = 1; b < 6; b++) {
		for(int m = 1; m < 6 ; m++) {
			System.out.print(m+" ");
			
			if(b==5) {
				break;
			}
		}
		System.out.println();
		//for(int m = 1; m < 6 ; m++) {
			//System.out.println(m);
		}

	}

}

