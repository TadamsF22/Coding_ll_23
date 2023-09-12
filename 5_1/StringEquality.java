import java.util.Scanner;
public class StringEquality {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   String name = sc.nextLine();

   if (name.equals("Moe")){
    System.out.println("your the king of rock and roll");

   }
   else {
    System.out.println("you are not the king");
   }
   sc.close();
}
}

