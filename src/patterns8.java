
public class patterns8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*
	 
*********
 *******
  *****
   ***
    *
   
	 */
		
		
		
		
		
		int rows =5;
		for(int i =rows;i>=1;i--) {
			for(int s=1;s<=(rows-i);s++) {
				System.out.print(" ");
				
			}
			for(int j =1;j<=(2*i-1);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
