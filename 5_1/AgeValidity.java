import java.util.Scanner;

public class AgeValidity {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your age: ");
    int age = sc.nextInt();
    boolean drivingunderage = age >= 18;
    System.out.println(drivingunderage);


    sc.close();
       
    }
}
