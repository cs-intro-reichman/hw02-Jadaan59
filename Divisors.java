public class Divisors { 
	public static void main (String[] args) {

		int a = Integer.parseInt(args[0]);
		int i = 1;
		while (i <= a){
			if (a % i == 0){
				System.out.println(i);
			}
	         	i++;
		}
	}	
}
