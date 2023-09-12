import java.util.Scanner;

public class SwitchEx1 {

    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int month = sc.nextInt();
    String monthis = "";
    
    switch (month){
        case 1 : monthis ="january";
        break;

        case 2 : monthis ="febuary";
        break;

        case 3 : monthis ="march";
        break;

        case 4 : monthis ="april";
        break;

        case 5 : monthis ="may";
        break;

        case 6 : monthis ="june";
        break;

        case 7 : monthis ="july";
        break;

        case 8 : monthis ="august";
        break;

        case 9 : monthis ="september";
        break;

        case 10 : monthis ="october";
        break;

        case 11 : monthis ="november";
        break;

        case 12 : monthis ="december";
        break;

        default : System.out.println("invalad");
    }
    System.out.println(monthis);
    
   sc.close();
    }
}
