package com.bowlingScorer;

public class Scorer {
	
	public static int[] scores = {1,4,4,5,6,4,5,5,10,0,0,1,7,3,6,4,10,0,2,8,6};

	public static void main(String[] args) {
		
		int frame;
		int result = 0;
		
		for (int index = 0; index < scores.length -1; index+=2) {
			
			frame = 0;
			
			System.out.println("frame: " + scores[index] + " " + scores[index + 1]);
			
			frame= scores[index] + scores[index+1];
			
			// check if strike
			if (scores[index] == 10) {
				System.out.println("Strike");
				result += 10 + scores[index+2] + scores[index+3];
				System.out.println("Score: " + result + "\n");
			}
			// check if spare
			else if(frame == 10) {
				System.out.println("Spare");
				result += 10 + scores[index+2];
				System.out.println("Score: " + result + "\n");
			}
			else { 
				System.out.println(frame);
				result += frame;
				System.out.println("Score: " + result + "\n");
			}
				
		}
		
		System.out.println("Total score: " + result);
	}

}
