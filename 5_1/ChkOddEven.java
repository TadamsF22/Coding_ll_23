import java.util.Scanner;

public class ChkOddEven {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Enter a number:");
        num = in.nextInt();
        if( num % 2 == 0 ){
            System.out.println("yes");
 

        }
        else{
            System.out.println("no");
        }

        in.close();
        
    }
}
