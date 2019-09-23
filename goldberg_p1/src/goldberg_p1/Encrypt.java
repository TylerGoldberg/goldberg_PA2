package goldberg_p1;

import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int userInput, int1, int2, int3, int4;
		int temp, enc1, enc2, enc3, enc4, encFinal;
		
		System.out.println("Enter a 4 digit integer to be encrypted: ");
		userInput = sc.nextInt();
		
		//seperate individual digits
		int4 = (userInput % 10);
		int3 = (userInput % 100) / 10;
		int2 = (userInput % 1000) / 100;
		int1 = (userInput % 10000) / 1000;
		//System.out.println(int1 + " " + int2 + " " + int3 + " " + int4);
		
		//encrypt digits
		enc1 = (int1 + 7);
		if (enc1 > 9) enc1 %= 10;
		
		enc2 = (int2 + 7);
		if (enc2 > 9) enc2 %= 10;
		
		enc3 = (int3 + 7);
		if (enc3 > 9) enc3 %= 10;
		
		enc4 = (int4 + 7);
		if (enc4 > 9) enc4 %= 10;
		
		//reorganize digits
		temp = enc1;
		enc1 = enc3;
		enc3 = temp;
		
		temp = enc2;
		enc2 = enc4;
		enc4 = temp;
		
		System.out.println("Encrypted number: \n" + enc1 + enc2 + enc3  + enc4);
		
		
		
	}

}
