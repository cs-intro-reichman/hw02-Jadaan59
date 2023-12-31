/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int N = Integer.parseInt(args[0]);
		int J = 0;

			for ( int i = 1 ; i <= N; i++){
				if(N % i == 0){
					J=J+i;
				}else{
					J = J + 0;
				}		
			}
			if (J - N == N){
				System.out.print(N + " is a perfect number since " + N + " = 1");
				for (int D = 2; D < N; D++){
					if (N % D == 0){
						System.out.print(" + " + D);
					} 
				}
					System.out.println();	
				
			}else{
				System.out.print(N + " is not a perfect number");
			}
		}
}
