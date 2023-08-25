import java.util.Scanner;
class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner sc = new Scanner(System.in);
        //Find and print the sum of three integers entered by the user
        
       int total = sc.nextInt() + sc.nextInt() + sc.nextInt() ;
        System.out.println("total:"+total);

        
        //Remember to close the Scanner
        sc.close();
    }
}
