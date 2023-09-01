
import java.util.Scanner;


public class ComputeBMI {
    public static void main(String[] args)
	{
        Scanner numberScanner = new Scanner(System.in);
        System.out.print("Enter your weight: ");
        int weight = numberScanner.nextInt();
         System.out.print("Enter your height in inches: ");
        double height = numberScanner.nextInt();
        
        
        
         numberScanner.close();
          double BMI =(weight/(height*height))*703;
        System.out.println(BMI);
        
        }
}
