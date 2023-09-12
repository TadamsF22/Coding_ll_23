import java.util.Scanner;

public class WatchMovie {

    public static void main(String args[]) {
        System.out.print("Enter the movie ticket price \n");
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        System.out.print("Enter the movie Rating \n");
        int rating = sc.nextInt();

        if ( (price >= 12)&&(rating == 5)){
            System.out.println("i am intrested");

        }
        else{
            System.out.println(" i am not intrested");

        } 


    }
}
