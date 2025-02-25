package QuizConsoleApp;

import java.util.*;
public class QuestionService {
    Question[] questions = new Question[5];
    int[] res = new int[5];
    int[] ans = new int[5];

    public QuestionService(){
        questions[0] = new Question(1, "Which of these is a divide and conquer algorithm?", "Merge Sort", "Bubble Sort", "Selection Sort", "Insertion Sort", 1);
        questions[1] = new Question(2, "What data structure uses LIFO?", "stack", "Linked List", "Queue", "Array", 1);
        questions[2] = new Question(3, "What is the worst case time complexity of a linear search?", "O(1)", "O(n)", "O(n ^ 2)", "O(log n)", 2);
        questions[3] = new Question(4, "Which component is used to compile, debug and execute the java programs?", "JRE", "JIT", "JDK", "JVM",3 );        
        questions[4] = new Question(5, "Which of the following is a superclass of every class in Java?", "ArrayList", "Abstract class", "Object class", "String", 3);
       }
    public void displayQuestions(){
        int i = 0;

        for(Question q: questions){
            System.out.println(q.getId() + ". "+ q.getQuestion());
            System.out.println("[1]." + q.getOpt1());
            System.out.println("[2]." + q.getOpt2());
            System.out.println("[3]." + q.getOpt3());
            System.out.println("[4]." + q.getOpt4());
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter your choice: ");
            int answer = sc.nextInt();
            res[i] = answer;
            ans[i] = q.getAnswer();

            i++;
        }
        
    }

    public void displayScore(){
        int c = 0;
        for(int i = 0; i < 5; i++){
            if(res[i] == ans[i]){
                c++;
            }
        }
        System.out.println("You Scored: " + c + "/5");
    }

    
}
