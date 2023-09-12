import java.util.Scanner;

public class TrafficLightChecker {

    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a color code");
      int color = sc.nextInt();
      if (color == 1){
        System.out.println( "Next Traffic Light is green");
      }
      else if (color == 2){
        System.out.println( "Next Traffic Light is yellow");
      }
       else if (color == 3){
        System.out.println( "Next Traffic Light is red");
      }
      else {
        System.out.println( "Invalid color");
      }
      sc.close();
      }

    
    }


