
import java.util.Scanner;



class myClass {
    static void start_up() {
      System.out.println("Hello! What would you like to do today? \n");
      user_choice();
    }
  
    static void user_choice() {
        Scanner inputScan = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Type \"task\" to start tracking your work \ntype \"stats\" to see your logged time");
        String taskChoice = inputScan.next();
        if (!taskChoice.equals("task") && !taskChoice.equals("stats"))  {
            System.out.println("illegal input, please try again! \n");
            user_choice();
        }
        if (taskChoice.equals("task")) {
            System.out.println("you chose task!");
        }
        if (taskChoice.equals("stats")) {
            System.out.println("you chose stats!");
        }
        
    }

    //user chooses between "task" and "stats"
    
    

  public static void main(String[] args) {
    start_up();
   }
}