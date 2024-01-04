import java.util.Random;
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender
 * now with average
 */
public class OneOfEachStats {
	public static void main (String[] args) {
	
		double T = Double.parseDouble(args[0]);
		int seed = Integer.parseInt(args[1]);
        double average = 0.0;
        int FamilyWith2 = 0;
        int FamilyWith3 = 0;
        int FamilyWith4 = 0;
		Random generator = new Random(seed);


		    for (int i = 0; i < T; i++)
		   {
            double counter = 0;
            double boy = 0;
		    double girl = 0;
           

		        while (boy == 0 || girl == 0)
	        	{
			    double random = generator.nextDouble();
			    if (random < 0.5){	
				    girl++;

			    }else{
				    boy++;
			    }
				 counter++;
	            }
                 if (counter == 2){ FamilyWith2++;}
                 else if (counter == 3){FamilyWith3++;}
                 else{FamilyWith4++;}
             average += counter;
        	}
        System.out.println("Average: " + average / T + " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + FamilyWith2);
        System.out.println("Number of families with 3 children: " + FamilyWith3);
        System.out.println("Number of families with 4 or more children: " + FamilyWith4);

		if (FamilyWith2 > FamilyWith3 && FamilyWith2 > FamilyWith4)
			{System.out.println("The most common number of children is 2.");}    
        else if (FamilyWith3 > FamilyWith2 && FamilyWith3 > FamilyWith4)
			{System.out.println("The most common number of children is 3.");}
        else if (FamilyWith4 > FamilyWith2 && FamilyWith4 > FamilyWith3)
			{System.out.println("The most common number of children is 4 or more.");}
	}
}

