package quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quizmain {
	public static void main(String[] args){
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter the topic for the Quiz\n");
        String topic=sc.nextLine(); // taking topic  from user


Quiz quiz=new Quiz(topic); // creating object with input topic 

boolean addQuestions=true;
while(addQuestions){  // to add more question  
        System.out.print("Enter the Question\n");
        String question=sc.nextLine();

List<String> options=new ArrayList<>(); //taking options from user 
        for(int i=0;i<4;i++){
                System.out.print("Enter Options"+(i+1)+" \n");
                options.add(sc.nextLine());
        }
        System.out.print("Enter the option :\n");  // to display correct answer 
        int correctAnsInd=sc.nextInt()-1;
                sc.nextLine();
                quiz.addquestion(new Question(question,options,correctAnsInd));  //creating object with question and option to display 
                System.out.println("Do You want to add more question?(yes/no):\n "); //asking  user to  adding more question or not
                String choice=sc.nextLine().toLowerCase();
                addQuestions=choice.equals("yes");
        }
        quiz.start(); // to start quiz after once all the quetion done
}

}
