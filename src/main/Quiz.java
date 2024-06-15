package main;

import java.util.Scanner;

public class Quiz {
	
	// Array for questions
	static String[] question = {"Who is the president of Nigeria?", 
								"What are the color of Nigeria flag?", 
								"Which is the capital of Lagos?"};
	
	
	// 2D Array for options
	static String[][] options = {
									{"Bola Hamed", "Funke Ola", "Emmanuel"}, 
									{"Blue, White, Yellow", "Green, White, Green", "Yellow and Black"},
									{"Oshodi", "Adamawa", "Ikeja"}
								
	};
	
	// Array for correctOptions
	static char[] correctAns = {'A', 'B', 'C'};
	
	static Scanner scan;
	

	public static void main(String[] args) {
		

	}
	
	
	
	static void generateQuestions(String[] questions, String[][] options, String userAns, char[] correctAns)
	{
		// Initializing the scanner class
		scan = new Scanner(System.in);
		
		
		// Counter to keep track of questions
		int counter = 0;
		
		// Total number of question
		int totalNumQuestions = questions.length;
		
		// Final score of the quiz
		int score = 0;
		
		
		MAIN: while(true) {
			
			try {
				
				for(int x = 0; x < questions.length; x++)
				{
					
				}
				
				
			}catch(Exception e) {
				
				System.out.println(e.getMessage());
			}
			
		}
		
	}

}










