import java.util.Scanner;

public class ComputeSum {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a number (-1 to quit): ");
        int num = console.nextInt();
        int i = 1;
        while (num != -1 && i<10) {
            i++;
            sum = sum + num;
            System.out.println("Enter a number (-1 to quit): ");
            num = console.nextInt();
        }//end while
        System.out.println("The sum is " + sum);
        console.close();
       

    }
}
