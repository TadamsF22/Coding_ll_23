import java.util.Random;
import java.util.Scanner;
public class RockPaperScissor {
public static void main(String[] args) {
    
Scanner numberScanner = new Scanner(System.in);
System.out.print("Enter a number between 0 and 3: ");
int userNum = numberScanner.nextInt();
Random rnd = new Random();
int winningNum = rnd.nextInt(3) ;
if (winningNum > userNum) {
    System.out.println("you win");
    System.out.println("Your Number: " + userNum);
System.out.println("The winning number is: " + winningNum);
}
else {
   System.out.println("L bozo you lose"); 
System.out.println("Your Number: " + userNum);
System.out.println("opponet: " + winningNum);
}

 numberScanner.close();
}//end method main 
}//end class RandomNumRange
