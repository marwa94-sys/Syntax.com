package com.syntax.class04;



public class NestedElseIfs {

	public static void main(String[] args) {

		
		/*If student completed a quiz we will check for a score 
		 * if score >90 --> Great job 
		 * if score >80--> well job 
		 * if score >70-->you could have done better 
		 * 
		 * if student did not completed the quia --> not good 
		 * Please do homework
		 * 
		 */
		
		boolean quizCompleted=true;
		 int score =86;
		
		
		if(quizCompleted) {
			System.out.println("Let's check your score");
					if(score>90) {
						System.out.println("Great job, you study a lot ");
					}else if (score>80) {
						System.out.println("Well done");
					}else if (score>70) {
						System.out.println("you coud have done better");
					}else {
						System.out.println("You failed");
					}
		}else {
			System.out.println("Please do your homework");
		}

	}

}
