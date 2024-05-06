package quiz;

import java.util.List;

public class Question {
	private String question;
    private List<String> options;
    private int correctAnsInd;
// constructor to initialize question with options and answer index
    public Question(String question, List<String> options, int correctAnsInd){
    this.question=question;
    this.options=options;
    this.correctAnsInd=correctAnsInd;
    }
    
    public String getQuestion(){//getter method for questions
            return question;
    }
    public int getcorrectAnsInd(){//getter method for answer index
            return correctAnsInd;
    }
    public List<String> getOptions(){ //getter method for options
            return options;
    }
    public boolean iscorrect(int useransInd){ // checking given answer is correct or not
            return useransInd==correctAnsInd;
    }

}
