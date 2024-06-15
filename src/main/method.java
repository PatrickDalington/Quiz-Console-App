package main;

import java.util.Scanner;

public class method {
	
	static Scanner scan;
	static String answer;
	static String[] quest  = {"Choose fruit from the following?", 
								"Who is the president of Nigeria?", 
								"What is the capital of France?"};
	
	// 2D [][] ={ {1, 2, 3, 4}, {4, 5, 6}, {7, 8, 9} }
	static String[][] ans  = {
								{"Cake", "Rice", "Orange"}, 
								{"Bola Tinubu", "Micheal Jackson", "Peter Obi"},
								{"Rome", "Jamiaca", "Paris"}
							
							};
	
	
	static char[] correctAns  = {'C', 'A', 'C'};

	public static void main(String[] args) {
		
	
		// Call your generateQuestions method here...
		//generateQuestions(quest);
		
		// Populate answer space
		generateQuestions(quest, ans, "", correctAns);
	
	}
	

	
	
	static void generateQuestions(String[] question, String[][] ans, String userAns, char[] correctAns) {
		scan = new Scanner(System.in);
		char[] opt = {'A', 'B', 'C'};
		int counter = 0;
		int y;
		int totalNumOfQuestion = question.length;
		int score = 0;
		
		MAIN:while(true) {
			
			
			try {
				for (int x = 0; x < totalNumOfQuestion; x++)
				{
					
					if (counter != totalNumOfQuestion) {
						

						System.out.println((x+1) + ". " + question[x] + "\n");
						
						
						for (y = 0; y < ans.length; y++)
						{
							
							System.out.println((opt[y]) + ". " + ans[x][y]);
							
						}
						
						userAns = scan.next();
						boolean correct = checkAns(correctAns, userAns, x);
					
						if (correct) {
							score += 1;
							System.out.println("You are right ✅\n\n");
						}else {
							System.out.println("You are wrong ❌\n\n");
						}
						
						
						
					}else {
						
						if (score < 2) {
							System.out.print("\n\nYou score " + score + " out of " + totalNumOfQuestion + " questions. 😡");
							break MAIN;
						}else {
							System.out.print("\n\nYou score " + score + " out of " + totalNumOfQuestion + " questions. 🤗");
							break MAIN;
						}
						
					}
						
					counter++;
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println("Your quiz is ended");
				break MAIN;
			}
		}
		
	 }
	
	static boolean checkAns(char[] a, String answer, int questionIndex)
	{
		
		//C  ==> c
			if (answer.toString().trim().toLowerCase().equals(String.valueOf(a[questionIndex]).toLowerCase())) {
				
				return true;
			}else {
				return false;
			}
		
		
	}
	static boolean getAnswer(String answer, String[] answers) {
		
		if (answer == answers[0])
		{
			return true;
		}
		
		return false;
	}

}
