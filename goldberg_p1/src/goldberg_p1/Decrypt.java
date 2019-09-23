package goldberg_p1;

import java.util.Scanner;

public class Decrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int userInput, int1, int2, int3, int4;
		int temp, dec1, dec2, dec3, dec4, decFinal;
		
		System.out.println("Enter a 4 digit integer to be decrypted: ");
		userInput = sc.nextInt();
		
		//seperate individual digits
		int4 = (userInput % 10);
		int3 = (userInput % 100) / 10;
		int2 = (userInput % 1000) / 100;
		int1 = (userInput % 10000) / 1000;
		//System.out.println(int1 + " " + int2 + " " + int3 + " " + int4);
		
		//decrypt digits
		dec1 = (int1 + 3);
		if (dec1 > 9) dec1 %= 10;
		
		dec2 = (int2 + 3);
		if (dec2 > 9) dec2 %= 10;
		
		dec3 = (int3 + 3);
		if (dec3 > 9) dec3 %= 10;
		
		dec4 = (int4 + 3);
		if (dec4 > 9) dec4 %= 10;
		
		//reorganize digits
		temp = dec1;
		dec1 = dec3;
		dec3 = temp;
		
		temp = dec2;
		dec2 = dec4;
		dec4 = temp;
		
		

		

		System.out.println("Decrypted number: \n" + dec1 + dec2 + dec3  + dec4);
		
		
		
	}

}
