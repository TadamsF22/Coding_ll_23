import java.util.*;





public class NameMaker {
   
    public static void main(String args[])
    {
          String firstName;
          String middleName;
          String lastName;
       Scanner sc = new Scanner(System.in);
       System.out.println("Type your first name: ");
       firstName = sc.next();
        System.out.println("Type your middle name: ");
       middleName = sc.next();
        System.out.println("Type your last name: ");
       lastName = sc.next();
       System.out.println(firstName + middleName + lastName);
       
       sc.close();
      
    }
    
}
