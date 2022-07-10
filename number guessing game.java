package guess_the_number_game;

import java.util.*;

public class game {

	public static void main(String[] args) {
		int winning_number=(int)(Math.random()*100);
		Scanner s = new Scanner(System.in);
		int user_number=0;
		
		do {
			System.out.println("please enter the winning number(0-100)");
			user_number=s.nextInt();
			
			if (user_number==winning_number) {
				System.out.println("yes! your the winner");
			    break;
			}
		    else if (user_number>winning_number) {
	
				System.out.println("your number is larger then the winning number");
				
		    }
			else {
			    System.out.println("your number is smaller then the winning number");
			    
			}
					
		}
		while (user_number>=0);
		

	}

}
