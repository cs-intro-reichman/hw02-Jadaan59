
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
	
		
		double boy = 0;
		double girl = 0;
		int counter = 0;

		while (boy == 0 || girl == 0)
		{
			double random = Math.random();
			if (random < 0.5){
				System.out.print( "g " );
				girl++;
			}else{
				System.out.print( "b " );
				boy++;
			}
				counter++;
		}
		System.out.println();
		System.out.print( "you made it ... and you have " + counter + " children");
	}
}

