package quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
		private String topic;
		private List<Question> questions;

	      public Quiz(String topic){            // using array to store questions
	                this.topic=topic;
	                questions=new ArrayList<>();
	      }
	        public void  addquestion(Question question){ // method to add question
	                questions.add(question);
	        }

	        public void start(){   // method to start quiz
	                System.out.println("Welcome to the "+ topic+" Quiz!\n");
	                        int score=0;  // count score
	                Scanner sc=new Scanner(System.in); // taking input from user
	                for(Question question:questions){ //forcah loop to itrate every question in quiz
	                        System.out.println(question.getQuestion());
	                for(int i=0;i<question.getOptions().size();i++){ // to display multipe options for each question
	                        System.out.println((i+1)+ " " +question.getOptions().get(i));
	                }
	                System.out.println("Your Answer:");
	                int userans=sc.nextInt(); // taking user answer
	                if(question.iscorrect(userans-1)){ // user answer is correct so update the score
	                        System.out.println("Correct!");
	                        score++;
	                }else{
	                        System.out.println("Incorrect Answer!");
	                        System.out.println("Correct answer:"+question.getOptions().get(question.getcorrectAnsInd()));
	                }
	                System.out.println();
	                }
	                //quiz completion with score and feedback
	                System.out.println("Quiz Completed!\n Your Score:"+score+"/"+questions.size());
	                double perc=((double) score / questions.size())*100;
	                        System.out.println("Percentage:"+perc+"%");
	                        if(perc>=70){
	                        	 System.out.println("Congratulation!");
	                        }else{
	                                System.out.println("Better Luck Next Time!");
	                        }
	                }

}
