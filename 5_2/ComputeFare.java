import java.util.Scanner;
public class ComputeFare {

    public static void main(String args[]) {
        System.out.print("Enter the age \n");
        Scanner keyboard = new Scanner(System.in);
        int age = keyboard.nextInt();
        int fare;
         if ( age < 11){
            fare = 3;
        }
        else if ( 65 > age && age > 11 ){
            fare = 6;
        }
        else{

            fare = 3;
        }
        keyboard.close();
        System.out.println(fare);
    }
}
