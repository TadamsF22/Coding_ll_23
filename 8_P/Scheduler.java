import java.util.ArrayList;
import java.util.Scanner;

public class Scheduler {
    boolean seasonend = false;
    int endc = 0;
    int i = 0;
    public static ArrayList<Games> games = new ArrayList<Games>();
    public void scheduler(){
        while(seasonend == false){
            i++;
            if (endc==3){
                seasonend =true;
            }
         Scanner sc = new Scanner(System.in);
            int temp = sc.nextInt();
            if(temp<=32){
            endc++;

         }else{
            endc= 0;
         }
         Games gamI = new Games(0,0);


        }



    }
    
}
