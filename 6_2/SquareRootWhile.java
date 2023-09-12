import java.util.Scanner;

public class SquareRootWhile {
    public static void main(String args[])
    {
    System.out.print("Type a non-negative integer: ");
     Scanner console = new Scanner(System.in);
	int number = console.nextInt();
    double sq ;
    while (number < 0) {
        System.out.println("invalid number, try agin");
       number = console.nextInt();

    }
    sq = Math.sqrt(number); 
    System.out.println("The Square root is of " + number+ " is " + sq);
    console.close();

   
    }
    
}
