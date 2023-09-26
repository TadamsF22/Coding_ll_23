import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int pass = 7098;
        System.out.println("Enter a your pin : ");
        int num = console.nextInt();
        
        while (num != pass) {
           
            System.out.println("reenter your pin : ");
            num = console.nextInt();
        }//end while
        System.out.println("your in lol " );
        console.close();
        
    }
}
