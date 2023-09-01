import java.util.Scanner;


public class ProcessName {
    
    
public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String iname = console.nextLine();
        int spaceIdx = iname.indexOf(" ");
        System.out.println( "your name is: "+ iname.substring(spaceIdx)+" " + iname.charAt(0)+".");


        
        // your code goes here
        
        console.close();
    }
}