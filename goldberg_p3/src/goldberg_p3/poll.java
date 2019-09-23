package goldberg_p3;

import java.util.Scanner;

public class poll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] topics = new String[] {"sports", "books", "video games", "movies", "television" };
		int[][] responses = new int[5][10];
		int i, j = 0, max, sum = 0, min, avg, input, totalUsers = 0, totalS, totalB, totalV, totalM, totalT;
		
		System.out.println("In this program you will be presented with topics regarding entertainment. When propted, please indicate the importance of the topic to you by inputting a 1 -10. 1 being the least inportant and 10 being the most.");
		//System.out.println(topics.length);
		
		while (j < 10) {
			
			
			
				
			for (i = 0; i < topics.length; i++) {
					
				System.out.println("How important are " + topics[i] + " to you?");
				responses[i][j] = sc.nextInt();
							
			}
				
			
			System.out.println("Would you like to run through the survey again? If yes, press 1. If no, press 2.");
			input = sc.nextInt();
			
			if (input == 1) j++; 
			if (input == 2) {
				totalUsers = j;
				for (i = 0; i < totalUsers; i++) {
					
					for (j = 0; j < 10; j++) {
						
						sum += responses[i][j];
						
					}
					
				}
				System.out.println("We will now output the results: \n");
				avg = sum / totalUsers;
				System.out.println(avg);
				
				break;
			}
			
		}
		sc.close();
		
	}

}
