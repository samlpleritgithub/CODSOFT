
import java.util.Random;
import java.util.Scanner;

		public class kali {
			public static void 
			main(String[] args)
			{
               int p, q;
				int m = 100;
				Scanner sc= new Scanner(System.in);

				
				Random rand = new Random();
				System.out.println("For Guessing a "
						+ "number you have only 5 attemts");

				int j= 1;
           	    p = rand.nextInt(m) + 1;
                while (j<5) {

					System.out.println(
						"Enter Number Between 1 to 100: ");

					q = sc.nextInt();
					
					if (q> p) {
						System.out.println("It's too high, try again");
					}

					
					else if (q < p) {
						System.out.println("It's too low, try again");
					}

					
					else if(p==q)
					{

						System.out.println(
							"You Guess Correct");

					
					}
				}
				
			}
		}
		
		


