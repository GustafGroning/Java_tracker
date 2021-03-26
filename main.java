import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



class myClass {
    static void start_up() {
      System.out.println("Hello! What would you like to do today? \n");
      user_choice();
    }
  
    static void user_choice() {
        Scanner inputScan = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Type \"task\" to start tracking your work \ntype \"stats\" to see your logged time \n");
        String taskChoice = inputScan.next();
        //inputScan.close();
        
     
        if (taskChoice.equals("task")) {
            System.out.println("you chose task!");
            choose_task();
        }
        if (taskChoice.equals("stats")) {
            System.out.println("you chose stats!");

        }// "else" ran even if the condition for "if" was satesfied, removing it until i figure out why.
            
        
    }

    static void choose_task() {
        List<String> categories = new ArrayList<String>();
        categories.add("work");
        categories.add("fun");
        categories.add("waste");
        System.out.println(categories);


        //creates the category list, let's user choose which task to track.
    }

    //user chooses between "task" and "stats"
    
    

  public static void main(String[] args) {
    start_up();
   }
}