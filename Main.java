import java.util.Scanner;
/**
 * Searches for a integer out of 10 inserted integers
 * @jacoe0850 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //make scanner for input
    Scanner input = new Scanner(System.in);
    // ask for 10 integers
    System.out.println("Please enter in 10 integers to put into the array");
    // array variable of 10
     int[] nums = new int[10];
     // for loop so user can input 10 integers
     for(int i = 0; i < nums.length; i++){
       nums[i] = input.nextInt();
  }
  // asking for number to find
  System.out.println("Please enter a number to find");
  // variable for specific number to find
  int search = input.nextInt();
  // for loop that finds it
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == search){
      // tells user where number is
System.out.println(search + " is located at index " + (i+1));
    }
  }
}
}
